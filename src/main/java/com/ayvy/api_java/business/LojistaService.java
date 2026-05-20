package com.ayvy.api_java.business;

import com.ayvy.api_java.infrastructure.entities.Lojista;
import com.ayvy.api_java.infrastructure.enums.StatusLoja;
import com.ayvy.api_java.infrastructure.repositories.LojistaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LojistaService {

    private final LojistaRepository lojistaRepository;

    public LojistaService(LojistaRepository lojistaRepository) {
        this.lojistaRepository = lojistaRepository;
    }

    //Aprovar manualmente o lojista.
    public void aprovarLojista(Integer id){

        Lojista lojista = lojistaRepository.findById(id)
                .orElseThrow();

        lojista.setStatus(StatusLoja.APROVADO);

        lojista.setAprovadoEm(LocalDateTime.now());

        lojistaRepository.save(lojista);
    }
}
