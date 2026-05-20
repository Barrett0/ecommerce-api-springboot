package com.br.ecommerce.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.br.ecommerce.model.Usuario;
import com.br.ecommerce.repository.UsuarioRepository;

@Service
public class UsuarioService {
	
	private final UsuarioRepository repository;
	
	public UsuarioService (UsuarioRepository repository) {
		this.repository =  repository;
	}
	public Usuario Salvar (Usuario usuario) {
		return repository.save(usuario);
	}
	public List<Usuario> listar(){
		return repository.findAll();
	}
    public Usuario buscarPorId(Long id) {
		return repository.findById(id).orElse(null);
    }
    public Usuario atualizar (Long id ,Usuario usuario) {
		Usuario existente = buscarPorId(id);
		if (existente != null) {
			existente.setNome(usuario.getNome());
			existente.setEmail(usuario.getEmail());
			existente.setSenha(usuario.getSenha());
			
			return repository.save(existente);
	}
         return null;
    }
    public void deletar (Long id) {
    	repository.deleteById(id);
    	
    }

}
