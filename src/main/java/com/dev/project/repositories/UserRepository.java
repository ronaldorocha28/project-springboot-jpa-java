package com.dev.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	
}
