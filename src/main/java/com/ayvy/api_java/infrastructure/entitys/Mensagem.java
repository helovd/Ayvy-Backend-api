package com.ayvy.api_java.infrastructure.entitys;
//!!!!!!!!!!!!!!!VERIFICAR OS RELACIONAMENTOS NO BD - CONCEITUAL!!!!!!!!!
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "mensagem")
@Entity

public class Mensagem {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "texto")
    private String texto;

    @Column(name = "dataEnvio")
    private LocalDateTime dataEnvio;

    @Column(name = "dataRecebimento")
    private LocalDateTime dataRecebimento;

}
