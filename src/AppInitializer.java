import lk.ijse.supermarket.embedded.Name;
import lk.ijse.supermarket.entity.*;
import lk.ijse.supermarket.util.FactoryConfiguration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.time.LocalDate;
import java.util.ArrayList;

public class AppInitializer {
    public static void main(String[] args) {

        //for Embedded
        Name n1 = new Name("Pasindu", "Ruwantha", "Gunasekara");
        Name n2 = new Name("Imali", "Parindya", "Abewardena");
        Name n3 = new Name("Kasun", "Rajitha", "Weerakulasooriya");

        // Customer
        Customer c1 = new Customer();
        c1.setCustomerId("C001");
        c1.setName(n1);
        c1.setAddress("Galle");
        c1.setSalary(125000);

        Customer c2 = new Customer();
        c2.setCustomerId("C002");
        c2.setName(n2);
        c2.setAddress("Kandy");
        c2.setSalary(125000);

        Customer c3 = new Customer();
        c3.setCustomerId("C003");
        c3.setName(n3);
        c3.setAddress("Kandy");
        c3.setSalary(125000);


        // Item
        Item i1 = new Item();
        i1.setCode("I001");
        i1.setDescription("Nadu Rice");
        i1.setUnitPrice(220.00);
        i1.setQtyOnHand(40);

        Item i2 = new Item();
        i2.setCode("I002");
        i2.setDescription("Milo");
        i2.setUnitPrice(600.00);
        i2.setQtyOnHand(100);

        Item i3 = new Item();
        i3.setCode("I003");
        i3.setDescription("White Sugar");
        i3.setUnitPrice(210.00);
        i3.setQtyOnHand(30);

        // Orders
        Orders o1 = new Orders();
        o1.setOrderId("OI-001");
        o1.setLocalDate(LocalDate.now());
        o1.setCustomer(c1);

        Orders o2 = new Orders();
        o2.setOrderId("OI-002");
        o2.setLocalDate(LocalDate.now());
        o2.setCustomer(c2);

        Orders o3 = new Orders();
        o3.setOrderId("OI-003");
        o3.setLocalDate(LocalDate.now());
        o3.setCustomer(c3);

        // OrderDetail
        OrderDetail od1 = new OrderDetail();
        od1.setOrderDetailID("OD-001");
        od1.setUnitPrice(250.00);
        od1.setOrderQty(5);
        od1.setDiscount(10.00);
        od1.setItem(i1);
        od1.setOrders(o1);

        OrderDetail od2 = new OrderDetail();
        od2.setOrderDetailID("OD-002");
        od2.setUnitPrice(400.00);
        od2.setOrderQty(8);
        od2.setDiscount(12.00);
        od2.setItem(i2);
        od2.setOrders(o2);

        OrderDetail od3 = new OrderDetail();
        od3.setOrderDetailID("OD-003");
        od3.setUnitPrice(600.00);
        od3.setOrderQty(3);
        od3.setDiscount(20.00);
        od3.setItem(i3);
        od3.setOrders(o3);

        ArrayList<OrderDetail> orderDetailList = new ArrayList<>();
        orderDetailList.add(od1);
        orderDetailList.add(od2);
        orderDetailList.add(od3);

        i1.setOrderDetailList(orderDetailList);
        i2.setOrderDetailList(orderDetailList);
        i3.setOrderDetailList(orderDetailList);

        ArrayList<Orders> ordersList = new ArrayList<>();
        ordersList.add(o1);
        ordersList.add(o2);
        ordersList.add(o3);

        c1.setOrdersList(ordersList);
        c2.setOrdersList(ordersList);
        c3.setOrdersList(ordersList);

        o1.setOrderDetailList(orderDetailList);
        o2.setOrderDetailList(orderDetailList);
        o3.setOrderDetailList(orderDetailList);

        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        /* -------------------------------------------Customer CRUD---------------------------------------------------- */

        // Save ------
        session.save(c1);
        session.save(c2);
        session.save(c3);

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
        session.save(i1);
        session.save(i2);
        session.save(i3);

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

        // Save ------
        session.save(o1);
        session.save(o2);
        session.save(o3);

        // Update ------
//        o1.setLocalDate(LocalDate.now());
//        session.update(o1);
//
//        o2.setCustomer(c2);
//        session.update(o2);

        // get ------
//        System.out.println(session.get(Orders.class, "OI-001"));
//        System.out.println(session.get(Orders.class, "OI-002"));

        // Delete -------
        // 1st way ***
//        Orders o4 = new Orders();
//        o4.setOrderId("I003");
//        session.delete(o4);

        // 2nd way ***
//        Orders o5 = session.get(Orders.class, "OI-002");
//        session.delete(o5);


        /* -------------------------------------------OrderDetail CRUD---------------------------------------------------- */

        // Save ------
        session.save(od1);
        session.save(od2);
        session.save(od3);

        // Update ------
//        od1.setUnitPrice(400.00);
//        session.update(od1);
//
//        od2.setItem(i2);
//        session.update(od2);

        // get ------
//        System.out.println(session.get(OrderDetail.class, "OD-001"));
//        System.out.println(session.get(OrderDetail.class, "OD-002"));

        // Delete -------
        // 1st way ***
//        OrderDetail od4 = new OrderDetail();
//        od4.setOrderDetailID("OD-003");
//        session.delete(od4);

        // 2nd way ***
//        OrderDetail od5 = session.get(OrderDetail.class, "OD-002");
//        session.delete(od5);

        transaction.commit();
        session.close();
    }
}
