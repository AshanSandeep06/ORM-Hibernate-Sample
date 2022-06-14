package lk.ijse.supermarket.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : Ashan Sandeep
 * @since : 0.1.0
 **/

@Entity
public class Orders {
    @Id
    private String orderId;
    private LocalDate localDate;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "orders")
    private List<OrderDetail> orderDetailList = new ArrayList<>();

    public Orders() {

    }

    public Orders(String orderId, LocalDate localDate, Customer customer, List<OrderDetail> orderDetailList) {
        this.orderId = orderId;
        this.localDate = localDate;
        this.customer = customer;
        this.orderDetailList = orderDetailList;
    }

    public Orders(String orderId, LocalDate localDate) {
        this.orderId = orderId;
        this.localDate = localDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<OrderDetail> getOrderDetailList() {
        return orderDetailList;
    }

    public void setOrderDetailList(List<OrderDetail> orderDetailList) {
        this.orderDetailList = orderDetailList;
    }

    @Override
    public String toString() {
        return orderId+" - "+localDate+" - "+customer.getCustomerId();
    }
}
