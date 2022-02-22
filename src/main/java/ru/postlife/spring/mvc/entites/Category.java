package ru.postlife.spring.mvc.entites;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String title;

    @OneToMany(mappedBy = "category_id", fetch = FetchType.EAGER)
    private List<Product> products;

    @ManyToOne
    @JoinColumn(name = "parent_category_id")
    private Category parent_category_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public Category getParent_category_id() {
        return parent_category_id;
    }

    public void setParent_category_id(Category parent_category_id) {
        this.parent_category_id = parent_category_id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < products.size(); i++) {
            if (i == products.size() - 1) {
                sb.append(products.get(i).getTitle());
                break;
            }
            sb.append(products.get(i).getTitle()).append(", ");
        }
        return "Category [" + id + ", " + title + ", Продукты: " + sb + "]";
    }
}
