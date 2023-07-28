package com.onlineshop.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "products")
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer productId;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Categories.class)
    @JoinColumn(name = "categoryId", nullable = false)
    private Categories category;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Suppliers.class)
    @JoinColumn(name = "supplierId", nullable = false)
    private Suppliers supplier;

    private String productName;
    private String description;
    private Float price;
    private Boolean isDeleted;
}
