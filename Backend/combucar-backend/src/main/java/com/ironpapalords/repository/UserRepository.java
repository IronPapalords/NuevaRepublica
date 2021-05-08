package com.ironpapalords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ironpapalords.model.Usuario;

public interface UserRepository extends JpaRepository<Usuario, String> {
	Usuario findByCorreo(String correo);
}
