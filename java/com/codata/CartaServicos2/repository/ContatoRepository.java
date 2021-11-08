package com.codata.CartaServicos2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codata.CartaServicos2.Entity.Contato;


@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long>{

}


