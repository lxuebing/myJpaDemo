package com.twuc.wenApp.myDemo.repository;

import com.twuc.wenApp.myDemo.domain.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
    Page<Product> findAll(Pageable pageable);
}
