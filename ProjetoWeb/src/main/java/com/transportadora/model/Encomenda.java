package com.transportadora.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Encomenda implementa os dados de encomendas da Transportadora.
 * Realiza funções de manipulação dos dados relacionados à encomendas do sistema.
 * 
 * @author Renato Ayron e Samuel Rufino
 * @version 0.0.4
 * @since 2019-09-04
 */
@Entity
@Table(name = "encomenda")
public class Encomenda implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "remetente")
	private String remetente;

	@Column(name = "destinatario")
	private String destinatario;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "franquiaOrigem")
	private String franquiaOrigem;

	@Column(name = "franquiaDestino")
	private String franquiaDestino;

	@Column(name = "modoEncomenda")
	private String modoEncomenda;

	/**
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return
	 */
	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	/**
	 * 
	 * @return
	 */
	public String getDestinatario() {
		return destinatario;
	}

	/**
	 * 
	 * @param destinatario
	 */
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	/**
	 * 
	 * @return
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * 
	 * @param endereco
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * 
	 * @return
	 */
	public String getFranquiaOrigem() {
		return franquiaOrigem;
	}

	/**
	 * 
	 * @param franquiaOrigem
	 */
	public void setFranquiaOrigem(String franquiaOrigem) {
		this.franquiaOrigem = franquiaOrigem;
	}

	/**
	 * 
	 * @return
	 */
	public String getFranquiaDestino() {
		return franquiaDestino;
	}

	/**
	 * 
	 * @param franquiaDestino
	 */
	public void setFranquiaDestino(String franquiaDestino) {
		this.franquiaDestino = franquiaDestino;
	}

	/**
	 * 
	 * @return
	 */
	public String getModoEncomenda() {
		return modoEncomenda;
	}

	/**
	 * 
	 * @param modoEncomenda
	 */
	public void setModoEncomenda(String modoEncomenda) {
		this.modoEncomenda = modoEncomenda;
	}


}
