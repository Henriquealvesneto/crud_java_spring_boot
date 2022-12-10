package com.devjavatest1.boot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjavatest1.boot.entidade.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long>{
     
}

