package com.dev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

	
}
