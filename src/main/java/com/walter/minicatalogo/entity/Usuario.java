package com.walter.minicatalogo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {

	@Id
	private int id;
	private String nombre;
	private String usuario;
	private String password;
	private String rol;
	private String email;
	private String telefono;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public Usuario(int id, String nombre, String usuario, String password, String rol, String email, String telefono) {
		
		this.id = id;
		this.nombre = nombre;
		this.usuario = usuario;
		this.password = password;
		this.rol = rol;
		this.email = email;
		this.telefono = telefono;
	}
	public Usuario() {
		
	}
	
	
	
}
