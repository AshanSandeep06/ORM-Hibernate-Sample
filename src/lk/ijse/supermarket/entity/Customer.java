package lk.ijse.supermarket.entity;

import lk.ijse.supermarket.embedded.Name;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    private String customerId;
    private Name name;
    private String address;
    private double salary;

    @OneToMany
    private List<Orders> ordersList = new ArrayList<>();

    public Customer() {

    }

    public Customer(String customerId, Name name, String address, double salary, List<Orders> ordersList) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.ordersList = ordersList;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public List<Orders> getOrdersList() {
        return ordersList;
    }

    public void setOrdersList(List<Orders> ordersList) {
        this.ordersList = ordersList;
    }

    @Override
    public String toString() {
        return customerId+" - "+name.getfName()+" - "+address;
    }
}
