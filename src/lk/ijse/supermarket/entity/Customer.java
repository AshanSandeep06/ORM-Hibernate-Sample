package lk.ijse.supermarket.entity;

import lk.ijse.supermarket.embedded.Name;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Customer {
    @Id
    private String customerId;
    private Name name;
    private String address;
    private double salary;

    public Customer() {

    }

    public Customer(String customerId, Name name, String address, double salary) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getId() {
        return customerId;
    }

    public void setId(String customerId) {
        this.customerId = customerId;
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

    @Override
    public String toString() {
        return customerId+" - "+name.getfName()+" - "+address;
    }
}
