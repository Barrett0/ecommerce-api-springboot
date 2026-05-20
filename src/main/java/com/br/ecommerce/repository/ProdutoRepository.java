package com.br.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.ecommerce.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
