package com.walter.minicatalogo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.walter.minicatalogo.entity.Categoria;
import com.walter.minicatalogo.entity.Respuesta;
import com.walter.minicatalogo.service.CategoriaService;

@RestController
public class CategoriaController {

	@Autowired
	private CategoriaService categoriaService;
	
	//GET ALL
	@RequestMapping("/categorias")
	public Map<String,Object> getCategories(){
		HashMap<String,Object> map = new HashMap<>();
		map.put("categorias", categoriaService.getCategories());
		return map;
	}
	
//	public List<Categoria> getCategories(){
//		return categoriaService.getCategories();
//	}
	
	//GET ONE
	@RequestMapping("/categorias/{c}")
	public Categoria getCategory(@PathVariable String c) {
		return categoriaService.getCategory(c);
		
	}
	
	//POST con respuesta a devolver
	@RequestMapping(method= RequestMethod.POST, value= "/categorias")
	//public void addCategory(@RequestBody Categoria c) {
	public HashMap<String,Object> addCategory(@RequestBody Categoria c) {
		HashMap<String,Object> map = new HashMap<>();
		map.put("Response", categoriaService.addCategory(c));
		return map;
	}
	
	
	//PUT
	@RequestMapping(method= RequestMethod.PUT, value="/categorias")
/*	public void updateCategory(@RequestBody Categoria c) {
		categoriaService.updateCategory(c);
	}*/
	public HashMap<String,Object> updateCategory(@RequestBody Categoria c){
		HashMap<String,Object> map = new HashMap<>();
		map.put("Response",categoriaService.updateCategory(c));
		return map;
	}
	
	//DELETE 
//	@RequestMapping(method = RequestMethod.DELETE, value="/categorias/{c}")
//	public void deleteCategory(@PathVariable String c) {
//		categoriaService.deleteCategory(c);
//	}
	@RequestMapping(method= RequestMethod.DELETE, value="/categorias/{c}")
	public HashMap<String,Object> deleteCategory(@PathVariable String c){
		HashMap<String,Object> map = new HashMap<>();
		map.put("Response", categoriaService.deleteCategory(c));
		return map;
	}
}
