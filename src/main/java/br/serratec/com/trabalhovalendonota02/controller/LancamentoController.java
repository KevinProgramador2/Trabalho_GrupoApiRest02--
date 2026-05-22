package br.serratec.com.trabalhovalendonota02.controller;


import br.serratec.com.trabalhovalendonota02.model.LancamentoVendas;
import br.serratec.com.trabalhovalendonota02.service.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/lancamentos")
public class LancamentoController {

@Autowired
private LancamentoService lancamentoService;

@GetMapping("/{id}")
public ResponseEntity<LancamentoVendas> listarPorId(@PathVariable Long id) {

    var lancamentoVendas = lancamentoService.listarPorId(id);

    if (lancamentoVendas != null) {
        return ResponseEntity.ok(lancamentoVendas);
    }
    return ResponseEntity.notFound().build();
}

@PostMapping
@ResponseStatus(HttpStatus.CREATED)
    public LancamentoVendas inserir(@RequestBody LancamentoVendas lancamentoVendas) {
    return lancamentoService.inseriLancamento(lancamentoVendas);
}
}

