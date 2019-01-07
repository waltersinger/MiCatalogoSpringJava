package com.walter.minicatalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.walter.minicatalogo.entity.Articulo;
import com.walter.minicatalogo.service.ArticuloService;

@RestController
public class ArticuloController {
	
	@Autowired
	private ArticuloService articuloService;
	
	//GET ALL 
	@RequestMapping("/articulos")
	public List<Articulo> articulos(){
		//obtiene todos los articulos
		return articuloService.getItems();
	}
	//GET A REG
	@RequestMapping("/articulos/{id}")
	public Articulo getItem(@PathVariable long id) {
		return articuloService.getItem( id);
	}
	
	//POST
	@RequestMapping(method=RequestMethod.POST , value="/articulos")
	public void addItem(@RequestBody Articulo a) {
		articuloService.addItem(a);
	}
	
	//PUT
	@RequestMapping(method=RequestMethod.PUT, value = "/articulos/{id}")
	public void updateItem(@RequestBody Articulo a, @PathVariable long id) {
		articuloService.updateItem(id, a);
	}
	
	//DELETE
	@RequestMapping(method=RequestMethod.DELETE, value="articulos/{id}" )
	public void deleteItem(@PathVariable long id) {
		articuloService.deleteItem(id);
	}
}
