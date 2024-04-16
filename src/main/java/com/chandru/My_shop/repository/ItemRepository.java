package com.chandru.My_shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandru.My_shop.dto.Item;

public interface ItemRepository extends JpaRepository<Item, Integer> {

}
