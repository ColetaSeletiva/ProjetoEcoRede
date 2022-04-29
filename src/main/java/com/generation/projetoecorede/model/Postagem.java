package com.generation.projetoecorede.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.UpdateTimestamp;

@Entity //create table
@Table(name = "tb_postagens") //tb_postagens
public class Postagem {
	
	@Id // Primary Key id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
	private Long id;
	
	@NotBlank(message = "O atributo título é obrigatório!")
	@Size(min = 10, max = 1000, message = "O atributo titulo deve conter no min 10")
	private String titulo;
	
	@Size(min = 5, max = 1000, message = "O atributo midia deve conter no min 5")
	private String midia;
	
	@UpdateTimestamp
	private LocalDateTime data;
	
	@NotBlank(message = "O atributo regiões é obrigatório!")
	@Size(min = 5, max = 100, message = "O atributo regiões deve conter no min 5")
	private String regioes;
	
	@NotNull
	private Long curtir;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMidia() {
		return midia;
	}

	public void setMidia(String midia) {
		this.midia = midia;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public String getRegioes() {
		return regioes;
	}

	public void setRegioes(String regioes) {
		this.regioes = regioes;
	}

	public Long getCurtir() {
		return curtir;
	}

	public void setCurtir(Long curtir) {
		this.curtir = curtir;
	}
}





	
	
	
	
	
	
	