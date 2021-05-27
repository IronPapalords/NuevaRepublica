package com.ironpapalords.repository;

import com.ironpapalords.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String> {

	Usuario findByCorreo(String correo);

}
