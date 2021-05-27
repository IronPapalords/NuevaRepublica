package com.ironpapalords.service;

import java.util.List;

import com.ironpapalords.model.Usuario;

public interface UsuarioService {

    Usuario save(Usuario user);

    List<Usuario> findAll();

    Usuario findOne(String username);

}
