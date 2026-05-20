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

import com.br.ecommerce.model.Produto;
import com.br.ecommerce.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

	private ProdutoService service;
	
    public ProdutoController (ProdutoService service) {
    	this.service = service;
    }
        //Post Criar
	   @PostMapping
    public Produto criar (@RequestBody Produto produto) {
		return service.salvar(produto);
	}
	   //GET (Listar)
     @GetMapping
     public List<Produto> listar(){
    	 return service.listar();
     }
	   //Buscar por ID
     @GetMapping ("/{id}")
     public Produto buscar (@PathVariable Long id) {
    	 return service.buscarPorId(id);
     }
        //Put Atualizar
      @PutMapping ("/{id}")
     public Produto atualizar (@PathVariable Long id , @RequestBody Produto produto) {
    	 return service.atualizar(id, produto);
     }
        //Delete
      @DeleteMapping ("/{id}")
     public void deletar (@PathVariable Long id) {
        	service.delete(id);
        }
	   
}
