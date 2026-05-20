package com.ayvy.api_java.infrastructure.repositories;

import com.ayvy.api_java.infrastructure.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {


//OU extend CrudRepository do Jpa
    //Deletar pelo Id ou pelo Nome? Por enquanto por Id.
   // @Transactional
  //  void deleteById(Integer id);
}
