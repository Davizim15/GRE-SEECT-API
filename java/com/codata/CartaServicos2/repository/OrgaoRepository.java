package com.codata.CartaServicos2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codata.CartaServicos2.Entity.Orgao;

@Repository
public interface OrgaoRepository  extends JpaRepository<Orgao, Long>{
	
	Orgao findById(long id); 
}
