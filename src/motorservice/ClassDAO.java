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
public class ClassDAO {
    List<CustomerClass> listClass  = new ArrayList<>();
    
    public ClassDAO(){
        listClass.add(new CustomerClass("1","Platinum"));
        listClass.add(new CustomerClass("2","Gold"));
        listClass.add(new CustomerClass("3","Silver"));
        listClass.add(new CustomerClass("4","Bronze"));
    }
    
    public int add(CustomerClass cc){
        listClass.add(cc);
        return 1;
    }
    
    public List<CustomerClass> getAllClass(){
        return listClass;
    }
}
