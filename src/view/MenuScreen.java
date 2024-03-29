/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author nguyenhoanggiaan
 */
public class MenuScreen extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form MenuScreen
     */
    public MenuScreen() {
        initComponents();
        setLocationRelativeTo(null);
        btncustomer.addActionListener(this);
        btnorder.addActionListener(this);
        btnvehicle.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGraphic = new javax.swing.JPanel();
        Graphic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loginLabel = new javax.swing.JLabel();
        closeButton = new javax.swing.JLabel();
        btnlogout = new javax.swing.JButton();
        btncustomer = new javax.swing.JButton();
        btnvehicle = new javax.swing.JButton();
        btnorder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelGraphic.setPreferredSize(new java.awt.Dimension(350, 409));
        panelGraphic.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Graphic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Login.png"))); // NOI18N
        panelGraphic.add(Graphic, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -60, 480, 610));

        getContentPane().add(panelGraphic, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 450));

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        loginLabel.setForeground(new java.awt.Color(255, 255, 255));
        loginLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLabel.setText("MENU");
        jPanel1.add(loginLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, 67));

        closeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        closeButton.setForeground(new java.awt.Color(255, 255, 255));
        closeButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeButton.setText("X");
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });
        jPanel1.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 20, 20));

        btnlogout.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(51, 153, 255));
        btnlogout.setText("Log out");
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
        });
        jPanel1.add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 280, 60));

        btncustomer.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btncustomer.setForeground(new java.awt.Color(51, 153, 255));
        btncustomer.setText("Customer");
        btncustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btncustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 280, 60));

        btnvehicle.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnvehicle.setForeground(new java.awt.Color(51, 153, 255));
        btnvehicle.setText("Vehicle");
        jPanel1.add(btnvehicle, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 280, 60));

        btnorder.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnorder.setForeground(new java.awt.Color(51, 153, 255));
        btnorder.setText("Order");
        jPanel1.add(btnorder, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 280, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 410, 400));

        setSize(new java.awt.Dimension(744, 399));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btncustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncustomerActionPerformed
        
    }//GEN-LAST:event_btncustomerActionPerformed

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
    this.dispose();
    new Login().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnlogoutMouseClicked
    public void btnCustomerClick(){
        new CustomerManagement().setVisible(true);
        this.dispose();
    }
    public void btnOrderClick(){
        new PlaceOrder().setVisible(true);
        this.dispose();
    }
    public void btnVehicleClick(){
        new VehicleManagement().setVisible(true);
        this.dispose();
    }
    public void btnLogoutClick(){
        new Login().setVisible(true);
        this.dispose();
    }
    
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
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Graphic;
    private javax.swing.JButton btncustomer;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnorder;
    private javax.swing.JButton btnvehicle;
    private javax.swing.JLabel closeButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel panelGraphic;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btncustomer)){
            btnCustomerClick();
        } else if(e.getSource().equals(btnorder)){
            btnOrderClick();
        } else if(e.getSource().equals(btnvehicle)){
            btnVehicleClick();
        }
    }
}
