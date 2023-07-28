package com.onlineshop.repository;

import com.onlineshop.domain.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetails, Integer> {
}
