package com.harsh.springframework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.springframework.domain.Product;

/**
 * Created by jt on 1/10/17.
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
