package com.walter.minicatalogo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "clientes")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int id;
    private String nombre;
    private String domicilio;
    private String telefono;
    private short estado_cuenta; //0: OK / 1:moroso / 2:suspendido / 3:NO
	
    public Cliente() {
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public short getEstado_cuenta() {
		return estado_cuenta;
	}

	public void setEstado_cuenta(short estado_cuenta) {
		this.estado_cuenta = estado_cuenta;
	}

	public int getId() {
		return id;
	}
    
    
}
