package com.codata.CartaServicos2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codata.CartaServicos2.Entity.Servico;

@Repository
public interface ServicoRepository extends JpaRepository<Servico, Long>{

}
