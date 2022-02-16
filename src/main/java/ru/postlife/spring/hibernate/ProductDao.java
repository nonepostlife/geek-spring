package ru.postlife.spring.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class ProductDao {
    private SessionFactory factory;
    private Session session;

    public ProductDao() {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();
    }

    public Product findById(long id) {
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            return session.get(Product.class, id);
        } finally {
            session.close();
        }
    }

    public List<Product> findAll() {
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            return session.createQuery("from Product").getResultList();
        } finally {
            session.close();
        }
    }

    public void deleteById(Long id) {
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            Product deleteProduct = session.get(Product.class, id);
            if (deleteProduct != null)
                session.delete(deleteProduct);
            session.flush();
        } finally {
            session.close();
        }
    }

    public void saveOrUpdate(Product product) {
        try {
            session = factory.getCurrentSession();
            session.beginTransaction();
            session.saveOrUpdate(product);
            session.flush();
        } finally {
            session.close();
        }
    }

    public void close() {
        factory.close();
    }
}
