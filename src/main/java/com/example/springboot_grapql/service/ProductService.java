package com.example.springboot_grapql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot_grapql.entity.Product;
import com.example.springboot_grapql.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }
    //sales team : update the stock of a product in (IS)
    public Product updateStock(int id, int stock) {
        Product existingProduct= productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found with id "+id));

        existingProduct.setStock(stock);
        return productRepository.save(existingProduct);
    }

    //warehouse : receive new shipment
    public Product receiveNewShipment(int id, int quantity){

        Product existingProduct= productRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Product not found with id "+id));

       existingProduct.setStock(existingProduct.getStock()+quantity);
       return productRepository.save(existingProduct);
    }
}
