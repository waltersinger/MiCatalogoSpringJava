package com.walter.minicatalogo.model;

import org.springframework.data.repository.CrudRepository;

import com.walter.minicatalogo.entity.Cliente;

public interface ClientesRepository extends CrudRepository<Cliente,Integer> {

}
