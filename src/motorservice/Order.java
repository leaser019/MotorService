/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorservice;

import java.util.Date;

/**
 *
 * @author nguyenhoanggiaan
 */
public class Order {
    private String customerId;
    private String staffId;
    private String plateNumber;
    private Date startDate;
    private Date endDate;
    private OrderStatus orderStatus;

    public Order() {
    }

    public Order(String customerId, String staffId,String plateNumber, Date startDate, Date endDate, OrderStatus orderStatus) {
        this.customerId = customerId;
        this.staffId = staffId;
        this.plateNumber = plateNumber;
        this.startDate = startDate;
        this.endDate = endDate;
        this.orderStatus = orderStatus;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    @Override
    public String toString() {
        return "Order{" + "customerId=" + customerId + ", staffId=" + staffId + ", plateNumber=" + plateNumber + ", startDate=" + startDate + ", endDate=" + endDate + ", orderStatus=" + orderStatus + '}';
    }
    

    
    
}
