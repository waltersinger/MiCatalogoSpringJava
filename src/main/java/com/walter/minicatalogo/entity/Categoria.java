package com.walter.minicatalogo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="categorias")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@NotNull
	private int id;
	private String nombre_categoria;
	private String descripcion;
	
	public Categoria() {
	
	}

	public Categoria(@NotNull int id, String nombre_categoria, String descripcion) {
		
		this.id = id;
		this.nombre_categoria = nombre_categoria;
		this.descripcion = descripcion;
	}

	public String getNombre_categoria() {
		return nombre_categoria;
	}

	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}
	
	

}
