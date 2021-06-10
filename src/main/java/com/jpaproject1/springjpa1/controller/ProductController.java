package com.jpaproject1.springjpa1.controller;

import com.jpaproject1.springjpa1.Repository.ProductRepository;
import com.jpaproject1.springjpa1.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/saveProduct")
    public String saveProduct(@RequestBody Product product){
        productRepository.save(product);
        return "product saved";
    }

}
