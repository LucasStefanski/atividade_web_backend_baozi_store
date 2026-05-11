package com.example.web_back_baozi_store.repository;

import com.example.web_back_baozi_store.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}