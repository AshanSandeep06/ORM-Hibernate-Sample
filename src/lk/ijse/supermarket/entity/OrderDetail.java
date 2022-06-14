package lk.ijse.supermarket.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

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

    @ManyToOne
    private Item item;

    @ManyToOne
    private Orders orders;

    public OrderDetail() {

    }

    public OrderDetail(String orderDetailID, double unitPrice, int orderQty, double discount, Item item, Orders orders) {
        this.orderDetailID = orderDetailID;
        this.unitPrice = unitPrice;
        this.orderQty = orderQty;
        this.discount = discount;
        this.item = item;
        this.orders = orders;
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

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }
}
