package com.chandru.My_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandru.My_shop.dto.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	boolean existsByName(String name);

	Product findByName(String name);

	

}
