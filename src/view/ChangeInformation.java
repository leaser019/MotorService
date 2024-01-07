/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author vomkh
 */
public class ChangeInformation extends javax.swing.JFrame {

    /**
     * Creates new form ChangeInformation
     */
    public ChangeInformation() {
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

        informationPannel = new javax.swing.JPanel();
        closeButton = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        userNameFill = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        passwordFill1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        userNameLabel1 = new javax.swing.JLabel();
        passwordLabel2 = new javax.swing.JLabel();
        passwordLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        passwordFill2 = new javax.swing.JTextField();
        loginButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informationPannel.setBackground(new java.awt.Color(51, 153, 255));
        informationPannel.setForeground(new java.awt.Color(51, 102, 255));
        informationPannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        informationPannel.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 40, 30));

        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("CHANGE YOUR INFORMATION");
        informationPannel.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 800, 67));

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("Date Of Birth");
        informationPannel.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 130, 20));

        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(51, 153, 255));
        loginButton.setText("GO BACK");
        loginButton.setToolTipText("");
        loginButton.setBorder(null);
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        informationPannel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 270, 40));

        userNameFill.setBackground(new java.awt.Color(51, 153, 255));
        userNameFill.setForeground(new java.awt.Color(255, 255, 255));
        userNameFill.setBorder(null);
        userNameFill.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        informationPannel.add(userNameFill, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 330, 20));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("_____________________________________________________________________");
        informationPannel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 370, 30));

        passwordFill1.setBackground(new java.awt.Color(51, 153, 255));
        passwordFill1.setForeground(new java.awt.Color(255, 255, 255));
        passwordFill1.setBorder(null);
        passwordFill1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        passwordFill1.setSelectionColor(new java.awt.Color(255, 255, 255));
        passwordFill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFill1ActionPerformed(evt);
            }
        });
        informationPannel.add(passwordFill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 330, 30));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("_____________________________________________________________________");
        informationPannel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 176, 360, 30));

        userNameLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userNameLabel1.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel1.setText("Username");
        informationPannel.add(userNameLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 20));

        passwordLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordLabel2.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel2.setText("Address");
        informationPannel.add(passwordLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 130, 20));

        passwordLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordLabel3.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel3.setText("Phone Number");
        informationPannel.add(passwordLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 130, 20));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("_____________________________________________________________________");
        informationPannel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 176, 360, 30));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("_____________________________________________________________________");
        informationPannel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, 360, 30));

        passwordFill2.setBackground(new java.awt.Color(51, 153, 255));
        passwordFill2.setForeground(new java.awt.Color(255, 255, 255));
        passwordFill2.setBorder(null);
        passwordFill2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        passwordFill2.setSelectionColor(new java.awt.Color(255, 255, 255));
        passwordFill2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFill2ActionPerformed(evt);
            }
        });
        informationPannel.add(passwordFill2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 330, 30));

        loginButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton1.setForeground(new java.awt.Color(51, 153, 255));
        loginButton1.setText("CHANGE");
        loginButton1.setToolTipText("");
        loginButton1.setBorder(null);
        loginButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButton1MouseClicked(evt);
            }
        });
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });
        informationPannel.add(loginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 270, 40));

        getContentPane().add(informationPannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 630));

        setSize(new java.awt.Dimension(830, 469));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void loginButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton1MouseClicked

    private void passwordFill2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFill2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFill2ActionPerformed

    private void passwordFill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFill1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFill1ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

    }//GEN-LAST:event_loginButtonActionPerformed

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        this.dispose();
        new Dashboard().setVisible(true);
    }//GEN-LAST:event_loginButtonMouseClicked

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ChangeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeButton;
    private javax.swing.JPanel informationPannel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton loginButton1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField passwordFill1;
    private javax.swing.JTextField passwordFill2;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JLabel passwordLabel3;
    private javax.swing.JTextField userNameFill;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userNameLabel1;
    // End of variables declaration//GEN-END:variables
}