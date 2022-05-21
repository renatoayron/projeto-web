package com.transportadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.transportadora.model.Franquia;
import com.transportadora.repositories.FranquiaRepository;

/**
 * FranquiaController implementa o controle de franquias e realiza requisições à classe Franquia. 
 * Gerencia os processos envolvendo as franquias da Transportadora.
 * 
 * @author Renato Ayron e Samuel Rufino
 * @version 0.0.4
 * @since 2019-09-04
 */
@Controller
public class FranquiaController {

	@Autowired
	private FranquiaRepository frq;

	/**
	 * Método para redirecionar para a lista de franquias cadastradas no repositório.
	 * 
	 * @param Nenhum.
	 * @return Retorna a request da lista de franquias.
	 */
	@RequestMapping("/listarFranquias")
	public String listarFranquias() {
		return "franquia/franquias";
	}

	/**
	 * Método para listar franquias cadastradas no repositório.
	 * 
	 * @param Nenhum.
	 * @return Retorna a lista de franquias cadastradas.
	 */
	@RequestMapping("/franquias")
	public ModelAndView listaFranquias() {
		ModelAndView mv = new ModelAndView("franquia/franquias");
		Iterable<Franquia> franquia = frq.findAll();
		mv.addObject("franquias", franquia);
		return mv;
	}

	/**
	 * Método para exibir o formulário de cadastro da Franquia.
	 * 
	 * @return Formulário de cadastro de Franquia.
	 */
	@RequestMapping(value = "/cadastrarFranquia", method = RequestMethod.GET)
	public String cadastrarFranquia() {
		return "franquia/formFranquia";
	}

	/**
	 * Método para cadastrar uma Franquia.
	 * 
	 * @param Franquia a ser cadastrada.
	 * @return Tela de franquias cadastradas.
	 */
	@RequestMapping(value = "/cadastrarFranquia", method = RequestMethod.POST)
	public String cadastrarFranquia(Franquia franquia) {
		frq.save(franquia);
		return "redirect:/franquias";
	}

	/**
	 * Método para deletar uma Franquia.
	 * 
	 * @param id da Franquia.
	 * @return Tela de franquias cadastradas.
	 */
	@RequestMapping("/deletarFranquias")
	public String deletarFranquia(@RequestParam("id") int id) {
		Franquia franquia = frq.findById(id);
		frq.delete(franquia);
		return "redirect:/franquias";
	}

	/**
	 * Método simples para editar a Franquia.
	 * 
	 * @param id da Franquia.
	 * @return A Franquia editada.
	 */
	@RequestMapping(value = "/editarFranquia", method = RequestMethod.GET)
	public ModelAndView editarFranquia(@ModelAttribute("id") int id) {
		Franquia franquia = frq.findById(id);
		ModelAndView m = new ModelAndView();
		m.setViewName("/franquia/editarFranquia");
		m.addObject("franquia", franquia);
		return m;
	}

}
