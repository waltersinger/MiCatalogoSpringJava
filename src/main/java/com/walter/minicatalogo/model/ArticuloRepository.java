package com.walter.minicatalogo.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.walter.minicatalogo.entity.Articulo;

public interface ArticuloRepository extends CrudRepository<Articulo,Long> {
	public List<Articulo> findByArticulo(String articulo);//solo lo declaro, spring implementa automaticamente el metodo, solo tiene que llevar de nombre findByXxxxx
	//Accede a la BD, luego a la columna de la tabla x luego busca todos los registros que cumplan el filtro.
}
