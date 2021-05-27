package com.ironpapalords.service;

import java.util.List;

import com.ironpapalords.model.Usuario;

public interface UsuarioService {

    List<Usuario> findAll();

    List<Usuario> findById(String idUsuario);

}
