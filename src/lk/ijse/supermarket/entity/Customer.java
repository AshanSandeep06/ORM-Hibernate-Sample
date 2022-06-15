package lk.ijse.supermarket.entity;

import lk.ijse.supermarket.embedded.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Customer {
    @Id
    private String customerId;
    private Name name;
    private String address;
    private double salary;

    @OneToMany(mappedBy = "customer")
    private List<Orders> ordersList = new ArrayList<>();
}
