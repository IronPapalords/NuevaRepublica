package com.ironpapalords.service.impl;

import com.ironpapalords.model.Usuario;
import com.ironpapalords.repository.UsuarioRepository;
import com.ironpapalords.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;


	@Override
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}

	@Override
	public List<Usuario> findById(String idUsuario) {
		return usuarioRepository.findAllById(Arrays.asList(idUsuario));
	}

}
