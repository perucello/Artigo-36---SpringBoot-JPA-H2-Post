package com.project.jpa.JavaJPA.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.jpa.JavaJPA.model.Cliente;
import com.project.jpa.JavaJPA.repository.Clientes;


@RestController
@RequestMapping("api/JPA/clientes")
public class ClientesController {
	
	@Autowired
	private Clientes clientes;
	
	@PostMapping("/add")
	public Cliente adicionar(@Valid @RequestBody Cliente cliente) {	
		return clientes.save(cliente);
	}
		
}
