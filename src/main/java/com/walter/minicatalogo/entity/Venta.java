package com.walter.minicatalogo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ventas")
public class Venta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private int usuario;
	private int cod_articulo;
	private double costo_venta;
	private Date fecha;
	private double cantidad;
	private double total_venta;
	
	public Venta() {
		
	}

	public int getUsuario() {
		return usuario;
	}

	public void setUsuario(int usuario) {
		this.usuario = usuario;
	}

	public int getCod_articulo() {
		return cod_articulo;
	}

	public void setCod_articulo(int cod_articulo) {
		this.cod_articulo = cod_articulo;
	}

	public double getCosto_venta() {
		return costo_venta;
	}

	public void setCosto_venta(double costo_venta) {
		this.costo_venta = costo_venta;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotal_venta() {
		return total_venta;
	}

	public void setTotal_venta(double total_venta) {
		this.total_venta = total_venta;
	}

	public long getId() {
		return id;
	}
	
	
}
