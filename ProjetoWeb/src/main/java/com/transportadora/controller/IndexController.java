package com.transportadora.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * IndexController implementa o controle do Home da aplicação.
 * 
 * @author Renato Ayron e Samuel Rufino
 * @version 0.0.4
 * @since 2019-09-04
 */
@Controller
public class IndexController {

	/**
	 * 
	 * @param Nenhum.
	 * @return Página Home da Aplicação
	 */
	@RequestMapping
	public String index() {
		return "index";
	}
}
