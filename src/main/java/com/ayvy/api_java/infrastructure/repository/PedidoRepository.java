package com.ayvy.api_java.infrastructure.repository;

import com.ayvy.api_java.infrastructure.entitys.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
}
