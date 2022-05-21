package com.transportadora.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Encomenda implementa os dados de usuários da Transportadora. Realiza funções
 * de manipulação dos dados relacionados à usuários do sistema.
 * 
 * @author Renato Ayron e Samuel Rufino
 * @version 0.0.4
 * @since 2019-09-04
 */
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private String id;

	@Column(name = "nome")
	private String nome;

	@Column(name = "senha")
	private String senha;

	@Column(name = "tipousr")
	private String tipousr;

	@Column(name = "idfranquia")
	private String idfranquia;

	@Transient
	private String senhaConfirm;
	
	/**
	 * @param userId
	 * @param nome
	 * @param senha
	 * @param tipousr
	 * @param idfranquia
	 */
	public Usuario(String id, String nome, String senha, String tipousr, String idfranquia) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
		this.tipousr = tipousr;
		this.idfranquia = idfranquia;
	}

	/**
	 * 
	 * @param Nenhum.
	 * @return ID do usuário.
	 */
	public String getId() {
		return id;
	}

	/**
	 * 
	 * @param ID do usuário.
	 * @return Nada.
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 
	 * @param Nenhum.
	 * @return O nome do usuário.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param O nome do usuário.
	 * @return Nada.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * @param Nenhum.
	 * @return A senha do usuário.
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * 
	 * @param A senha do usuário.
	 * @return Nada.
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * 
	 * @param Nenhum
	 * @return Tipo de usuário
	 */
	public String getTipousr() {
		return tipousr;
	}

	/**
	 * 
	 * @param Tipo de usuário.
	 * @return Nada.
	 */
	public void setTipousr(String tipousr) {
		this.tipousr = tipousr;
	}

	/**
	 * 
	 * @param Nenhum.
	 * @return O ID da Franquia
	 */
	public String getIdfranquia() {
		return idfranquia;
	}

	/**
	 * 
	 * @param O ID da Franquia
	 * @return Nada.
	 */
	public void setIdfranquia(String idfranquia) {
		this.idfranquia = idfranquia;
	}

	public String getSenhaConfirm() {
        return senhaConfirm;
    }

    public void setSenhaConfirm(String senhaConfirm) {
        this.senhaConfirm = senhaConfirm;
    }
	
}