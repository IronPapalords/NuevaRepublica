package com.ironpapalords.repository;

import com.ironpapalords.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	Cliente findRoleByNombre(String nombre);

	Cliente findRoleByRfc(String rfc);

}
