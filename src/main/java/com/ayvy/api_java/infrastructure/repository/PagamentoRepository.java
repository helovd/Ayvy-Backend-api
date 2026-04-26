package com.ayvy.api_java.infrastructure.repository;

import com.ayvy.api_java.infrastructure.entitys.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {

}
