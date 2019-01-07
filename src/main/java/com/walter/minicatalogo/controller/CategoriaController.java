package com.walter.minicatalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.walter.minicatalogo.entity.Categoria;
import com.walter.minicatalogo.service.CategoriaService;

@RestController
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	//GET ALL
	@RequestMapping("/categorias")
	public List<Categoria> getCategories(){
		return categoriaService.getCategories();
	}
	
	//GET ONE
	@RequestMapping("/categorias/{c}")
	public Categoria getCategory(@PathVariable String c) {
		return categoriaService.getCategory(c);
		
	}
	
	//POST
	@RequestMapping(method= RequestMethod.POST, value= "/categorias")
	public void addCategory(@RequestBody Categoria c) {
		categoriaService.addCategory(c);
	}
	
	//PUT
	@RequestMapping(method= RequestMethod.PUT, value="/categorias")
	public void updateCategory(@RequestBody Categoria c) {
		categoriaService.updateCategory(c);
	}
	
	//DELETE 
	@RequestMapping(method = RequestMethod.DELETE, value="/categorias/{c}")
	public void deleteCategory(@PathVariable String c) {
		categoriaService.deleteCategory(c);
	}
}
