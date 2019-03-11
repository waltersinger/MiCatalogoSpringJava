package com.walter.minicatalogo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walter.minicatalogo.entity.Venta;
import com.walter.minicatalogo.model.VentaRepository;

@Service
public class VentaService {

	@Autowired
	VentaRepository ventaRepository;
	
	public List<Venta> getSales(){
		List<Venta> l = new ArrayList<>();
		ventaRepository.findAll().forEach(l::add);
		return l;
	}
	
	
}
