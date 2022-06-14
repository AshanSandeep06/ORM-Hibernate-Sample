import lk.ijse.supermarket.embedded.Name;
import lk.ijse.supermarket.entity.*;
import lk.ijse.supermarket.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class AppInitializer {
    public static void main(String[] args) {

        //for Embedded
        Name n1 = new Name("Pasindu", "Ruwantha", "Gunasekara");
        Name n2 = new Name("Imali", "Parindya", "Abewardena");
        Name n3 = new Name("Kasun", "Rajitha", "Weerakulasooriya");

        // Customer
        Customer c1 = new Customer("C001", n1, "Galle", 65000);
        Customer c2 = new Customer("C002", n2, "Colombo", 45000);

        Customer c3 = new Customer();
        c3.setId("C003");
        c3.setName(n3);
        c3.setAddress("Kandy");
        c3.setSalary(125000);


        // Item
        Item i1 = new Item("I001", "Dhaal", 250.00, 50);
        Item i2 = new Item("I002", "Rice", 210.00, 40);

        Item i3 = new Item();
        i3.setCode("I003");
        i3.setDescription("Sugar");
        i3.setUnitPrice(150.00);
        i3.setQtyOnHand(80);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        /* -------------------------------------------Customer CRUD---------------------------------------------------- */

        // Save ------
        /*session.save(c1);
        session.save(c2);
        session.save(c3);*/

        // Update -------
//        c3.setAddress("Jaffna");
//        session.update(c3);

//        c2.setSalary(50000);
//        session.update(c2);

        // get --------
//        System.out.println(session.get(Customer.class, "C001"));
//        System.out.println(session.get(Customer.class, "C002"));

        // Delete -------
        // 1st way ***
//        Customer c4 = new Customer();
//        c4.setId("C003");
//        session.delete(c4);

        // 2nd way ***
//        Customer c5 = session.get(Customer.class, "C002");
//        session.delete(c5);


        /* -------------------------------------------Item CRUD---------------------------------------------------- */

        // Save ------
        /*session.save(i1);
        session.save(i2);
        session.save(i3);*/

        // Update ------
//        i3.setQtyOnHand(460);
//        session.update(i3);

//        i2.setDescription("Nadu Rice");
//        session.update(i2);

        // get ------
//        System.out.println(session.get(Item.class, "I001"));
//        System.out.println(session.get(Item.class, "I002"));

        // Delete -------
        // 1st way ***
//        Item i4 = new Item();
//        i4.setCode("I003");
//        session.delete(i4);

        // 2nd way ***
//        Item i5 = session.get(Item.class, "I002");
//        session.delete(i5);


        /* -------------------------------------------Order CRUD---------------------------------------------------- */




        transaction.commit();
        session.close();
    }
}
