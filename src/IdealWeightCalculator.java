/*
This program was created by Dylan T
It was created on April 9th, 2018
It is an Ideal Weight Calculator where a user inputs his height, name and either chooses Metric or Imperial
 */

import java.text.*;

public class IdealWeightCalculator extends javax.swing.JFrame {

    DecimalFormat x = new DecimalFormat("###.00");
    
    public IdealWeightCalculator() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelHeader = new javax.swing.JLabel();
        labelEnterName = new javax.swing.JLabel();
        labelEnterUnit = new javax.swing.JLabel();
        labelEnterHeight = new javax.swing.JLabel();
        labelUnits = new javax.swing.JLabel();
        labelHeightUnits = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();
        textUnit = new javax.swing.JTextField();
        textHeight = new javax.swing.JTextField();
        labelOutputMessage = new javax.swing.JLabel();
        buttonCalculate = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelHeader.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        labelHeader.setText("Ideal Weight Calculator");

        labelEnterName.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelEnterName.setText("Enter your Name:");

        labelEnterUnit.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelEnterUnit.setText("Enter 1 or 2: ");

        labelEnterHeight.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelEnterHeight.setText("Enter your Height:");

        labelUnits.setText("1 for Metric, 2 for Imperial");

        labelHeightUnits.setText("Metres or inches");

        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });

        textUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUnitActionPerformed(evt);
            }
        });

        labelOutputMessage.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        labelOutputMessage.setText("Your ideal weight will be displayed here");

        buttonCalculate.setText("Calculate");
        buttonCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelOutputMessage)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(268, 268, 268)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(textUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(buttonCalculate)
                                        .addComponent(textHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(labelHeightUnits)
                                    .addGap(307, 307, 307)))
                            .addComponent(labelEnterName)
                            .addComponent(labelEnterUnit)
                            .addComponent(labelUnits)
                            .addComponent(labelEnterHeight)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(labelHeader)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelHeader)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnterName)
                    .addComponent(textName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelEnterUnit)
                    .addComponent(textUnit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(labelUnits)
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelEnterHeight)
                    .addComponent(textHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(buttonCalculate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(labelHeightUnits)))
                .addGap(18, 18, 18)
                .addComponent(labelOutputMessage)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    private void textUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUnitActionPerformed

    private void buttonCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCalculateActionPerformed
       double height, weight;
       
       String name;
       int unit;
       
       height = Double.parseDouble(textHeight.getText());
       
       name = textName.getText();
       
       unit = Integer.parseInt(textUnit.getText());
       
       switch(unit)
       {
           case 1:
               weight = height * height * 25;
               labelOutputMessage.setText(name + "'s ideal weight is " + (x.format(weight) + " kgs"));
               break;
           case 2:
               weight = height * height * 25 / 703;
               labelOutputMessage.setText(name + "'s ideal weight is " + (x.format(weight) + " lbs"));
               break;
           default:
               labelOutputMessage.setText("Error");
       }
    }//GEN-LAST:event_buttonCalculateActionPerformed

    
    public static void main(String args[]) {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IdealWeightCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IdealWeightCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IdealWeightCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IdealWeightCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IdealWeightCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCalculate;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEnterHeight;
    private javax.swing.JLabel labelEnterName;
    private javax.swing.JLabel labelEnterUnit;
    private javax.swing.JLabel labelHeader;
    private javax.swing.JLabel labelHeightUnits;
    private javax.swing.JLabel labelOutputMessage;
    private javax.swing.JLabel labelUnits;
    private javax.swing.JTextField textHeight;
    private javax.swing.JTextField textName;
    private javax.swing.JTextField textUnit;
    // End of variables declaration//GEN-END:variables
}
