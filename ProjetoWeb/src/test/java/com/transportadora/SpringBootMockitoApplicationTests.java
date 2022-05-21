package com.transportadora;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.transportadora.model.Usuario;
import com.transportadora.repositories.UsuarioRepository;
import com.transportadora.service.UsuarioService;

/**
 * SpringBootMockitoApplicationTests realiza testes para o sistema
 * 
 * @author Renato Ayron e Samuel Rufino
 * @version 0.0.4
 * @since 2019-09-04
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootMockitoApplicationTests {

	@Autowired
	private UsuarioService service;

	@MockBean
	private UsuarioRepository repository;

	public void getUsuariosTest() {
		when(repository.findAll()).thenReturn(Stream
				.of(new Usuario("AB12CE", "Flávio", "flavio123", "adm", "CB14AF"), new Usuario("VB33AD", "Beatriz", "beatriz123", "op", "CB14AF")).collect(Collectors.toList()));
		assertEquals(2, service.getUsuarios().size());
	}

	public void getUsuariosByNameTest() {
		String nome = "Flávio";
		when(repository.findByName(nome)).thenReturn(Stream
				.of(new Usuario("AB12CE", "Flávio", "flavio123", "adm", "CB14AF")).collect(Collectors.toList()));
		assertEquals(1, service.getUsuariosByName(nome).size());
	}
	
	public void saveUsuarioTest() {
		Usuario usuario = new Usuario("FG45DD", "Júlia", "julia123", "adm", "FF76AC");
		when(repository.save(usuario)).thenReturn(usuario);
		assertEquals(usuario, service.addUsuario(usuario));
	}
	
	public void deleteUsuarioTest() {
		Usuario usuario = new Usuario("FG45DD", "Júlia", "julia123", "adm", "FF76AC");
		service.deleteUsuario(usuario);
		verify(repository, times(1)).delete(usuario);
	}
	
}
