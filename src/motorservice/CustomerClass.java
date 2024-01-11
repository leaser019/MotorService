/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorservice;

/**
 *
 * @author nguyenhoanggiaan
 */
public class CustomerClass {
    private String id;
    private String customerClass;

    public CustomerClass() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerClass() {
        return customerClass;
    }

    public void setCustomerClass(String customerClass) {
        this.customerClass = customerClass;
    }

    public CustomerClass(String id, String customerClass) {
        this.id = id;
        this.customerClass = customerClass;
    }

    @Override
    public String toString() {
        return this.customerClass;
    }
    
    
}
