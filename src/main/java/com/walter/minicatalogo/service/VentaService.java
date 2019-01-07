package com.walter.minicatalogo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walter.minicatalogo.model.VentaRepository;

@Service
public class VentaService {

	@Autowired
	VentaRepository ventaRepository;
	
	
	
}
