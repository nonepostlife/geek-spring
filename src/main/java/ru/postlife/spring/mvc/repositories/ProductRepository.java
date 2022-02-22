package ru.postlife.spring.mvc.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.postlife.spring.mvc.dao.ProductDao;
import ru.postlife.spring.mvc.entites.Product;

import java.util.List;

@Component
public class ProductRepository {

    private ProductDao productDao;

    @Autowired
    public void setProductDao(ProductDao productDao) {this.productDao = productDao;}

    public List<Product> findAll() {
        return productDao.findAll();
    }

}
