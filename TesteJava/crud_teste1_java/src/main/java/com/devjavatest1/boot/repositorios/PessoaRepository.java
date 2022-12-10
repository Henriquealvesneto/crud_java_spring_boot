package com.devjavatest1.boot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devjavatest1.boot.entidade.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
}
