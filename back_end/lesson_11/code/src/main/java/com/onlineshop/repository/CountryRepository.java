package com.onlineshop.repository;

import com.onlineshop.domain.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Countries, Integer> {
}
