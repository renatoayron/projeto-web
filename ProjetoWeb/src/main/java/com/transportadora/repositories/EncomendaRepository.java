package com.transportadora.repositories;

import org.springframework.data.repository.CrudRepository;

import com.transportadora.model.Encomenda;

/**
 * EncomendaRepository implementa o repositório de encomendas.
 * 
 * @author Renato Ayron e Samuel Rufino
 * @version 0.0.4
 * @since 2019-09-04
 */
public interface EncomendaRepository extends CrudRepository<Encomenda, Long> {

	/**
	 * Procura no repositório uma encomenda por ID.
	 * 
	 * @param O ID da Encomenda.
	 * @return A encomenda.
	 */
	Encomenda findById(int id);

}
