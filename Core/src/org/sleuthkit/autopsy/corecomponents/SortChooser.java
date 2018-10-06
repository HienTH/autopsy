/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011-17 Basis Technology Corp.
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
package org.sleuthkit.autopsy.corecomponents;

import java.util.ArrayList;
import java.util.List;
import org.openide.nodes.Node;
import org.openide.util.NbBundle;
import org.sleuthkit.autopsy.corecomponents.ResultViewerPersistence.SortCriterion;
import org.sleuthkit.autopsy.coreutils.ThreadConfined;

/**
 * A dialog that allows the user to choose sort criteria for the thumbnail
 * viewer.
 */
final class SortChooser extends javax.swing.JPanel {

    /**
     * The properties that will be available to the user as sort criteria.
     */
    private final List<Node.Property<?>> availableProps;

    /**
     * List of chooser maintained so that we can get the list of selected
     * criteria.
     */
    private final ArrayList<CriterionChooser> choosers = new ArrayList<>();

    /**
     * @param availableProps The properties that are available for selection in
     *                       this SortChooser.
     * @param criteria       The existing sort criteria to populate choosers
     *                       for.
     */
    SortChooser(List<Node.Property<?>> availableProps, List<SortCriterion> criteria) {
        super();
        initComponents();

        this.availableProps = availableProps;
        criteria.forEach(this::addCriterionChooser);
    }

    /**
     * Get the list of criteria selected in this chooser.
     *
     * @return the list of criteria selected in this chooser.
     */
    @ThreadConfined(type = ThreadConfined.ThreadType.AWT)
    List<SortCriterion> getCriteria() {
        List<SortCriterion> list = new ArrayList<>();
        for (int i = 0; i < choosers.size(); i++) {
            list.add(choosers.get(i).getCriterion(i));
        }
        return list;
    }

    @NbBundle.Messages({"SortChooser.dialogTitle=Chọn Tiêu chí Sắp xếp"})
    String getDialogTitle() {
        return Bundle.SortChooser_dialogTitle();
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
        scrollContent = new javax.swing.JPanel();
        addCriteriaButton = new javax.swing.JButton();

        scrollContent.setLayout(new javax.swing.BoxLayout(scrollContent, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(scrollContent);

        org.openide.awt.Mnemonics.setLocalizedText(addCriteriaButton, org.openide.util.NbBundle.getMessage(SortChooser.class, "SortChooser.addCriteriaButton.text")); // NOI18N
        addCriteriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCriteriaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(addCriteriaButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCriteriaButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    private void addCriteriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCriteriaButtonActionPerformed
        addCriterionChooser(null);

    }//GEN-LAST:event_addCriteriaButtonActionPerformed

    /**
     * Add a chooser populated with the property and sort order of the given
     * criterion to this dialog.
     *
     * @param criterion The criterion to populate the new chooser with.
     */
    @ThreadConfined(type = ThreadConfined.ThreadType.AWT)
    private void addCriterionChooser(SortCriterion criterion) {
        final CriterionChooser chooser = new CriterionChooser(criterion, availableProps, this::removeCriterionChooser);
        choosers.add(chooser); // keep a reference
        scrollContent.add(chooser); // add to GUI
        revalidate();  //needed to force repaint.
    }

    /**
     * Remove the given chooser form the GUI.
     *
     * @param chooser 
     */
    @ThreadConfined(type = ThreadConfined.ThreadType.AWT)
    private void removeCriterionChooser(CriterionChooser chooser) {
        choosers.remove(chooser);  //remove from internal list
        scrollContent.remove(chooser);// remove from GUI
        revalidate();  //repaint
        repaint();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCriteriaButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel scrollContent;
    // End of variables declaration//GEN-END:variables

}
