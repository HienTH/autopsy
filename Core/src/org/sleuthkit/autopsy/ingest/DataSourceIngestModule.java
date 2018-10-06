/*
 * Autopsy Forensic Browser
 *
 * Copyright 2014 Basis Technology Corp.
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
package org.sleuthkit.autopsy.ingest;

import org.sleuthkit.datamodel.Content;

/**
 * Interface that must be implemented by all data source ingest modules. See
 * description of IngestModule for more details on interface behavior.
 */
public interface DataSourceIngestModule extends IngestModule {

    /**
     * Processes a data source. Called once between calls to startUp() and
     * shutDown().
     *
     * @param dataSource  The data source to process.
     * @param progressBar A progress bar to be used to report progress.
     *
     * @return A result code indicating success or failure of the processing.
     */
    ProcessResult process(Content dataSource, DataSourceIngestModuleProgress progressBar);
}
