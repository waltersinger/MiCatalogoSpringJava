package com.walter.minicatalogo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.walter.minicatalogo.entity.Categoria;

@RestController
public class CategoriaController {

	//GET ALL
	public List<Categoria> getCategories(){
		return null;
	}
	
	//GET ONE
	public Categoria getCategory(String c) {
		return null;
	}
	
	//POST
	public void addCategory(Categoria c) {
		
	}
	
	//PUT
	public void updateCategory(Categoria c) {
		
	}
	
	//DELETE 
	public void deleteCategory(String c) {
		
	}
}
