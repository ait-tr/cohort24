package com.onlineshop.service;

import com.onlineshop.controller.dto.ProductDTO;
import com.onlineshop.controller.dto.ProductsDTO;
import com.onlineshop.domain.Product;
import com.onlineshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public ProductsDTO findAll() {
        List<Product> products = productRepository.findAll();
        return ProductsDTO.getInstance(products);
    }

    public ProductDTO findById(Integer id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return ProductDTO.getInstance(product.get());
        }
        return null;
    }

    public ProductsDTO findByPartDescription(String partDescription) {
        List<Product> products = productRepository.findByDescriptionLikeIgnoreCase('%' + partDescription + '%');
        return ProductsDTO.getInstance(products);
    }

    public ProductsDTO findByCategoryId(Integer categoryId) {
        List<Product> products = productRepository.findByCategoryId(categoryId);
        return ProductsDTO.getInstance(products);
    }

}
