package com.br.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.br.ecommerce.model.Categoria;
import com.br.ecommerce.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	private final CategoriaRepository repository;

	public CategoriaService (CategoriaRepository repository) {
	  this.repository = repository;
}

public Categoria Salvar (Categoria categoria) {
	return repository.save(categoria);
}
public List<Categoria> listar(){
	return repository.findAll();
}
 public Categoria buscarPorId(Long id) {
	 return repository.findById(id).orElse(null);
 }
public Categoria atualizar (Long id, Categoria categoria) {
	   
	Categoria existente = buscarPorId(id);
	if (existente != null) {
		existente.setNome(categoria.getNome());
		return repository.save(existente);
			
	}
		return null;
	}
	public void deletar (Long id) {
		repository.deleteById(id);
		
	
}


}