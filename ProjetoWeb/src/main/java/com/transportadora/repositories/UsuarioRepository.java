package com.transportadora.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.transportadora.model.Usuario;

/**
 * EncomendaRepository implementa o repositório de usuários.
 * 
 * @author Renato Ayron e Samuel Rufino
 * @version 0.0.4
 * @since 2019-09-04
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Serializable>{
	
	/**
	 * Procura no repositório um usuário por ID.
	 * 
	 * @param O ID do Usuario.
	 * @return O usuário.
	 */
	Usuario findById(String id);
	List<Usuario> findUsersById(String id);
	List<Usuario> findByName(String nome);
	
}