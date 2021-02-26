package ru.geekbrains.hw5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CrudApp {
    private static SessionFactory factory;

    public static void init() {
        PrepareData.forcePrepareData();
        factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    }

    public static void createProduct() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Product carrot = new Product("Carrot", 20);
            session.save(carrot);
            session.getTransaction().commit();
        }
    }

    public static void getProduct() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            System.out.println(session.get(Product.class, 3));
            session.getTransaction().commit();
        }
    }

    public static void updateProduct() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Product apple = new Product(5, "Lemon", 10000);
            session.update(apple);
            session.getTransaction().commit();
        }
    }

    public static void deleteProduct() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Product productToRemove = session.get(Product.class, 3);
            session.delete(productToRemove);
            session.getTransaction().commit();
        }
    }

    public static void shutdown() {
        factory.close();
    }

    public static void main(String[] args) {
        init();
        //createProduct();
        //getProduct();
        //updateProduct();
        deleteProduct();
        shutdown();
    }
}
