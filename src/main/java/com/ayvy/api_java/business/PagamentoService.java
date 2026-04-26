package com.ayvy.api_java.business;

import com.ayvy.api_java.infrastructure.entitys.Pagamento;
import com.ayvy.api_java.infrastructure.repository.PagamentoRepository;
import org.springframework.stereotype.Service;

@Service

public class PagamentoService {

    private final PagamentoRepository repository;

    public PagamentoService(PagamentoRepository repository) {this.repository = repository;}

    //CREATE
    public void salvarPagamento(Pagamento pagamento){
        repository.saveAndFlush(pagamento);
    }

    //READ
    public Pagamento buscarPagamentoPorId(Integer id){
        return repository.findById(id).orElseThrow(
                () -> new RuntimeException("Pagamento não encontrado")
        );
    }

    //DELETE
    public void deletarPagamentoPorId(Integer id){
        repository.deleteById(id);
    }

    //UPDATE
    public void atualizarPagamentoPorId(Integer id, Pagamento pagamento){
        Pagamento pagamentoEntity = buscarPagamentoPorId(id);

        Pagamento pagamentoAtualizado = Pagamento.builder()
                .tipo(pagamento.getTipo() != null ?
                        pagamento.getTipo() : pagamentoEntity.getTipo())
                .status(pagamento.getStatus() != null ?
                        pagamento.getStatus() : pagamentoEntity.getStatus())
                .valor(pagamento.getValor() != null ?
                        pagamento.getValor() : pagamentoEntity.getValor())
                .dataPagamento(pagamentoEntity.getDataPagamento())
                .id(pagamentoEntity.getId())
                .build();

        repository.saveAndFlush(pagamentoAtualizado);

    }
}
