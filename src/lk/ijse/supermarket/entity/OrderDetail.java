package lk.ijse.supermarket.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Ashan Sandeep
 * @since : 0.1.0
 **/

@Entity
public class OrderDetail {
    @Id
    private String orderDetailID;
    private double unitPrice;
    private int orderQty;
    private double discount;

    public OrderDetail() {

    }

    public OrderDetail(String orderDetailID, double unitPrice, int orderQty, double discount) {
        this.orderDetailID = orderDetailID;
        this.unitPrice = unitPrice;
        this.orderQty = orderQty;
        this.discount = discount;
    }

    public String getOrderDetailID() {
        return orderDetailID;
    }

    public void setOrderDetailID(String orderDetailID) {
        this.orderDetailID = orderDetailID;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getOrderQty() {
        return orderQty;
    }

    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
