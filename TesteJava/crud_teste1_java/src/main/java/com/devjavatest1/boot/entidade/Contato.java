package com.devjavatest1.boot.entidade;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Contato implements Serializable{
     
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne
	@JoinColumn(name="ID_PESSOA")
	 
	//@Column(nullable = false)
	private Pessoa pessoa;
	 
	//@Column(nullable = false)
    private String nome; 
	 
	//@Column(nullable = false)
    private Integer telefone;
	 
	//@Column(nullable = false)
    private Integer celular;
     
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getTelefone() {
		return telefone;
	}
	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}
	public Integer getCelular() {
		return celular;
	}
	public void setCelular(Integer celular) {
		this.celular = celular;
	}
	@Override
	public String toString() {
		return "Contato [pessoa=" + pessoa.getNome() + ", nome=" + nome + ", telefone=" + telefone + ", celular=" + celular + "]";
	}
     
    
}