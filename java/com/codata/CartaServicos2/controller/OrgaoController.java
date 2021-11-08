package com.codata.CartaServicos2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codata.CartaServicos2.Entity.Orgao;
import com.codata.CartaServicos2.repository.OrgaoRepository;

import lombok.RequiredArgsConstructor;

@CrossOrigin
@RequiredArgsConstructor
@RestController
@RequestMapping("/orgao")
public class OrgaoController {

	@Autowired
	private OrgaoRepository orgaoRepository;
	
	@GetMapping
	public List<Orgao> listar() {
		return orgaoRepository.findAll();	
	}
	
	@GetMapping("/orgao/{id}")
	public Orgao detalhar(@PathVariable(value="id") long id) {
		return orgaoRepository.getById(id);	   
	
	}
	
	@PostMapping("/add")
	public Orgao adicionar(@RequestBody Orgao orgao) {
		return orgaoRepository.save(orgao);	
	}
}
