package com.myretail.product.service;

import com.myretail.product.dao.ProductRepository;
import com.myretail.product.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public Product findById(String id) {
        Product p = productRepository.findById(id).orElse(null);
        System.out.println("====service p=" + p);
        return p;
    }
}

