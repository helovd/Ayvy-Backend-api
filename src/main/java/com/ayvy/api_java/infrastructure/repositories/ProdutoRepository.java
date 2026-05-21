package com.ayvy.api_java.infrastructure.repositories;

import com.ayvy.api_java.infrastructure.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    List<Produto> findByLojistaId(Integer id);

//OU extend CrudRepository do Jpa
    //Deletar pelo Id ou pelo Nome? Por enquanto por Id.
   // @Transactional
  //  void deleteById(Integer id);
}
