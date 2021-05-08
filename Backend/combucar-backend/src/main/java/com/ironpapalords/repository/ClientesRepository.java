package com.ironpapalords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ironpapalords.model.Cliente;

public interface ClientesRepository extends JpaRepository<Cliente, Long> {

	Cliente findRoleByNombre(String nombre);

	Cliente findRoleByRfc(String rfc);

}
