package com.twuc.wenApp.myDemo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "productlines")
public class ProductLine {
    @Id
    @Column(nullable = false, length = 50)
    private String productLine;

    @Column
    @Size(max = 4000)
    private String textDescription;

    public String getProductLine() {
        return productLine;
    }

    public String getTextDescription() {
        return textDescription;
    }
}
