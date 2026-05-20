package com.br.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.ecommerce.model.Produto;
import com.br.ecommerce.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private  ProdutoRepository repository;
	
	public ProdutoService (ProdutoRepository repository) {
		this.repository = repository; 
	}
	
	public Produto salvar (Produto produto) {
		return repository.save(produto);
	}
	
	public List<Produto> listar() {
	    return repository.findAll();
	}
	
	public Produto buscarPorId(Long id) {
		return repository.findById(id).orElse(null);
	}
	
	public Produto atualizar (Long id, Produto produto) {
		Produto existente = buscarPorId(id);	
		if (existente!= null) {
			existente.setNome(produto.getNome());
			existente.setEstoque(produto.getEstoque());
			existente.setPreco(produto.getPreco());
			return repository.save(existente);
	  }
	     return null;
	  }
	  
	public void delete (Long id) {
		repository.deleteById(id);
	}
	
}
