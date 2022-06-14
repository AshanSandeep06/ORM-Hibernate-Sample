package lk.ijse.supermarket.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

/**
 * @author : Ashan Sandeep
 * @since : 0.1.0
 **/

@Entity
public class Orders {
    @Id
    private String orderId;
    private LocalDate localDate;

    public Orders() {

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
}
