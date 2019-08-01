package com.twuc.wenApp.myDemo.service;

import com.twuc.wenApp.myDemo.domain.Product;
import com.twuc.wenApp.myDemo.domain.ProductLine;
import com.twuc.wenApp.myDemo.repository.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<Product> getProducts(Pageable pageable){
        return productRepository.findAll(pageable);
    }

}
