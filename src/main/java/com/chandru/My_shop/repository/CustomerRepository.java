package com.chandru.My_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandru.My_shop.dto.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	boolean existsByEmail(String email);

	boolean existsByMobile(long mobile);

	Customer findByEmail(String email);

	

}
