package ru.postlife.spring.hibernate;

import javax.management.remote.rmi._RMIConnection_Stub;
import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "price")
    private int price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Category getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Category category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Category parent = category_id.getParent_category_id();
        Category sub = category_id;
        while (parent != null) {
            sb.append(sub.getTitle()).append(" <-");
            sub = parent;
            parent = parent.getParent_category_id();
        }
        sb.append(" ").append(sub.getTitle());
        return "Product [" + id + ", " + title + ", " + price + " руб., " + sb + "]";
    }
}