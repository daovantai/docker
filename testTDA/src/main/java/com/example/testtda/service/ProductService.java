package com.example.testtda.service;

import com.example.testtda.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> listAll();

    Product getProductById(Long id);
}
