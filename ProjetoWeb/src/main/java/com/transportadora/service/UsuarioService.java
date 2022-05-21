package com.transportadora.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transportadora.model.Usuario;
import com.transportadora.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	public Usuario addUsuario(Usuario usuario) {
		return repository.save(usuario);
	}
	
	public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = (List<Usuario>) repository.findAll();
		System.out.println("Getting data from DB : " + usuarios);
		return usuarios;
	}
	
	public List<Usuario> getUsuariosByName(String nome){
		return repository.findByName(nome);
	}
	
	public void deleteUsuario(Usuario usuario) {
		repository.delete(usuario);
	}
	
}
