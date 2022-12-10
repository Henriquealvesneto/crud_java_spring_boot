package com.devjavatest1.boot.entidade;


import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;


@Entity
public class Pessoa implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
   	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private Integer CPF;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String email;

	private Integer CEP;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String UF;
	
	@OneToMany
	@JoinColumn(name="ID_PESSOA")
	private List<Contato> contatos;
	
	public long getId() {
		return id;
	}
	public void setId(long Id) {
		id = Id;
	}
	public Integer getCPF() {
		return CPF;
	}
	public void setCPF(Integer cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getCEP() {
		return CEP;
	}
	public void setCEP(Integer cEP) {
		CEP = cEP;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	
	public List<Contato> getContatos() {
		return contatos;
	}
	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}
	@Override
	public int hashCode() {
		return getClass().hashCode();
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pessoa other = (Pessoa) obj;
		return id == other.id;
	}
	
	@Override
	public String toString() {
		return "Pessoa [Id=" + id + ", CPF=" + CPF + ", nome=" + nome + ", email=" + email + "]";
	}
	
	
	
}

 
