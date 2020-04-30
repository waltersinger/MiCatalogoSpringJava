package com.walter.minicatalogo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walter.minicatalogo.entity.Articulo;
import com.walter.minicatalogo.model.ArticuloRepository;

@Service
public class ArticuloService {

	@Autowired
	private ArticuloRepository articuloRepository;
	
	public List<Articulo> getItems(){
		List<Articulo> l = new ArrayList<>();
		articuloRepository.findAll().forEach(l:: add);
		return l;
	}
	
	public Articulo getItem(long id) {
		return articuloRepository.findById(id).get();
	}
	
	public void addItem(Articulo a) {
		articuloRepository.save(a);
	}
	
	public void updateItem(long id, Articulo a) {
		articuloRepository.save(a);
	}
	
	public void deleteItem(long id) {
		articuloRepository.deleteById(id);
	}

	public List<Articulo> getItemsCriteria(String unCriterio) {
		List<Articulo> listArticulos= new ArrayList<>();
		List<Articulo> listArtResults = new ArrayList<>();
		articuloRepository.findAll().forEach(listArticulos::add);
		for(Articulo unArticulo:listArticulos) {
			if(unArticulo.toString().toUpperCase().indexOf(unCriterio.toUpperCase())>= 0) {
				listArtResults.add(unArticulo);
			}
		}
		
		return listArtResults;
	}
}
