package com.transportadora.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Encomenda implementa os dados de franquias da Transportadora.
 * Realiza funções de manipulação dos dados relacionados à franquias do sistema.
 * 
 * @author Renato Ayron e Samuel Rufino
 * @version 0.0.4
 * @since 2019-09-04
 */
@Entity
@Table(name = "franquia")
public class Franquia implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "regiao")
	private String regiao;

	@Column(name = "estado")
	private String estado;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "rua")
	private String rua;

	@Column(name = "numero")
	private int numero;

	@Column(name = "aeroporto")
	private boolean aeroporto;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public boolean isAeroporto() {
		return aeroporto;
	}

	public void setAeroporto(boolean aeroporto) {
		this.aeroporto = aeroporto;
	}

	
//	@Column(name = "encomendas")
//	private List<Encomenda> encomendas;




}
