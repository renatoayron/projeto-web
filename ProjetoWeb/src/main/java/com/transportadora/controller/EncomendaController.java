package com.transportadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.transportadora.model.Encomenda;
import com.transportadora.repositories.EncomendaRepository;

/**
 * EncomendaController implementa o controle de encomendas e realiza requisições à classe Encomenda. 
 * Gerencia os processos envolvendo as encomendas da Transportadora.
 * 
 * @author Renato Ayron e Samuel Rufino
 * @version 0.0.4
 * @since 2019-09-04
 */
@Controller
public class EncomendaController {

	@Autowired
	private EncomendaRepository enc;

	/**
	 * Método para redirecionar para a lista de encomendas cadastradas no repositório.
	 * 
	 * @param Nenhum.
	 * @return Retorna a request da lista de encomendas.
	 */
	@RequestMapping("/listarEncomendas")
	public String listarEncomendas() {
		return "encomenda/encomendas";
	}

	/**
	 * Método para listar encomendas cadastradas no repositório.
	 * 
	 * @param Nenhum.
	 * @return Retorna a lista de encomendas cadastradas.
	 */
	@RequestMapping("/encomendas")
	public ModelAndView listaEncomendas() {
		ModelAndView mv = new ModelAndView("encomenda/encomendas");
		Iterable<Encomenda> encomenda = enc.findAll();
		mv.addObject("encomendas", encomenda);
		return mv;
	}

	/**
	 * Método para exibir o formulário de cadastro da Encomenda.
	 * 
	 * @return Formulário de cadastro de Encomenda.
	 */
	@RequestMapping(value = "/cadastrarEncomenda", method = RequestMethod.GET)
	public String cadastrarEncomenda() {
		return "encomenda/formEncomenda";
	}

	/**
	 * Método para cadastrar uma Encomenda.
	 * 
	 * @param Encomenda a ser cadastrada.
	 * @return Tela de encomendas cadastradas.
	 */
	@RequestMapping(value = "/cadastrarEncomenda", method = RequestMethod.POST)
	public String cadastrarEncomenda(Encomenda encomenda) {
		enc.save(encomenda);
		return "redirect:/encomendas";
	}

	/**
	 * Método para deletar uma Encomenda.
	 * 
	 * @param id da Encomenda.
	 * @return Tela de encomendas cadastradas.
	 */
	@RequestMapping("/deletarEncomenda")
	public String deletarEncomenda(@RequestParam("id") int id) {
		Encomenda encomenda = enc.findById(id);
		enc.delete(encomenda);
		return "redirect:/encomendas";
	}

	/**
	 * Método simples para editar a Encomenda.
	 * 
	 * @param id da Encomenda.
	 * @return A Encomenda editada.
	 */
	@RequestMapping(value = "/editarEncomenda", method = RequestMethod.GET)
	public ModelAndView editarEncomenda(@ModelAttribute("id") int id) {
		Encomenda encomenda = enc.findById(id);
		ModelAndView m = new ModelAndView();
		m.setViewName("/encomenda/editarEncomenda");
		m.addObject("encomenda", encomenda);
		return m;
	}

}
