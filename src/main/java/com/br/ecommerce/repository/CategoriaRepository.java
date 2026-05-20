package com.br.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ecommerce.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

}
