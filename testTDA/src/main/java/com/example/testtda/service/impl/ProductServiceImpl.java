package com.example.testtda.service.impl;

import com.example.testtda.model.Product;
import com.example.testtda.repository.ProductRepo;
import com.example.testtda.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> listAll() {
        return productRepo.findAll();
    }
}
