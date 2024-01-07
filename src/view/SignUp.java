/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vomkh
 */
public class SignUp extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignUp() {
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
        goBackButton = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        loginLabel = new javax.swing.JLabel();
        userNameLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        confirmPasswordFill = new javax.swing.JTextField();
        userNameFill = new javax.swing.JTextField();
        loginFailLabel = new javax.swing.JLabel();
        passwordLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        passwordFill1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        userNameLabel1 = new javax.swing.JLabel();
        passwordLabel2 = new javax.swing.JLabel();
        passwordLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        passwordFill2 = new javax.swing.JTextField();
        confirmPasswordFill1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informationPannel.setBackground(new java.awt.Color(51, 153, 255));
        informationPannel.setForeground(new java.awt.Color(51, 102, 255));
        informationPannel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        goBackButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        goBackButton.setForeground(new java.awt.Color(255, 255, 255));
        goBackButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        goBackButton.setText("Go Back");
        goBackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                goBackButtonMouseClicked(evt);
            }
        });
        informationPannel.add(goBackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 100, 40));

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
        loginLabel.setText("SIGN UP");
        informationPannel.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 50, 800, 67));

        userNameLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        userNameLabel.setText("Date Of Birth");
        informationPannel.add(userNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 130, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("_____________________________________________________________________");
        informationPannel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 360, 30));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setText("Confirm Password ");
        informationPannel.add(passwordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 130, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("_____________________________________________________________________");
        informationPannel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 370, 30));

        loginButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(51, 153, 255));
        loginButton.setText("SIGN UP");
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
        informationPannel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 400, 810, 40));

        confirmPasswordFill.setBackground(new java.awt.Color(51, 153, 255));
        confirmPasswordFill.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordFill.setBorder(null);
        confirmPasswordFill.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        confirmPasswordFill.setSelectionColor(new java.awt.Color(255, 255, 255));
        confirmPasswordFill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordFillActionPerformed(evt);
            }
        });
        informationPannel.add(confirmPasswordFill, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 330, 30));

        userNameFill.setBackground(new java.awt.Color(51, 153, 255));
        userNameFill.setForeground(new java.awt.Color(255, 255, 255));
        userNameFill.setBorder(null);
        userNameFill.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        informationPannel.add(userNameFill, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 330, 20));

        loginFailLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginFailLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginFailLabel.setText(" ");
        informationPannel.add(loginFailLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 400, -1));

        passwordLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        passwordLabel1.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel1.setText("Phone Number");
        informationPannel.add(passwordLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 130, 20));

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
        passwordLabel3.setText("Password");
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

        confirmPasswordFill1.setBackground(new java.awt.Color(51, 153, 255));
        confirmPasswordFill1.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordFill1.setBorder(null);
        confirmPasswordFill1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        confirmPasswordFill1.setSelectionColor(new java.awt.Color(255, 255, 255));
        confirmPasswordFill1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordFill1ActionPerformed(evt);
            }
        });
        informationPannel.add(confirmPasswordFill1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 330, 30));

        getContentPane().add(informationPannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 810, 630));

        setSize(new java.awt.Dimension(809, 465));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
        String username = userNameFill.getText();
        String password = confirmPasswordFill.getText();
        String admin = "admin";
        String user = "user";
        if (username.equals(admin) && password.equals(admin)) {
            this.dispose();
            new QuerryForm().setVisible(true);
        } else if (username.equals(user) && password.equals(user)) {
            this.dispose();
            new Dashboard().setVisible(true);
        } else {
            loginFailLabel.setText("Wrong Password Or Username");// TODO add your handling code here:
        }
    }//GEN-LAST:event_loginButtonMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

    }//GEN-LAST:event_loginButtonActionPerformed

    private void confirmPasswordFillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFillActionPerformed

    private void passwordFill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFill1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFill1ActionPerformed

    private void goBackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_goBackButtonMouseClicked
        try {
            this.dispose();
            new Login().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_goBackButtonMouseClicked

    private void passwordFill2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFill2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFill2ActionPerformed

    private void confirmPasswordFill1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordFill1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordFill1ActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeButton;
    private javax.swing.JTextField confirmPasswordFill;
    private javax.swing.JTextField confirmPasswordFill1;
    private javax.swing.JLabel goBackButton;
    private javax.swing.JPanel informationPannel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel loginFailLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JTextField passwordFill1;
    private javax.swing.JTextField passwordFill2;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel passwordLabel1;
    private javax.swing.JLabel passwordLabel2;
    private javax.swing.JLabel passwordLabel3;
    private javax.swing.JTextField userNameFill;
    private javax.swing.JLabel userNameLabel;
    private javax.swing.JLabel userNameLabel1;
    // End of variables declaration//GEN-END:variables
}
