package com.chandru.My_shop.dto;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Component
@Data
@Entity
public class Cart {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	    List<Item> items = new ArrayList<Item>();

}
