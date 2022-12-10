package com.devjavatest1.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devjavatest1.boot.entidade.Pessoa;
import com.devjavatest1.boot.repositorios.PessoaRepository;


@RestController
public class PessoaController {
	
	PessoaRepository repository;
	
	@GetMapping("/pessoa")
	public List<Pessoa> getAllPessoas(){
		return repository.findAll();
	}
	
	@GetMapping("/pessoa/{id}")
	public Pessoa getPessoaById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/pessoa")
	public Pessoa salvarPessoa(@RequestBody Pessoa pessoa) {
		return repository.save(pessoa);
	}
	
	@DeleteMapping("/pessoa/{id}")
	public void deletePessoa(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
