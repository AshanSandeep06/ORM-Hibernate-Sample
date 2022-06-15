package lk.ijse.supermarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Orders {
    @Id
    private String orderId;
    private LocalDate localDate;

    @ManyToOne
    private Customer customer;

    @OneToMany(mappedBy = "orders")
    private List<OrderDetail> orderDetailList = new ArrayList<>();
}
