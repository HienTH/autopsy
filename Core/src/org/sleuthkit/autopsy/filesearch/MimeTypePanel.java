/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011-2017 Basis Technology Corp.
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
package org.sleuthkit.autopsy.filesearch;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.event.ListSelectionEvent;
import org.sleuthkit.autopsy.coreutils.Logger;
import org.sleuthkit.autopsy.modules.filetypeid.FileTypeDetector;

public class MimeTypePanel extends javax.swing.JPanel {

    private static final Logger logger = Logger.getLogger(MimeTypePanel.class.getName());
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form MimeTypePanel
     */
    public MimeTypePanel() {
        initComponents();
        setComponentsEnabled();
        this.mimeTypeList.addListSelectionListener((ListSelectionEvent e) -> {
            firePropertyChange(FileSearchPanel.EVENT.CHECKED.toString(), null, null);
        });
    }

    private String[] getMimeTypeArray() {
        List<String> mimeTypesList = new ArrayList<>();
        try {
            mimeTypesList.addAll(FileTypeDetector.getDetectedTypes());
        } catch (FileTypeDetector.FileTypeDetectorInitException ex) {
            logger.log(Level.SEVERE, "Unable to get detectable file types", ex);
        }
        String[] mimeTypeArray = new String[mimeTypesList.size()];
        return mimeTypesList.toArray(mimeTypeArray);
    }

    List<String> getMimeTypesSelected() {
        return this.mimeTypeList.getSelectedValuesList();
    }

    boolean isSelected() {
        return this.mimeTypeCheckBox.isSelected();
    }

    void setComponentsEnabled() {
        boolean enabled = this.isSelected();
        this.mimeTypeList.setEnabled(enabled);
        this.jLabel1.setEnabled(enabled);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mimeTypeList = new javax.swing.JList<>();
        mimeTypeCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(150, 150));
        setPreferredSize(new java.awt.Dimension(100, 100));

        mimeTypeList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = getMimeTypeArray();
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        mimeTypeList.setMinimumSize(new java.awt.Dimension(0, 200));
        jScrollPane1.setViewportView(mimeTypeList);

        org.openide.awt.Mnemonics.setLocalizedText(mimeTypeCheckBox, org.openide.util.NbBundle.getMessage(MimeTypePanel.class, "MimeTypePanel.mimeTypeCheckBox.text")); // NOI18N
        mimeTypeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mimeTypeCheckBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(jLabel1, org.openide.util.NbBundle.getMessage(MimeTypePanel.class, "MimeTypePanel.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mimeTypeCheckBox)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(mimeTypeCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mimeTypeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mimeTypeCheckBoxActionPerformed
        setComponentsEnabled();
        firePropertyChange(FileSearchPanel.EVENT.CHECKED.toString(), null, null);
        this.mimeTypeList.setSelectedIndices(new int[0]);
    }//GEN-LAST:event_mimeTypeCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox mimeTypeCheckBox;
    private javax.swing.JList<String> mimeTypeList;
    // End of variables declaration//GEN-END:variables
}
