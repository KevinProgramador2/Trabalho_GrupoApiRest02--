package br.serratec.com.trabalhovalendonota02.service;

import br.serratec.com.trabalhovalendonota02.exception.NotFoundException;
import br.serratec.com.trabalhovalendonota02.model.LancamentoVendas;
import br.serratec.com.trabalhovalendonota02.repository.LancamentoVendasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoVendasRepository lancamentoVendasRepository;

    public LancamentoVendas listarPorId(Long id) {
    return lancamentoVendasRepository.findById(id).orElseThrow( () ->  new NotFoundException("Lancamento nao encontrado"));

    }

    public LancamentoVendas inseriLancamento(LancamentoVendas lancamentoVendas) {
        return  lancamentoVendasRepository.save(lancamentoVendas);
    }

}
