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
public class OrderDAO {
    List<Order> listOrder = new ArrayList<>();
    
    public int add(Order o){
        listOrder.add(o);
        return 1;
    }
    
    public int count(){
        return listOrder.size();
    }
    
    public List<Order> getAllOrder(){
        return listOrder;
    }
    
    public Order findByCustomerId(String customerId){
        for (Order o : listOrder) {
            if(o.getCustomerId().equalsIgnoreCase(customerId)){
                return o;
            }
        }
        return null;
    }
    
    public int delete(String customerId){
        Order o = findByCustomerId(customerId);
        if(o != null){
            listOrder.remove(o);
            return 1;
        }
        return -1;
    }
    
}
