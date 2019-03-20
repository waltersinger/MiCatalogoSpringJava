package com.walter.minicatalogo.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.walter.minicatalogo.service.ClienteService;

@RestController
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@RequestMapping("/clientes")
	public Map<String,Object> getClients(){
		HashMap<String,Object> map = new HashMap<>();
		map.put("clientes", clienteService.getClients());
		return map;
	}
}
