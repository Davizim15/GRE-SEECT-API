package com.codata.CartaServicos2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codata.CartaServicos2.Entity.Servico;
import com.codata.CartaServicos2.repository.ServicoRepository;

@RestController
@RequestMapping("/servico")
public class ServicoController {

	@Autowired
	private ServicoRepository servicoRepository;
	
	@GetMapping
	public List<Servico> listar() {
		return servicoRepository.findAll();	   
	}
	
	@GetMapping("/{id}")
	public Servico detalhar(@RequestParam long id) {
		return servicoRepository.getById(id);	   
	}
	
	@PostMapping
	public Servico adicionar(@RequestBody Servico servico) {
		return servicoRepository.save(servico);
	}
}
