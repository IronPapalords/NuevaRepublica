package com.ironpapalords.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ironpapalords.model.Cliente;
import com.ironpapalords.service.ClienteService;

@RestController("/catalogs/v1")
public class CatalogosController {

	@Autowired
	ClienteService clienteService;

	@GetMapping("/clientes")
	List<Cliente> getAll() {
		return clienteService.getAllClients();
	}

	@PostMapping("/client")
	Cliente newUser(@RequestBody Cliente cliente) {
		return clienteService.guardaCliente(cliente);
	}

	//TODO Agregar lo correspondiente a los demas metodos, 
	// decidi solo poner un controller para todos estos porque 
	// considero que solo seran CRUDS de momento.

}
