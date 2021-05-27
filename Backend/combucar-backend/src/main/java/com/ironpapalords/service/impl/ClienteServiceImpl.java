package com.ironpapalords.service.impl;

import com.ironpapalords.model.Cliente;
import com.ironpapalords.repository.ClienteRepository;
import com.ironpapalords.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    
    @Override
    public Cliente findByNombre(String nombre) {
        Cliente cliente = clienteRepository.findRoleByNombre(nombre);
        return cliente;
    }

	@Override
	public Cliente findByRfc(String rfc) {
		Cliente cliente = clienteRepository.findRoleByRfc(rfc);
        return cliente;
	}

	@Override
	public List<Cliente> getAllClients() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente guardaCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
}
