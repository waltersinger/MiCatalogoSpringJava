package com.walter.minicatalogo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.walter.minicatalogo.entity.Usuario;
import com.walter.minicatalogo.service.UsuarioService;

@RestController
public class UsuarioController {

	//aqui hace la inyeccion de dependencia del servicio para usuarios que contendra el acceso a los datos (o base de datos)
	// es decir el servicio tendra la implementacion de las entity con hibernate 
	@Autowired
	private UsuarioService usuariosService;
	
	@RequestMapping("/usuarios")
	public List<Usuario> users(){
		return usuariosService.getUsers();
	}
	
	//{usuario} es una anotacion que implica que sera un parametro que va a variar
	@RequestMapping("/usuarios/{usuario}")
	//aqui recibo el parametro remarcado en {x} y luego asigna a la variable "id"
	public Usuario getUser(@PathVariable String usuario) {
		return usuariosService.getUser(usuario);
	}
	//Aqui digo que sera una peticion de tipo POST y que tomara un argumento en formato json
	@RequestMapping(method=RequestMethod.POST, value= "/usuarios")
	//... del cuerpo de la peticion y lo convertira a un tipo Objeto, en este caso a tipo Usuario
	public void addUser(@RequestBody Usuario auser) {
		usuariosService.addUser(auser);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/usuarios/{id}")
	public void updateUser(@RequestBody Usuario auser,@PathVariable int id) {
		usuariosService.updateUser(id, auser);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/usuarios/{id}")
	public void deleteUser(@PathVariable int id) {
		usuariosService.deleteUser(id);
	}
}
