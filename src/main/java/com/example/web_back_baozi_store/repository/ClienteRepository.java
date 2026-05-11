package com.example.web_back_baozi_store.repository;

import com.example.web_back_baozi_store.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}