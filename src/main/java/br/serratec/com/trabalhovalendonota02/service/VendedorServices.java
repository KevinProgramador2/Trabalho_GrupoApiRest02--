package br.serratec.com.trabalhovalendonota02.service;

import br.serratec.com.trabalhovalendonota02.model.Vendedor;
import br.serratec.com.trabalhovalendonota02.repository.VendedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.serratec.com.trabalhovalendonota02.exception.NotFoundException;

@Service
public class VendedorServices {
    @Autowired
    private VendedorRepository repository;

    public Vendedor inserir(Vendedor vendedor){
        return repository.save(vendedor);
    }

    public Vendedor buscar(Long id){
        return repository.findById(id).orElseThrow(() -> new NotFoundException("Vendedor nao encontrado"));
    }
}
