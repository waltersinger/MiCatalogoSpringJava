package com.walter.minicatalogo.entity;

import javax.persistence.Column;
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
	@Column(name="categoria_id")
	private int categoria_id;
	
	@Column(name="nombre_categoria")
	private String nombre;
	
	private String descripcion;
	
	public Categoria() {
	
	}

	public Categoria(@NotNull int id, String nombre, String descripcion) {
		
		this.categoria_id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre_categoria) {
		this.nombre = nombre_categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCategoria_id() {
		return categoria_id;
	}
	
	

}
