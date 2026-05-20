package br.serratec.com.trabalhovalendonota02.controller;

import java.util.Optional;

import br.serratec.com.trabalhovalendonota02.model.Vendedor;
import br.serratec.com.trabalhovalendonota02.service.VendedorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vendedores")
public class VendedorController {

    @Autowired
    private VendedorServices service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Vendedor inserir(@RequestBody Vendedor vendedores) {
        return service.inserir(vendedores);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Vendedor> buscar(@PathVariable Long id) {
        Optional<Vendedor> vendedores = service.buscar(id);
        if (vendedores.isPresent()) {
            return ResponseEntity.ok(vendedores.get());
        }
        return ResponseEntity.notFound().build();
    }
}
