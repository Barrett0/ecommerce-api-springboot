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

import com.br.ecommerce.model.Categoria;
import com.br.ecommerce.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	private final CategoriaService service;
	
	public CategoriaController (CategoriaService service ) {
		this.service = service;
	}
    @PostMapping
    public Categoria criar (@RequestBody Categoria categoria) {
    	return service.Salvar(categoria);
    }
	@GetMapping
	public List <Categoria> listar(){
		return service.listar();
	}
	@GetMapping("/{id}")
	public Categoria buscar(@PathVariable Long id) {
		return service.buscarPorId(id);
	}
	@PutMapping("/{id}")
	public  Categoria atualizar(@PathVariable Long id, @RequestBody Categoria categoria) {
		return service.atualizar(id, categoria);		
	}
	@DeleteMapping ("/{id}")
	public void deletar (@PathVariable Long id) {
		service.deletar(id);
	}
}
