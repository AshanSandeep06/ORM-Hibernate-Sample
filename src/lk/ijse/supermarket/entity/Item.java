package lk.ijse.supermarket.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Item {
    @Id
    @Column(name = "itemCode")
    private String code;
    private String description;
    private double unitPrice;
    private int qtyOnHand;

    @OneToMany(mappedBy = "item")
    private List<OrderDetail> orderDetailList = new ArrayList<>();
}
