package com.walter.minicatalogo.model;

import org.springframework.data.repository.CrudRepository;

import com.walter.minicatalogo.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {
	
}
