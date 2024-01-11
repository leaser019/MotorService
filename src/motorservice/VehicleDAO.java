/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorservice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguyenhoanggiaan
 */
public class VehicleDAO {
    List<Vehicle> listVehicle = new ArrayList<>();
    
    public int add(Vehicle vc){
        listVehicle.add(vc);
        return 1;
    }
    
    public int count(){
        return listVehicle.size();
    }
    
    public List<Vehicle> getAllVehicle(){
        return listVehicle;
    }
    
    public Vehicle findByPlateNumber(String plateNumber){
        for (Vehicle vc : listVehicle) {
            if(vc.getPlateNumber().equalsIgnoreCase(plateNumber)){
                return vc;
            }
        }
        return null;
    }
    
    public int delete(String plateNumber){
        Vehicle vc = findByPlateNumber(plateNumber);
        if(vc != null){
            listVehicle.remove(vc);
            return 1;
        }
        return -1;
    }
    
    public Vehicle getVehicleAtPoint(int position){
        return listVehicle.get(position);
    }
    
    public VehicleDAO() {
    }
    
    
}
