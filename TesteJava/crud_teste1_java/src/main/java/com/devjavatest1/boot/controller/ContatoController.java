package com.devjavatest1.boot.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devjavatest1.boot.entidade.Contato;
import com.devjavatest1.boot.repositorios.ContatoRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ContatoController {
	
	ContatoRepository repository;
	
	@GetMapping("/contato")
	public List<Contato> getAllContatos(){
		return repository.findAll();
	}
	
	@GetMapping("/contato/{id}")
	public Contato getContatoById(@PathVariable Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/contato")
	public Contato salvarContato(@RequestBody Contato contato) {
		return repository.save(contato);
	}
	
	@DeleteMapping("/contato/{id}")
	public void deleteContato(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
