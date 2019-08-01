package com.twuc.wenApp.myDemo.service;

import com.twuc.wenApp.myDemo.domain.Product;
import com.twuc.wenApp.myDemo.domain.ProductLine;
import com.twuc.wenApp.myDemo.repository.ProductLineRepository;
import com.twuc.wenApp.myDemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductLIneService {
    final
    ProductLineRepository productLineRepository;

    public ProductLIneService(ProductLineRepository productLineRepository) {
        this.productLineRepository = productLineRepository;
    }

    public Page<ProductLine> getProductLines(Pageable pageable){
        return productLineRepository.findAll(pageable);
    }

}
