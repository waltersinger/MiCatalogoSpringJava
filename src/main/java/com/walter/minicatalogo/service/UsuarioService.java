package com.walter.minicatalogo.service;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walter.minicatalogo.entity.Usuario;
import com.walter.minicatalogo.model.UsuarioRepository;

@Service
public class UsuarioService {

	/*
	private List<Usuario> usuarios = new ArrayList<>( Arrays.asList( new Usuario(1,"Walter Singer","walter","1234","ADMIN","w@email.com","44"),
			  new Usuario(2,"Agu Bebe","nahuel","1234","USUARIO","ab@email.com","3333")) );
	*/
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> getUsers() {
		//return usuarios;
		
		List<Usuario> l = new ArrayList<>();
		for(Usuario u: usuarioRepository.findAll()) {
			l.add(u);
		}
		//Usando expresiones lambda seria lo mismo que lo de arriba
		// foreach /elemento iterable de findall/ (/a la lista/ l:: add /llama al metodo add para agregar/ )
		//usuarioRepository.findAll().forEach(l::add);
		
		return l;
		
	}
	
	public Usuario getUser(String usuario) {
		
		/*
		for (Usuario auser: usuarios) {
			if(auser.getUsuario().equals(usuario)) {
				return auser;
			}
		}
		return null;
		*/
		
		//Esto es con java 8, lambdas expression
		//return usuarios.stream().filter(auser -> auser.getUsuario().equals(usuario)).findFirst().get();
		//usuarioRepository.findById(id)
		for(Usuario u : usuarioRepository.findAll()) {
			if( u.getUsuario().equals(usuario) ) {
				return u;
			}
		}
		return null;
		
	}
	
	public void addUser(Usuario auser) {
		//usuarios.add(auser);
		usuarioRepository.save(auser);
	}
							//identificador ,  el objeto por el cual hay que modificar
	public void updateUser(int id, Usuario auser) {
		/*
		Usuario u;
		for(int i = 0;i<usuarios.size();i++) {
			u = usuarios.get(i);
			if(u.getId() == id) {
				usuarios.set(i, auser);
				break;
			}
		}*/
		usuarioRepository.save(auser);
	}

	public void deleteUser(int id) {
		
		//usuarios.removeIf(auser -> auser.getId() == id);
		usuarioRepository.deleteById(id);
	}
}
