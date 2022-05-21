package com.transportadora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * PaocomovoApplication implementa a aplicação principal. 
 * Quando executamos essa classe, inicia-se a aplicação.
 * 
 * @author Renato Ayron e Samuel Rufino
 * @version 0.0.4
 * @since 2019-09-04
 */
@ComponentScan({"com.transportadora.controller"})
@SpringBootApplication
public class PaocomovoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaocomovoApplication.class, args);
	}

}
