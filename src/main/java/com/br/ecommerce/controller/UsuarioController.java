package com.br.ecommerce.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.ecommerce.model.Usuario;
import com.br.ecommerce.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	
	private final  UsuarioService service;
	
	public UsuarioController (UsuarioService service) {
		this.service = service;
}
	@PostMapping
	public Usuario criar(@RequestBody Usuario usuario) {
		return service.Salvar(usuario);
	}
	@GetMapping
	public List<Usuario> listar(){
		return service.listar();
	}
    @GetMapping ("/{id}")
    public Usuario buscar (@PathVariable Long id) {
		return service.buscarPorId(id);
    }
   @PutMapping("/{id}")
   public Usuario atualizar (@PathVariable Long id , @RequestBody Usuario usuario) {
	return service.atualizar(id, usuario);
    }
     @DeleteMapping("/{id}")
     public void deletar(@PathVariable Long id) {
    	 service.deletar(id);
    	 
     }
}
