package com.ironpapalords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ironpapalords.model.User;

public interface UserRepository extends JpaRepository<User, String> {
	User findByCorreo(String correo);
}
