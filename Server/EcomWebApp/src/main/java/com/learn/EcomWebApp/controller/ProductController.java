package com.learn.EcomWebApp.controller;


import com.learn.EcomWebApp.model.Product;
import com.learn.EcomWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/")
    public String greet(){
        return "Hello World";
    }


    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return  service.getAllProducts();
    }

}
