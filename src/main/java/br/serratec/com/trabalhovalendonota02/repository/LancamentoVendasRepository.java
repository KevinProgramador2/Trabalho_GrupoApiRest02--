package br.serratec.com.trabalhovalendonota02.repository;

import br.serratec.com.trabalhovalendonota02.model.LancamentoVendas;
import br.serratec.com.trabalhovalendonota02.model.VendedorAutonomo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoVendasRepository extends JpaRepository<LancamentoVendas, Long> {
}
