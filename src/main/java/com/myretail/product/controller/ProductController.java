package com.myretail.product.controller;

import com.myretail.product.model.Product;
import com.myretail.product.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ProductController {

    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
        System.out.println("========controller created");
    }

    @GetMapping(value = "/products/{id}", produces = "application/json")
    public @ResponseBody
    Product getProduct(@PathVariable String id) {
        System.out.println("========controller getProduct");
        return productService.findById(id);
    
    }

    @PostMapping(value = "/products" , consumes = "application/json" , produces = "application/json")
    ResponseEntity<Product>  save(@RequestBody com.myretail.product.model.Product product) {
        System.out.println("=======create product");
        Product saved = productService.save(product);
        return ResponseEntity.ok().body(saved);
    }
}

