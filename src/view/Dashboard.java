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
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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

        informationPannel1 = new javax.swing.JPanel();
        closeButton1 = new javax.swing.JLabel();
        loginLabel1 = new javax.swing.JLabel();
        loginButton1 = new javax.swing.JButton();
        loginButton2 = new javax.swing.JButton();
        loginButton3 = new javax.swing.JButton();
        loginButton4 = new javax.swing.JButton();
        loginButton5 = new javax.swing.JButton();
        loginButton6 = new javax.swing.JButton();
        Graphic = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Portal Application For Motor Servicing At Home Portal Application For Motor Servicing At Home ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        informationPannel1.setBackground(new java.awt.Color(51, 153, 255));
        informationPannel1.setForeground(new java.awt.Color(51, 102, 255));
        informationPannel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        closeButton1.setForeground(new java.awt.Color(255, 255, 255));
        closeButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButton1.setText("X");
        closeButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButton1MouseClicked(evt);
            }
        });
        informationPannel1.add(closeButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 6, 53, 31));

        loginLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        loginLabel1.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel1.setText("DASHBOARD");
        informationPannel1.add(loginLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 404, 67));

        loginButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton1.setText("VIEW SERVICE");
        loginButton1.setToolTipText("");
        loginButton1.setBorder(null);
        loginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton1ActionPerformed(evt);
            }
        });
        informationPannel1.add(loginButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 350, 40));

        loginButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton2.setText("QUERRY FORM");
        loginButton2.setToolTipText("");
        loginButton2.setBorder(null);
        loginButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton2ActionPerformed(evt);
            }
        });
        informationPannel1.add(loginButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 350, 40));

        loginButton3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton3.setText("VIEW USER");
        loginButton3.setToolTipText("");
        loginButton3.setBorder(null);
        loginButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton3ActionPerformed(evt);
            }
        });
        informationPannel1.add(loginButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 350, 40));

        loginButton4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton4.setText("VIEW VEHICLE");
        loginButton4.setToolTipText("");
        loginButton4.setBorder(null);
        loginButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton4ActionPerformed(evt);
            }
        });
        informationPannel1.add(loginButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 350, 40));

        loginButton5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton5.setText("LOG OUT");
        loginButton5.setToolTipText("");
        loginButton5.setBorder(null);
        loginButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButton5MouseClicked(evt);
            }
        });
        loginButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton5ActionPerformed(evt);
            }
        });
        informationPannel1.add(loginButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 350, 40));

        loginButton6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        loginButton6.setText("VIEW CART");
        loginButton6.setToolTipText("");
        loginButton6.setBorder(null);
        loginButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButton6ActionPerformed(evt);
            }
        });
        informationPannel1.add(loginButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 350, 40));

        getContentPane().add(informationPannel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, -10, 410, 480));

        Graphic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N
        getContentPane().add(Graphic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -60, 480, 610));

        getAccessibleContext().setAccessibleDescription("");

        setBounds(0, 0, 790, 460);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButton1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButton1MouseClicked

    private void loginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton1ActionPerformed

    private void loginButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton2ActionPerformed

    private void loginButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton3ActionPerformed

    private void loginButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton4ActionPerformed

    private void loginButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton5ActionPerformed
       
    }//GEN-LAST:event_loginButton5ActionPerformed

    private void loginButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginButton6ActionPerformed

    private void loginButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButton5MouseClicked
     this.dispose();
        try {
            new Login().setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loginButton5MouseClicked

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Graphic;
    private javax.swing.JLabel closeButton1;
    private javax.swing.JPanel informationPannel1;
    private javax.swing.JButton loginButton1;
    private javax.swing.JButton loginButton2;
    private javax.swing.JButton loginButton3;
    private javax.swing.JButton loginButton4;
    private javax.swing.JButton loginButton5;
    private javax.swing.JButton loginButton6;
    private javax.swing.JLabel loginLabel1;
    // End of variables declaration//GEN-END:variables
}
