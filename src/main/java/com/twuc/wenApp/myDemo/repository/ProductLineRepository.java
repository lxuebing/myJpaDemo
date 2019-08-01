package com.twuc.wenApp.myDemo.repository;

import com.twuc.wenApp.myDemo.domain.ProductLine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductLineRepository extends JpaRepository<ProductLine, String> {
    Page<ProductLine> findAll(Pageable pageable);
}
