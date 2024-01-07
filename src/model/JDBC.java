/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vomkh
 */
public class JDBC {
    public static String url = null;

    public static Connection openConnection() {
        Connection connect = null;
        url = "jdbc:sqlserver://localhost:1433; databaseName= ;user=sa;password=sa;"
                + "encrypt=true;trustServerCertificate=true";
        if (connect == null) {
            try {
                connect = DriverManager.getConnection(url);
                System.out.println("Conection Sucess!");
                DatabaseMetaData data = (DatabaseMetaData) connect.getMetaData();
                // hien thi thong tin sql khi ket noi thanh cong
                System.out.println("Driver Name: " + data.getDriverName());
                System.out.println("Driver Version: " + data.getDriverVersion());
                System.out.println("Product Name: " + data.getDatabaseProductName());
                System.out.println("Version: " + data.getDatabaseProductVersion());
            } catch (SQLException ex) {
                System.out.println("Can not conncet to database \n" + ex);
            }
        }
        return connect;
    }

    public static void closeConnection(Connection connect){
        if(connect != null){
            try {
                connect.close();
            } catch (SQLException ex) {
                Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
        public static void useSQL(String sql){
            Connection c = JDBC.openConnection();
            Statement st;
        try {
            st = c.createStatement();
            int check = st.executeUpdate(sql);
            if(check > 0 ){
                System.out.println(" Data Added " );
            }else{
                System.out.println(" Added Fail " );
            }
            JDBC.closeConnection(c);
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
}
