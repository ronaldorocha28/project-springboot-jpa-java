package com.dev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

	
}
