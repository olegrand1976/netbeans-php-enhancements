/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2014 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2014 Sun Microsystems, Inc.
 */
package com.junichi11.netbeans.php.enhancements.options;

final class PHPEnhancementsPanel extends javax.swing.JPanel {

    private static final long serialVersionUID = -4525362573123684731L;

    private final PHPEnhancementsOptionsPanelController controller;

    PHPEnhancementsPanel(PHPEnhancementsOptionsPanelController controller) {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typingHooksLabel = new javax.swing.JLabel();
        objectOperatorCheckBox = new javax.swing.JCheckBox();
        doubleArrowOperatorCheckBox = new javax.swing.JCheckBox();
        codeCompletionLabel = new javax.swing.JLabel();
        toUppercaseConstCheckBox = new javax.swing.JCheckBox();
        toUppercaseDefineCheckBox = new javax.swing.JCheckBox();

        org.openide.awt.Mnemonics.setLocalizedText(typingHooksLabel, org.openide.util.NbBundle.getMessage(PHPEnhancementsPanel.class, "PHPEnhancementsPanel.typingHooksLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(objectOperatorCheckBox, org.openide.util.NbBundle.getMessage(PHPEnhancementsPanel.class, "PHPEnhancementsPanel.objectOperatorCheckBox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(doubleArrowOperatorCheckBox, org.openide.util.NbBundle.getMessage(PHPEnhancementsPanel.class, "PHPEnhancementsPanel.doubleArrowOperatorCheckBox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(codeCompletionLabel, org.openide.util.NbBundle.getMessage(PHPEnhancementsPanel.class, "PHPEnhancementsPanel.codeCompletionLabel.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(toUppercaseConstCheckBox, org.openide.util.NbBundle.getMessage(PHPEnhancementsPanel.class, "PHPEnhancementsPanel.toUppercaseConstCheckBox.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(toUppercaseDefineCheckBox, org.openide.util.NbBundle.getMessage(PHPEnhancementsPanel.class, "PHPEnhancementsPanel.toUppercaseDefineCheckBox.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typingHooksLabel)
                    .addComponent(codeCompletionLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(doubleArrowOperatorCheckBox)
                            .addComponent(objectOperatorCheckBox)
                            .addComponent(toUppercaseConstCheckBox)
                            .addComponent(toUppercaseDefineCheckBox))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(typingHooksLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(objectOperatorCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(doubleArrowOperatorCheckBox)
                .addGap(18, 18, 18)
                .addComponent(codeCompletionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toUppercaseConstCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(toUppercaseDefineCheckBox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    void load() {
        PHPEnhancementsOptions options = PHPEnhancementsOptions.getInstance();
        objectOperatorCheckBox.setSelected(options.isObjectOperator());
        doubleArrowOperatorCheckBox.setSelected(options.isDoubleArrowOperator());
        toUppercaseConstCheckBox.setSelected(options.isToUppercaseConst());
        toUppercaseDefineCheckBox.setSelected(options.isToUppercaseDefine());
    }

    void store() {
        PHPEnhancementsOptions options = PHPEnhancementsOptions.getInstance();
        options.setObjectOperator(objectOperatorCheckBox.isSelected());
        options.setDoubleArrowOperator(doubleArrowOperatorCheckBox.isSelected());
        options.setToUppercaseConst(toUppercaseConstCheckBox.isSelected());
        options.setToUppercaseDefine(toUppercaseDefineCheckBox.isSelected());
    }

    boolean valid() {
        // TODO check whether form is consistent and complete
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel codeCompletionLabel;
    private javax.swing.JCheckBox doubleArrowOperatorCheckBox;
    private javax.swing.JCheckBox objectOperatorCheckBox;
    private javax.swing.JCheckBox toUppercaseConstCheckBox;
    private javax.swing.JCheckBox toUppercaseDefineCheckBox;
    private javax.swing.JLabel typingHooksLabel;
    // End of variables declaration//GEN-END:variables
}