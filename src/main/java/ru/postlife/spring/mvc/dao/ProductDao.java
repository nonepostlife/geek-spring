package ru.postlife.spring.mvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.postlife.spring.mvc.entites.Category;
import ru.postlife.spring.mvc.entites.Product;

import java.util.List;

@Component
public class ProductDao {
    private SFactory sFactory;

    @Autowired
    public void setsFactory(SFactory sFactory) {
        this.sFactory = sFactory;
    }

    public List<Product> findAll() {
        try (Session session = sFactory.getFactory().getCurrentSession()) {
            //session = factory.getCurrentSession();
            session.beginTransaction();
            return session.createQuery("from Product").getResultList();
        }
    }
}
