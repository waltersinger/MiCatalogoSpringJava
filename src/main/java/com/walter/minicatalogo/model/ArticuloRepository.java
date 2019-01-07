package com.walter.minicatalogo.model;

import org.springframework.data.repository.CrudRepository;
import com.walter.minicatalogo.entity.Articulo;

public interface ArticuloRepository extends CrudRepository<Articulo,Long> {

}
