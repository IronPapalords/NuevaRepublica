package com.ironpapalords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ironpapalords.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findRoleByNombre(String nombre);
}
