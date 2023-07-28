package com.onlineshop.repository;

import com.onlineshop.domain.Categories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Categories, Integer> {
}
