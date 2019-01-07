package com.walter.minicatalogo.model;

import org.springframework.data.repository.CrudRepository;

import com.walter.minicatalogo.entity.Categoria;

public interface CategoriaRepository extends CrudRepository<Categoria,Integer> {

}
