package com.br.ecommerce.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.ecommerce.dto.LoginRequest;
import com.br.ecommerce.model.Usuario;
import com.br.ecommerce.repository.UsuarioRepository;
import com.br.ecommerce.service.JwtService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	private final UsuarioRepository repository;
	private final JwtService  jwtservice;  
	
	public AuthController (UsuarioRepository repository, JwtService jwtservice) {
		this.repository = repository;
		this.jwtservice = jwtservice;
	}
	@PostMapping("/{login}")
	 public String login (@RequestBody LoginRequest request) {
		Usuario usuario = repository.findByEmail(request.getEmail()).orElse(null);
	      if (usuario == null){
	    	  return "Usuario nao encontrado";
		}
	     if(!usuario.getSenha().equals(request.getSenha())) {
	    	 return "Senha invalida";
	     }
	     return jwtservice.gerarToken(usuario.getEmail());
	}

}
