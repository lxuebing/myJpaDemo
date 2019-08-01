package com.twuc.wenApp.myDemo.controller;

import com.twuc.wenApp.myDemo.domain.Product;
import com.twuc.wenApp.myDemo.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public Page<Product> getProduct(Pageable pageable){
        return productService.getProducts(pageable);
    }

//    @PostMapping("/product")
//    public Product createProduct(@RequestBody Product product){
//    }
}
