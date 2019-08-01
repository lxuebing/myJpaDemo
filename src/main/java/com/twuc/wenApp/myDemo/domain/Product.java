package com.twuc.wenApp.myDemo.domain;

import java.math.BigDecimal;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Table(name = "products")
@Entity
public class Product {
    @Id
    @Column(name = "productCode", nullable = false, length = 15)
    private String productCode;

    @Column(name = "productName", nullable = false, length = 70)
    private String productName;

    @ManyToOne
    @JoinColumn(name = "productLine")
    private ProductLine productLine;

    @Column(name = "productScale", nullable = false, length = 10)
    private String productScale;

    @Column(name = "productVendor", nullable = false, length = 50)
    private String productVendor;

    @Column(name = "productDescription", nullable = false, columnDefinition = "text")
    private String productDescription;

    @Column(name = "quantityInStock", nullable = false)
    private Short quantityInStock;

    @Column(name = "buyPrice", nullable = false)
    private BigDecimal buyPrice;

    @Column(name = "MSRP", nullable = false)
    private BigDecimal MSRP;

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public ProductLine getProductLine() {
        return productLine;
    }

    public String getProductScale() {
        return productScale;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Short getQuantityInStock() {
        return quantityInStock;
    }

    public BigDecimal getBuyPrice() {
        return buyPrice;
    }

    public BigDecimal getMSRP() {
        return MSRP;
    }
}
