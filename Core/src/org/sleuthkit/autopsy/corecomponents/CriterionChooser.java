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

import java.awt.Component;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SortOrder;
import org.openide.nodes.Node;
import org.sleuthkit.autopsy.corecomponents.ResultViewerPersistence.SortCriterion;

/**
 * A Gui for choosing a SortCriterion from a list of available properties.
 */
final class CriterionChooser extends javax.swing.JPanel {

    private DefaultListCellRenderer defaultListCellRenderer = new DefaultListCellRenderer();

    /**
     * @param criterion
     * @param availableProps
     * @param removeCallback
     */
    CriterionChooser(SortCriterion criterion, List<Node.Property<?>> availableProps, Consumer<CriterionChooser> removeCallback) {
        initComponents();
        propComboBox.setModel(new DefaultComboBoxModel<>(availableProps.toArray(new Node.Property<?>[availableProps.size()])));
        propComboBox.setRenderer(new ListCellRenderer<Node.Property<?>>() {
            @Override
            public Component getListCellRendererComponent(JList<? extends Node.Property<?>> list, Node.Property<?> value, int index, boolean isSelected, boolean cellHasFocus) {
                //override default renderer to use Property.getName()
                return defaultListCellRenderer.getListCellRendererComponent(list, value == null ? "" : value.getName(), index, isSelected, cellHasFocus);
            }
        });
        if (criterion != null) {
            setCriterion(criterion);
        }
        removeButton.addActionListener(event -> removeCallback.accept(this));
    }

    /**
     * Populate this chooser with the given criterion. Property and sort order
     * are used, rank is ignored.
     *
     * @param criterion The criterion to populate into this chooser.
     */
    private void setCriterion(SortCriterion criterion) {
        propComboBox.setSelectedItem(criterion.getProperty());
        if (criterion.getSortOrder() == SortOrder.DESCENDING) {
            descendingRadio.setSelected(true);
        } else {
            ascendingRadio.setSelected(true);
        }
    }

    /**
     * Get the Criterion selected in this chooser. USe the given rank as the
     * rank of the Criterion.
     *
     * @param rank The rank to use for the Criterion.
     *
     * @return The criterion chosen.
     */
    SortCriterion getCriterion(int rank) {
        return new SortCriterion(
                (Node.Property<?>) propComboBox.getSelectedItem(),
                ascendingRadio.isSelected() ? SortOrder.ASCENDING : SortOrder.DESCENDING,
                rank
        );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sortOrderGroup = new javax.swing.ButtonGroup();
        propComboBox = new javax.swing.JComboBox<>();
        label1 = new java.awt.Label();
        removeButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        ascendingRadio = new javax.swing.JRadioButton();
        descendingRadio = new javax.swing.JRadioButton();

        label1.setText(org.openide.util.NbBundle.getMessage(CriterionChooser.class, "CriterionChooser.label1.text")); // NOI18N

        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sleuthkit/autopsy/images/cross-script.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(removeButton, org.openide.util.NbBundle.getMessage(CriterionChooser.class, "CriterionChooser.removeButton.text")); // NOI18N

        sortOrderGroup.add(ascendingRadio);
        ascendingRadio.setSelected(true);
        org.openide.awt.Mnemonics.setLocalizedText(ascendingRadio, org.openide.util.NbBundle.getMessage(CriterionChooser.class, "CriterionChooser.ascendingRadio.text")); // NOI18N

        sortOrderGroup.add(descendingRadio);
        org.openide.awt.Mnemonics.setLocalizedText(descendingRadio, org.openide.util.NbBundle.getMessage(CriterionChooser.class, "CriterionChooser.descendingRadio.text")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descendingRadio)
                    .addComponent(ascendingRadio))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(ascendingRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(descendingRadio)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(propComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(removeButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(propComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ascendingRadio;
    private javax.swing.JRadioButton descendingRadio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private java.awt.Label label1;
    private javax.swing.JComboBox<Node.Property<?>> propComboBox;
    private javax.swing.JButton removeButton;
    private javax.swing.ButtonGroup sortOrderGroup;
    // End of variables declaration//GEN-END:variables

}
