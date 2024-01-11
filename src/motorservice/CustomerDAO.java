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
public class CustomerDAO {
    List<Customer> listCustomer = new ArrayList<>();
    
    public int add(Customer cus){
        listCustomer.add(cus);
        return 1;
    }
    
    public int count(){
        return listCustomer.size();
    }
    
    public List<Customer> getAllCustomer(){
        return listCustomer;
    }
    
    public Customer findByCustomerId(String customerId){
        for (Customer cus : listCustomer) {
            if(cus.getCustomerId().equalsIgnoreCase(customerId)){
                return cus;
            }
        }
        return null;
    }
    
    public int delete(String customerId){
        Customer cus = findByCustomerId(customerId);
        if(cus != null){
            listCustomer.remove(cus);
            return 1;
        }
        return -1;
    }
    
    public Customer getCustomerAtPoint(int position){
        return listCustomer.get(position);
    }
}
