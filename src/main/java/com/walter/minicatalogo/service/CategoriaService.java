package com.walter.minicatalogo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walter.minicatalogo.entity.Categoria;
import com.walter.minicatalogo.model.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Categoria> getCategories() {
		List<Categoria> l =new ArrayList<>();
		categoriaRepository.findAll().forEach(l::add);
		return l;
	}
	
	public Categoria getCategory(String c) {
		for(Categoria x : categoriaRepository.findAll() ) {
			if(x.getDescripcion().equals(c)) {
				return x;
			}
		}
		return null;
	}
	
	public void addCategory(Categoria c) {
		categoriaRepository.save(c);
	}
	
	public void updateCategory(Categoria c) {
		categoriaRepository.save(c);
	}
	
	public void deleteCategory(String c) {
		for(Categoria x: categoriaRepository.findAll()) {
			if(x.getDescripcion().equals(c)) {
				categoriaRepository.delete(x);
				break;
			}
		}
	}
}
