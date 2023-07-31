package com.onlineshop.controller;

import com.onlineshop.domain.Product;
import com.onlineshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Операции с товарными позициями:
 * - найти все товарные позиции
 * - найти товарную позицию по id
 * - найти товарные позиции по части названия
 * - найти товарные позиции по категории
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product> findAll() {
        return productService.findAll();
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Integer id) {
        return productService.findById(id);
    }

    @GetMapping("/category/{categoryId}")
    public List<Product> findByCategory(@PathVariable Integer categoryId) {
        return productService.findByCategoryId(categoryId);
    }
}
