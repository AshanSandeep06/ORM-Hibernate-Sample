package lk.ijse.supermarket.embedded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable
public class Name {
    private String fName;
    private String sName;
    private String lName;
}
