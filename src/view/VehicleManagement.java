/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import motorservice.ColorDAO;
import motorservice.Color;
import motorservice.Vehicle;
import motorservice.VehicleDAO;
import motorservice.VehicleStatus;
import motorservice.VehicleStatusDAO;
/**
 *
 * @author nguyenhoanggiaan
 */
public class VehicleManagement extends javax.swing.JFrame implements ActionListener{
    ColorDAO daoColor = new ColorDAO();
    VehicleDAO daoVehicle = new VehicleDAO();
    VehicleStatusDAO daoVehicleStatus = new VehicleStatusDAO();
    /**
     * Creates new form VehicleManagement
     */
    public VehicleManagement() {
        initComponents();
        setLocationRelativeTo(null);
        getDataCombobox();
        btncancel.addActionListener(this);
    }
    public void getDataCombobox(){
        DefaultComboBoxModel<Color> model 
                = (DefaultComboBoxModel) cbxcolor.getModel();
        for(Color color : daoColor.getAllColor()){
            model.addElement(color);
        }
        
        DefaultComboBoxModel<VehicleStatus> modelStatus 
                = (DefaultComboBoxModel) cbxstatus.getModel();
        for(VehicleStatus st : daoVehicleStatus.getAllStatus()){
            modelStatus.addElement(st);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtplatenumber = new javax.swing.JTextField();
        txtbrand = new javax.swing.JTextField();
        txtmodel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbresult = new javax.swing.JTable();
        txtrentcost = new javax.swing.JTextField();
        cbxstatus = new javax.swing.JComboBox<>();
        cbxcolor = new javax.swing.JComboBox<>();
        btnaddnew = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        lblstatus = new javax.swing.JLabel();
        btncancel = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnshowall = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setText("Plate number:");

        jLabel3.setText("Brand:");

        jLabel4.setText("Model:");

        jLabel5.setText("Color:");

        jLabel6.setText("Rent cost:");

        jLabel7.setText("Status:");

        tbresult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tbresult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Plate number", "Brand", "Model", "Color", "Rent cost", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tbresult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbresultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbresult);

        btnaddnew.setText("Add new");
        btnaddnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddnewActionPerformed(evt);
            }
        });

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        lblstatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblstatus.setForeground(new java.awt.Color(255, 0, 51));

        btncancel.setText("Cancel");
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("Vehicle Management");

        btnshowall.setText("Show all");
        btnshowall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnshowallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 821, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btncancel)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtrentcost, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                        .addComponent(txtmodel, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtbrand, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtplatenumber, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(cbxcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnaddnew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnshowall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(248, 248, 248))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel9)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtplatenumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnaddnew))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnshowall))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(cbxcolor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtrentcost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(cbxstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed
    public Vehicle getModel(){
        Vehicle vc = new Vehicle();
        vc.setPlateNumber(txtplatenumber.getText().trim());
        vc.setBrand(txtbrand.getText().trim());
        vc.setModel(txtmodel.getText().trim());
        vc.setCost(Double.parseDouble(txtrentcost.getText().trim()));
        vc.setColor((Color)cbxcolor.getSelectedItem());
        vc.setStatus((VehicleStatus)cbxstatus.getSelectedItem());
        return vc;
    }
    private void btnaddnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddnewActionPerformed
        if(!checkValidInput()){
            JOptionPane.showMessageDialog(this,"You need to enter all information!");
        }else{
            Vehicle vc = getModel();
            System.out.println("=>"+vc.toString());
            if(daoVehicle.add(vc)>0){
                lblstatus.setText("Saved successfully");
                addSQL(vc);
                updateDataIntoTable();
            }
        }
        resetForm();
    }//GEN-LAST:event_btnaddnewActionPerformed
    
    public void setModel(Vehicle vc){
        txtplatenumber.setText(vc.getPlateNumber());
        txtbrand.setText(vc.getBrand());
        txtmodel.setText(vc.getModel());
        cbxcolor.setSelectedItem(vc.getColor());
        txtrentcost.setText(vc.getCost()+"");
        cbxstatus.setSelectedItem(vc.getStatus());
    }
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        if(txtplatenumber.getText().isEmpty()){
            JOptionPane.showMessageDialog(this,"You need to enter plate number to search !");
        }else{            
            if(daoVehicle.delete(txtplatenumber.getText().trim())>0){
                lblstatus.setText("Delete Successfully "+txtplatenumber.getText());
                deleteSQL(txtplatenumber.getText());
                updateDataIntoTable();
                resetForm();
            }else{
                lblstatus.setText("Can not found Customer "+txtplatenumber.getText());
            }
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tbresultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbresultMouseClicked

    }//GEN-LAST:event_tbresultMouseClicked

    private void btnshowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnshowallActionPerformed
        updateDataIntoTable();
    }//GEN-LAST:event_btnshowallActionPerformed
    
            
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
            java.util.logging.Logger.getLogger(VehicleManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VehicleManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VehicleManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VehicleManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VehicleManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnaddnew;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnshowall;
    private javax.swing.JComboBox<String> cbxcolor;
    private javax.swing.JComboBox<String> cbxstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblstatus;
    private javax.swing.JTable tbresult;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtplatenumber;
    private javax.swing.JTextField txtrentcost;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btncancel)){
            btnCancelClick();
        }
    }
    public void btnCancelClick(){
        new MenuScreen().setVisible(true);
        this.dispose();
    }
    
    public void resetForm(){
        txtplatenumber.setText("");
        txtbrand.setText("");
        txtmodel.setText("");
        cbxcolor.setSelectedIndex(0);
        txtrentcost.setText("");
        cbxstatus.setSelectedIndex(0);
    }
    
    public boolean checkValidInput(){
        if(txtplatenumber.getText().isEmpty()
                ||txtbrand.getText().isEmpty()
                ||txtmodel.getText().isEmpty()
                ||txtrentcost.getText().isEmpty()
                ){
            return false;
        }
        return true;
    }
    
    public void fillData(){
        DefaultTableModel  tbModel = (DefaultTableModel) tbresult.getModel();
        tbModel.setRowCount(0);
        for(Vehicle vc : daoVehicle.getAllVehicle()){
            Object[] rowData = new Object[6];
            rowData[0] = vc.getPlateNumber();
            rowData[1] = vc.getBrand();
            rowData[2] = vc.getModel();
            rowData[3] = vc.getColor();
            rowData[4] = vc.getCost();
            rowData[5] = vc.getStatus();
            tbModel.addRow(rowData);
        }
    }
    
    public void addSQL(Vehicle vc){
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Motorbike_Hiring;user=sa;password=giaan512";
            try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
                String SQL = "INSERT INTO Vehicle (Plate_Number, Brand, Model, Color, Vehicle_Status, Rent_Cost) VALUES (" 
                        + "'" + vc.getPlateNumber()+"'" + "," 
                        + "'"+vc.getBrand()+"'" + ","
                        + "'"+vc.getModel()+"'" + "," 
                        + "'"+vc.getColor()+"'" + "," 
                        + "'"+vc.getStatus()+"'" + ","
                        + "'"+vc.getCost()+"'" + ")";
                stmt.executeQuery(SQL);
            } catch (SQLException e) { 
                System.out.println(e);
            }
    }
    
    public void deleteSQL(String platenumber){
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Motorbike_Hiring;user=sa;password=giaan512";
            try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {         
                String SQL = "DELETE FROM Vehicle WHERE Plate_Number =" + "'" + platenumber + "'";
                stmt.executeQuery(SQL);
            } catch (SQLException e) { 
            }
    }
    
    public void updateDataIntoTable(){
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=Motorbike_Hiring;user=sa;password=giaan512";
            try (Connection con = DriverManager.getConnection(connectionUrl); Statement stmt = con.createStatement();) {
                String SQL = "Select Plate_Number,Brand,Model,Color,Rent_Cost,Vehicle_Status FROM Vehicle";
                ResultSet rs = stmt.executeQuery(SQL);
                DefaultTableModel  tbModel = (DefaultTableModel) tbresult.getModel();
                tbModel.setRowCount(0);
                Object[] rowData = new Object[6];
                
                while(rs.next()){
                    rowData[0] = rs.getString("Plate_Number");
                    rowData[1] = rs.getString("Brand");
                    rowData[2] = rs.getString("Model");
                    rowData[3] = rs.getString("Color");
                    rowData[4] = rs.getFloat("Rent_Cost");
                    rowData[5] = rs.getString("Vehicle_Status");
                    tbModel.addRow(rowData);
                }
            } catch (SQLException e) { 
                System.out.println(e);
            }
    }
}
