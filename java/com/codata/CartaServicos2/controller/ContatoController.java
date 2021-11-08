package com.codata.CartaServicos2.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codata.CartaServicos2.Entity.Contato;
import com.codata.CartaServicos2.repository.ContatoRepository;


@RestController
@RequestMapping("/contato")
public class ContatoController {

	@Autowired
	private ContatoRepository contatoRepository;
	
	@GetMapping
	public List<Contato> listar() {
		return contatoRepository.findAll();	   
	}
	
	@GetMapping("/{id}")
	public Contato detalhar(@RequestParam long id) {
		return contatoRepository.getById(id);	   
	}
	
	@PostMapping("/{add}")
	public Contato adicionar(@RequestBody Contato contato) {
		return contatoRepository.save(contato);
	}
}
