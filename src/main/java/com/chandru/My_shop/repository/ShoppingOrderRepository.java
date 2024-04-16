package com.chandru.My_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandru.My_shop.dto.ShoppingOrder;

public interface ShoppingOrderRepository extends JpaRepository<ShoppingOrder, Integer> {

	

}
