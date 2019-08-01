package com.twuc.wenApp.myDemo.controller;

import com.twuc.wenApp.myDemo.domain.Product;
import com.twuc.wenApp.myDemo.domain.ProductLine;
import com.twuc.wenApp.myDemo.service.ProductLIneService;
import com.twuc.wenApp.myDemo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductLineController {
    final
    ProductLIneService productLIneService;

    public ProductLineController(ProductLIneService productLIneService) {
        this.productLIneService = productLIneService;
    }

    @GetMapping("/product-lines")
    public Page<ProductLine> getProductLine(Pageable pageable){
        return productLIneService.getProductLines(pageable);
    }
}
