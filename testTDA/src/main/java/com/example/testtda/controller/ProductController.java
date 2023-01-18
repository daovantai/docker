package com.example.testtda.controller;

import com.example.testtda.model.Product;
import com.example.testtda.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> listAll(){
        return productService.listAll();
    }
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable Long id){
        return productService.getProductById(id);
    }
}
