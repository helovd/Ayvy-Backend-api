package com.ayvy.api_java.infrastructure.repository;

import com.ayvy.api_java.infrastructure.entitys.Produto;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    //Deletar pelo Id ou pelo Nome? Por enquanto por Id.
    @Transactional
    void deleteById(Long id);
}
