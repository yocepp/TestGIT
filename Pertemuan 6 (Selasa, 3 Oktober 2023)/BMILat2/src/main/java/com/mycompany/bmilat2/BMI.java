/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.bmilat2;

/**
 *
 * @author ASUS
 */
public class BMI extends javax.swing.JFrame {

    /**
     * Creates new form BMI
     */
    public BMI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogStatusBMI = new javax.swing.JDialog();
        labelJudulStatusBMI = new javax.swing.JLabel();
        statusBMIUser = new javax.swing.JLabel();
        bmiUser = new javax.swing.JLabel();
        labelJudul = new javax.swing.JLabel();
        labelBerat = new javax.swing.JLabel();
        inputBerat = new javax.swing.JTextField();
        inputTinggi = new javax.swing.JTextField();
        labelTinggi = new javax.swing.JLabel();
        tblCek = new javax.swing.JButton();
        labelGender = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox<>();

        labelJudulStatusBMI.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        labelJudulStatusBMI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudulStatusBMI.setText("Body Mass Indicator Anda Adalah");
        labelJudulStatusBMI.setToolTipText("");

        statusBMIUser.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        statusBMIUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusBMIUser.setText("jLabel2");

        bmiUser.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        bmiUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bmiUser.setText("jLabel2");

        javax.swing.GroupLayout dialogStatusBMILayout = new javax.swing.GroupLayout(dialogStatusBMI.getContentPane());
        dialogStatusBMI.getContentPane().setLayout(dialogStatusBMILayout);
        dialogStatusBMILayout.setHorizontalGroup(
            dialogStatusBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelJudulStatusBMI, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(dialogStatusBMILayout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addGroup(dialogStatusBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bmiUser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusBMIUser, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dialogStatusBMILayout.setVerticalGroup(
            dialogStatusBMILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogStatusBMILayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(labelJudulStatusBMI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bmiUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusBMIUser)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelJudul.setFont(new java.awt.Font("Snap ITC", 0, 24)); // NOI18N
        labelJudul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelJudul.setText("Body Mass Indicator");

        labelBerat.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelBerat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelBerat.setText("Berat (KG)");

        inputBerat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputBeratActionPerformed(evt);
            }
        });

        inputTinggi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTinggiActionPerformed(evt);
            }
        });

        labelTinggi.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelTinggi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTinggi.setText("Tinggi (M)");

        tblCek.setText("CEK BMI");
        tblCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tblCekActionPerformed(evt);
            }
        });

        labelGender.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        labelGender.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelGender.setText("Gender");

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelJudul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(tblCek)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelBerat)
                    .addComponent(labelTinggi)
                    .addComponent(labelGender))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputTinggi, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(inputBerat)
                    .addComponent(gender, 0, 1, Short.MAX_VALUE))
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelJudul)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBerat)
                    .addComponent(inputBerat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTinggi)
                    .addComponent(inputTinggi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelGender)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(tblCek)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputBeratActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputBeratActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputBeratActionPerformed

    private void inputTinggiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTinggiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTinggiActionPerformed

    private void tblCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tblCekActionPerformed
        // TODO add your handling code here:
        double berat = Double.parseDouble(inputBerat.getText());
        double tinggi = Double.parseDouble(inputTinggi.getText());
        double hitungBMI = 0;
        String statusBMI = null;
        
        hitungBMI = berat / tinggi;
        
        if(gender.equals("Laki-laki")){
            if(hitungBMI < 18.5){
                statusBMI = "Kurus";
            } else if(hitungBMI < 24.9 && hitungBMI > 18.5 ){
                statusBMI = "Normal";
            } else if (hitungBMI < 29.9 && hitungBMI > 24.9){
                statusBMI = "Gemuk";
            } else if (hitungBMI > 30) {
                statusBMI = "Obesitas";
            }
        } else{
            if (hitungBMI < 18.5) {
                statusBMI = "Kurus";
            } else if (hitungBMI < 23.9 && hitungBMI > 18.5) {
                statusBMI = "Normal";
            } else if (hitungBMI < 28.9 && hitungBMI > 23.9) {
                statusBMI = "Gemuk";
            } else if (hitungBMI > 30) {
                statusBMI = "Obesitas";
            }
        }
        
        this.labelJudulStatusBMI.setVisible(true);
        this.statusBMIUser.setText(statusBMI);
        this.bmiUser.setText(String.valueOf(hitungBMI));
        this.dialogStatusBMI.setSize(480, 240);
        this.dialogStatusBMI.setVisible(true);
    }//GEN-LAST:event_tblCekActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BMI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BMI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bmiUser;
    private javax.swing.JDialog dialogStatusBMI;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField inputBerat;
    private javax.swing.JTextField inputTinggi;
    private javax.swing.JLabel labelBerat;
    private javax.swing.JLabel labelGender;
    private javax.swing.JLabel labelJudul;
    private javax.swing.JLabel labelJudulStatusBMI;
    private javax.swing.JLabel labelTinggi;
    private javax.swing.JLabel statusBMIUser;
    private javax.swing.JButton tblCek;
    // End of variables declaration//GEN-END:variables
}
