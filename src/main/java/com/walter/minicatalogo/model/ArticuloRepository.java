package com.walter.minicatalogo.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.walter.minicatalogo.entity.Articulo;

public interface ArticuloRepository extends CrudRepository<Articulo,Long> {
	public List<Articulo> findByArticuloContaining(String articulo);//solo lo declaro, spring implementa automaticamente el metodo, solo tiene que llevar de nombre findByProperty
	//Accede a la BD, luego a la columna de la tabla x luego busca todos los registros que cumplan el filtro.

	public List<Articulo> findByCategoriaNombreIgnoreCase(String nom);

	public Articulo findByCodigoIgnoreCase(String cod);
}
