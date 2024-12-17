package com.example.springboot_grapql.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.example.springboot_grapql.entity.Product;
import com.example.springboot_grapql.service.ProductService;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @QueryMapping
    public List<Product> getAllProducts() {
            return productService.getAllProducts();
        }

    @QueryMapping
    public List<Product> getProductsByCategory(@Argument String category) {
        return productService.getProductsByCategory(category);
    }

    @MutationMapping
    public Product updateStock(@Argument int id, @Argument int stock) {
        return productService.updateStock(id, stock);
    }

    @MutationMapping
    public Product receiveNewShipment(@Argument int id, @Argument int quantity) {
        return productService.receiveNewShipment(id, quantity);
    }
}
