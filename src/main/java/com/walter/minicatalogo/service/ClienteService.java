package com.walter.minicatalogo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walter.minicatalogo.entity.Cliente;
import com.walter.minicatalogo.model.ClientesRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClientesRepository clienteRepository;
	
	public List<Cliente> getClients(){
		List<Cliente> c = new ArrayList<>();
		clienteRepository.findAll().forEach(c::add);
		return c;
	}

}
