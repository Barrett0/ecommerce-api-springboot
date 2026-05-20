package com.br.ecommerce.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ecommerce.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
   Optional<Usuario> findByEmail(String email);
	
}
