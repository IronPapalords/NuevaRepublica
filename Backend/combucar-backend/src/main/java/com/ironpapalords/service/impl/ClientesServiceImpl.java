package com.ironpapalords.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ironpapalords.model.Cliente;
import com.ironpapalords.repository.ClientesRepository;
import com.ironpapalords.service.ClientesService;

@Service(value = "clientesService")
public class ClientesServiceImpl implements ClientesService {

    @Autowired
    private ClientesRepository clienteRepo;
    
    @Override
    public Cliente findByNombre(String nombre) {
        Cliente cliente = clienteRepo.findRoleByNombre(nombre);
        return cliente;
    }

	@Override
	public Cliente findByRfc(String rfc) {
		Cliente cliente = clienteRepo.findRoleByRfc(rfc);
        return cliente;
	}

	@Override
	public List<Cliente> getAllClients() {
		return clienteRepo.findAll();
	}

	@Override
	public Cliente guardaCliente(Cliente cliente) {
		return clienteRepo.save(cliente);
	}
}
