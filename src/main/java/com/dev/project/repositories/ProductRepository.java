package com.dev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	
}
