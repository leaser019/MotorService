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
public class OrderStatusDAO {
    List<OrderStatus> listOrderStatus = new ArrayList<>();
    
    public OrderStatusDAO() {
        listOrderStatus.add(new OrderStatus("1","Processed"));
        listOrderStatus.add(new OrderStatus("2","Processing"));
        listOrderStatus.add(new OrderStatus("3","Unprocess"));
    }
    
    public int add(OrderStatus os){
        listOrderStatus.add(os);
        return 1;
    }
    public List<OrderStatus> getAllOrderStatus(){
        return listOrderStatus;
    }
}
