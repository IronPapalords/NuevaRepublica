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

import com.ironpapalords.model.Rol;
import com.ironpapalords.repository.RolRepository;

@RestController
public class RoleController {

	@Autowired
	RolRepository roleRepo;

	@GetMapping("/roles")
	List<Rol> getAll() {
		return roleRepo.findAll();
	}

	@PostMapping("/roles")
	Rol newRole(@RequestBody Rol rol) {
		return roleRepo.save(rol);
	}

	@PutMapping("/roles/{id}")
	Rol replaceRole(@RequestBody Rol newRol, @PathVariable Long id) {
		return roleRepo.save(newRol);
	}

	@DeleteMapping("/roles/{id}")
	void deleteRole(@PathVariable Long correo) {
		roleRepo.deleteById(correo);
	}

}
