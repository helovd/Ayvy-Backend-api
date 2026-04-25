package com.ayvy.api_java.infrastructure.entitys;
//!!!!!!!!!!!!!!!VERIFICAR OS RELACIONAMENTOS NO BD - CONCEITUAL!!!!!!!!!
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "pagamento")
@Entity


public class Pagamento {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Integer id;

    @Column (name = "status")
    private String status;

    @Column (name = "valor")
    private BigDecimal valor;

    @Column (name = "data")
    private LocalDateTime dataPagamento;

    @Column (name = "tipo")
    private String tipo;

}
