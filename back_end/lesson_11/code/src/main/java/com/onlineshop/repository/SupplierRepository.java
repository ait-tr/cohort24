package com.onlineshop.repository;

import com.onlineshop.domain.Suppliers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Suppliers, Integer> {
}
