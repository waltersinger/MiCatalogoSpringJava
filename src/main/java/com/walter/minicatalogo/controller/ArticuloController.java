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

import com.walter.minicatalogo.entity.Articulo;
import com.walter.minicatalogo.model.ArticuloRepository;
import com.walter.minicatalogo.service.ArticuloService;

@RestController
public class ArticuloController {
	
	@Autowired
	private ArticuloService articuloService;
	
	//GET ALL (me devuelve un objeto json que contiene un array de objectos json
	@RequestMapping("/articulos")
	public Map<String,Object> articulos(){
		HashMap<String, Object> map = new HashMap<>();
	    //map.put("key1", "value1");
	    map.put("articulos", articuloService.getItems());
	    return map;
	}
/*	
 * 	//Aqui solo me devuelve un array de objetos json
	public List<Articulo> articulos(){
		//obtiene todos los articulos
		return articuloService.getItems();
	}*/
	
	//GET REGISTROS DADO UN CRITERIO
	@RequestMapping("/articulos/{unCriterio}")
	public Map<String,Object> getItemsCriteria(@PathVariable String unCriterio) {
			Map<String, Object> mapListArticulos = new HashMap<>();
			mapListArticulos.put("articulos", articuloService.getItemsCriteria(unCriterio));
			return mapListArticulos;
	}
	
	//GET Registro dado un codigo de articulo.
	@RequestMapping("/articulos/codigo/{cod}")
	public Articulo getItem(@PathVariable String cod) {
		return articuloService.getItemByCode(cod);
	}
	//GET Registros de una categoria determinada
	@RequestMapping("/categoria/{categ}/articulos")
	public Map<String,Object> getCategoryItems(@PathVariable String categ){
		Map<String, Object> mapListArticulos = new HashMap<>();
		mapListArticulos.put("articulos", articuloService.getArtsxCategoria(categ));
		return mapListArticulos;
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
