package com.example.web_back_baozi_store.repository;

import com.example.web_back_baozi_store.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}