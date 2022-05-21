package com.transportadora.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.transportadora.model.Usuario;
import com.transportadora.repositories.UsuarioRepository;

/**
 * UsuarioController implementa o controle de usuários e realiza requisições à classe Usuario. 
 * Gerencia os processos envolvendo as usuários da Transportadora.
 * 
 * @author Renato Ayron e Samuel Rufino
 * @version 0.0.4
 * @since 2019-09-04
 */
@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usr;

	/**
	 * Método para redirecionar para a lista de usuários cadastrados no repositório.
	 * 
	 * @param Nenhum.
	 * @return Retorna a request da lista de usuários.
	 */
	@RequestMapping("/listarUsuarios")
	public String listarUsuarios(){
		return "usuario/usuarios";
	}
	
	/**
	 * Método para listar usuários cadastrados no repositório.
	 * 
	 * @param Nenhum.
	 * @return Retorna a lista de usuários cadastrados.
	 */
	@RequestMapping("/usuarios")
	public ModelAndView listausuarios() {
	ModelAndView mv = new ModelAndView("usuario/usuarios");
	Iterable<Usuario> usuarios = usr.findAll();
	mv.addObject("usuarios", usuarios);
	return mv;
	}
	
	/**
	 * Método para exibir o formulário de cadastro de Usuario.
	 * 
	 * @return Formulário de cadastro de Usuario.
	 */
	@RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.GET)
	public String cadastrarUsuario() {
		return "usuario/formUsuario";
	}
	

	/**
	 * Método para cadastrar um Usuario.
	 * 
	 * @param Usuario a ser cadastrado.
	 * @return Tela de usuários cadastrados.
	 */
	@RequestMapping(value = "/cadastrarUsuario", method = RequestMethod.POST)
	public String cadastrarUsuario(Usuario usuario) {
		usr.save(usuario);
		return "redirect:/usuarios";
	}
	
	/**
	 * Método para deletar um Usuario.
	 * 
	 * @param id do Usuario.
	 * @return Tela de usuários cadastrados.
	 */
	@RequestMapping("/deletarUsuario")
	public String deletarUsuario(@RequestParam("id") String id) {
		Usuario usuario = usr.findById(id);
		usr.delete(usuario);
		return "redirect:/usuarios";		
	}
	
	/**
	 * Método simples para editar o Usuario.
	 * 
	 * @param id do Usuario.
	 * @return O Usuario editado.
	 */
	@RequestMapping(value = "/editarUsuario", method = RequestMethod.GET)
	public ModelAndView editarUsuario(@ModelAttribute("id") String id) {
		Usuario usuario = usr.findById(id);		
		ModelAndView m = new ModelAndView();
		m.setViewName("/usuario/editarUsuario");
		m.addObject("usuario", usuario);
		return m;	
	}
	
}
