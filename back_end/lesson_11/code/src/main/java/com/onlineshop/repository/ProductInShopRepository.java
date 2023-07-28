package com.onlineshop.repository;

import com.onlineshop.domain.ProductsInShop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductInShopRepository extends JpaRepository<ProductsInShop, Integer> {
}
