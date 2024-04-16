package com.chandru.My_shop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.chandru.My_shop.dto.Customer;
import com.chandru.My_shop.repository.CustomerRepository;

@Repository
public class CustomerDao {
	@Autowired
	CustomerRepository repository;

	public Customer save(Customer customer) {
		return repository.save(customer);
	}

	public boolean checkEmailDuplicate(String email) {
		return repository.existsByEmail(email);
	}

	public boolean checkMobileDuplicate(long mobile) {
		return repository.existsByMobile(mobile);
	}

	public Customer findById(int id) {
		return repository.findById(id).orElse(null);
	}

	public Customer findByEmail(String email) {
		return repository.findByEmail(email);
	}

}
