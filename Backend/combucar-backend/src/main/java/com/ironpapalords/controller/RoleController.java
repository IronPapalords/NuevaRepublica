package com.ironpapalords.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ironpapalords.model.Role;
import com.ironpapalords.repository.RoleRepository;

@RestController
public class RoleController {

	@Autowired
	RoleRepository roleRepo;

	@GetMapping("/roles")
	List<Role> getAll() {
		return roleRepo.findAll();
	}

	@PostMapping("/roles")
	Role newRole(@RequestBody Role role) {
		return roleRepo.save(role);
	}

	@PutMapping("/roles/{id}")
	Role replaceRole(@RequestBody Role newRole, @PathVariable Long id) {
		return roleRepo.save(newRole);
	}

	@DeleteMapping("/roles/{id}")
	void deleteRole(@PathVariable Long correo) {
		roleRepo.deleteById(correo);
	}

}
