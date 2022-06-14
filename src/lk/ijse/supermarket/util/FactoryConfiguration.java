package lk.ijse.supermarket.util;

import lk.ijse.supermarket.entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class FactoryConfiguration {
    private static FactoryConfiguration factoryConfiguration;
    private SessionFactory sessionFactory;

    private FactoryConfiguration(){
        /*Configuration configuration = new Configuration().configure().addAnnotatedClass(Customer.class).addAnnotatedClass(Item.class);
        sessionFactory = configuration.buildSessionFactory();*/

        Properties p = new Properties();
        try {
            p.load(ClassLoader.getSystemClassLoader().getResourceAsStream("hibernate.properties"));
        } catch (Exception e) {
        }
        Configuration configure = new Configuration().mergeProperties(p).addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Item.class)
                .addAnnotatedClass(Orders.class)
                .addAnnotatedClass(OrderDetail.class);
        sessionFactory = configure.buildSessionFactory();
    }

    public static FactoryConfiguration getInstance(){
        return factoryConfiguration==null ? factoryConfiguration=new FactoryConfiguration()
                : factoryConfiguration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
