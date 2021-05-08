package com.ironpapalords.service;

import java.util.List;

import com.ironpapalords.model.Cliente;

public interface ClientesService {

	List<Cliente> getAllClients();
	
	Cliente findByNombre(String nombre);

	Cliente findByRfc(String rfc);

	Cliente guardaCliente(Cliente cliente);
}
