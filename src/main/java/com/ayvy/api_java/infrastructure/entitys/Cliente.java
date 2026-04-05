package com.ayvy.api_java.infrastructure.entitys;

import jakarta.persistence.*;
import lombok.*;

//Pegar e settar informações de algum atributo com Lombok:
@Getter
@Setter
//Para acessar a classe:
@AllArgsConstructor
@NoArgsConstructor
//Para futuros Updates:
@Builder
//Indicar que é tabela:
@Table(name = "cliente")
@Entity

public class Cliente {

    //Cria um valor automáticamente:
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf", unique = true)
    private String cpf;

    @Column(name = "telefone", unique = true)
    private String telefone;
}
