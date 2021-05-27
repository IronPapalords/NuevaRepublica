package com.ironpapalords.controller;

import java.util.List;

import com.ironpapalords.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.ironpapalords.model.Usuario;
import com.ironpapalords.repository.UsuarioRepository;

@RestController
@RequestMapping("/v1")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@GetMapping("/usuarios")
	List<Usuario> getAll() {
		return usuarioService.findAll();
	}

}
