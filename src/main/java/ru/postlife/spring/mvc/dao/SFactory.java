package ru.postlife.spring.mvc.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;
import ru.postlife.spring.mvc.entites.Category;
import ru.postlife.spring.mvc.entites.Product;

@Component
public class SFactory {

    private SessionFactory factory;

    public SFactory() {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(Product.class)
                .buildSessionFactory();
    }

    public SessionFactory getFactory() {
        return factory;
    }
}
