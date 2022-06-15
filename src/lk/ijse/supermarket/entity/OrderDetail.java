package lk.ijse.supermarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author : Ashan Sandeep
 * @since : 0.1.0
 **/

@NoArgsConstructor
@AllArgsConstructor
@Data
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
}
