package com.nnt.demo.service;

import com.nnt.demo.model.Product;
import com.nnt.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public void save(Product product){
        productRepository.save(product);
    }
}


