package com.transportadora.repositories;

import org.springframework.data.repository.CrudRepository;

import com.transportadora.model.Franquia;

/**
 * EncomendaRepository implementa o repositório de franquias.
 * 
 * @author Renato Ayron e Samuel Rufino
 * @version 0.0.4
 * @since 2019-09-04
 */
public interface FranquiaRepository extends CrudRepository<Franquia, Long> {
	
	/**
	 * Procura no repositório uma franquia por ID.
	 * 
	 * @param O ID da Fraquia.
	 * @return A franquia.
	 */
	Franquia findById(int id);
	
}
