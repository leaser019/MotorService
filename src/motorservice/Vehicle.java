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
public class Vehicle {
    private String plateNumber;
    private String brand;
    private String model;
    private double cost;
    private Color color;
    private VehicleStatus status;

    public Vehicle() {
    }

    public Vehicle(String plateNumber, String brand, String model, double cost, Color color, VehicleStatus status) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.model = model;
        this.cost = cost;
        this.color = color;
        this.status = status;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(VehicleStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "plateNumber=" + plateNumber + ", brand=" + brand + ", model=" + model + ", cost=" + cost + ", color=" + color + ", status=" + status + '}';
    }
    
}
