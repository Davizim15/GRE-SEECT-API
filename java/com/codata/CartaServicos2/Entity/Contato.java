package com.codata.CartaServicos2.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Contato {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String telefone;

	@Column(nullable = false)
	private String cep;

	@Column(nullable = false)
	private String endereco;

	@Column(nullable = false)
	private String municipio;

	@Column(nullable = false)
	private String bairro;

	@Column(nullable = false)
	private int numero;

}
