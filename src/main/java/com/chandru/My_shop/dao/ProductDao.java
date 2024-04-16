package com.chandru.My_shop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.chandru.My_shop.dto.Product;
import com.chandru.My_shop.repository.ProductRepository;

import jakarta.validation.Valid;

@Repository
public class ProductDao {

	@Autowired
	ProductRepository productRepository;

	public boolean checkName(String name) {
		return productRepository.existsByName(name);
	}

	public void save(@Valid Product product) {
		productRepository.save(product);
		
	}

	public List<Product> fetchAll() {
		return productRepository.findAll();
	}

	public Product findById(int id) {
		
		return productRepository.findById(id).orElseThrow();
	}

	public void delete(Product product) {
		 productRepository.delete(product);
		
	}

	public Product findByName(String name) {
		return productRepository.findByName(name);
	}
	

}
