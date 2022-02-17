package ru.postlife.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.postlife.spring.mvc.entites.Product;
import ru.postlife.spring.mvc.service.ProductService;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(path = "/show", method = RequestMethod.GET)
    @ResponseBody
    public List<Product> showProduct(Model uiModel) {
        return productService.getProducts();
    }
}