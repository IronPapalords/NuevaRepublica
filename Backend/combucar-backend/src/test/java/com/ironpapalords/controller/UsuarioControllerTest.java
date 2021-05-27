package com.ironpapalords.controller;

import com.ironpapalords.model.Usuario;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UsuarioControllerTest {

	@Autowired
	private UsuarioController usuarioController;

	@Test
	public void getUsuarios(){
		List<Usuario> usuarios =  usuarioController.getAll();
		System.out.println("----TEST----");
		usuarios.forEach(System.out::println);
	}

}
