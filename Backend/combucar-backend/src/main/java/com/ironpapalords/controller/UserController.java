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

import com.ironpapalords.model.Usuario;
import com.ironpapalords.repository.UsuarioRepository;

@RestController("/api/v1")
public class UserController {

	@Autowired
	UsuarioRepository userRepo;

	@GetMapping("/users")
	List<Usuario> getAll() {
		return userRepo.findAll();
	}

	@PostMapping("/users")
	Usuario newUser(@RequestBody Usuario user) {
		return userRepo.save(user);
	}

	@PutMapping("/users/{correo}")
	Usuario replaceUser(@RequestBody Usuario newUser, @PathVariable String correo) {
		return userRepo.save(newUser);
	}

	@DeleteMapping("/users/{correo}")
	void deleteUser(@PathVariable String correo) {
		userRepo.deleteById(correo);
	}

}
