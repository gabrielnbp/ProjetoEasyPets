package com.easypets.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@SuppressWarnings("serial")
@Table(name = "INFOS_PETS")
public class Pet extends AbstractEntity<Long>{
	
	@Column(name = "nome", nullable = false, length = 40)
	private String nome;
	
	@Column(name = "raca", nullable = false, length = 40)
	private String raca;
	
	@Column(name = "idade", nullable = false, length = 2)
	private Integer idade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
