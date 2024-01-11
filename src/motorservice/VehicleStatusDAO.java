/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorservice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguyenhoanggiaan
 */
public class VehicleStatusDAO {
    List<VehicleStatus> listVehicleStatus = new ArrayList<>();
    
    public VehicleStatusDAO() {
        listVehicleStatus.add(new VehicleStatus("1","Unhire"));
        listVehicleStatus.add(new VehicleStatus("2","Hired"));
    }
    
    public int add(VehicleStatus st){
        listVehicleStatus.add(st);
        return 1;
    }
    public List<VehicleStatus> getAllStatus(){
        return listVehicleStatus;
    }

}
