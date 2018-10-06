/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011 - 2017 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.modules.hashdatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import org.sleuthkit.autopsy.coreutils.Logger;
import org.sleuthkit.datamodel.TskCoreException;

/**
 * Parser for Autopsy/TSK-created databases (*.kdb)
 */
public class KdbHashSetParser implements HashSetParser {

    private final String JDBC_DRIVER = "org.sqlite.JDBC"; // NON-NLS
    private final String JDBC_BASE_URI = "jdbc:sqlite:"; // NON-NLS

    private final String filename;        // Name of the input file (saved for logging)
    private final long totalHashes;       // Estimated number of hashes  
    private int totalHashesRead = 0;      // Number of hashes that have been read
    private Connection conn;
    private Statement statement;
    private ResultSet resultSet;

    KdbHashSetParser(String filename) throws TskCoreException {
        this.filename = filename;

        conn = null;
        statement = null;
        resultSet = null;

        try {
            // Open the database
            StringBuilder connectionURL = new StringBuilder();
            connectionURL.append(JDBC_BASE_URI);
            connectionURL.append(filename);
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(connectionURL.toString());

            // Get the number of hashes in the table
            statement = conn.createStatement();
            resultSet = statement.executeQuery("SELECT count(*) AS count FROM hashes");
            if (resultSet.next()) {
                totalHashes = resultSet.getLong("count");
            } else {
                close();
                throw new TskCoreException("Error getting hash count from database " + filename);
            }

            // Get the hashes
            resultSet = statement.executeQuery("SELECT md5 FROM hashes");

            // At this point, getNextHash can read each hash from the result set
        } catch (ClassNotFoundException | SQLException ex) {
            throw new TskCoreException("Error opening/reading database " + filename, ex);
        }

    }

    /**
     * Get the next hash to import
     *
     * @return The hash as a string
     * @throws TskCoreException
     */
    @Override
    public String getNextHash() throws TskCoreException {

        try {
            if (resultSet.next()) {
                byte[] hashBytes = resultSet.getBytes("md5");
                StringBuilder sb = new StringBuilder();
                for (byte b : hashBytes) {
                    sb.append(String.format("%02x", b));
                }

                if (sb.toString().length() != 32) {
                    throw new TskCoreException("Hash has incorrect length: " + sb.toString());
                }

                totalHashesRead++;
                return sb.toString();
            } else {
                throw new TskCoreException("Could not read expected number of hashes from database " + filename);
            }
        } catch (SQLException ex) {
            throw new TskCoreException("Error reading hash from result set for database " + filename, ex);
        }
    }

    /**
     * Check if there are more hashes to read
     *
     * @return true if we've read all expected hash values, false otherwise
     */
    @Override
    public boolean doneReading() {
        return (totalHashesRead >= totalHashes);
    }

    /**
     * Get the expected number of hashes in the file.
     *
     * @return The expected hash count
     */
    @Override
    public long getExpectedHashCount() {
        return totalHashes;
    }

    /**
     * Closes the import file
     */
    @Override
    public final void close() {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                Logger.getLogger(KdbHashSetParser.class.getName()).log(Level.SEVERE, "Error closing prepared statement.", ex);
            }
        }

        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException ex) {
                Logger.getLogger(KdbHashSetParser.class.getName()).log(Level.SEVERE, "Error closing result set.", ex);
            }
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(KdbHashSetParser.class.getName()).log(Level.SEVERE, "Error closing connection.", ex);
            }
        }
    }
}
