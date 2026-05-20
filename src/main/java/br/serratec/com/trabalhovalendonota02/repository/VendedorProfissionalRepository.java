package br.serratec.com.trabalhovalendonota02.repository;

import br.serratec.com.trabalhovalendonota02.model.VendedorAutonomo;
import br.serratec.com.trabalhovalendonota02.model.VendedorProfissional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendedorProfissionalRepository extends JpaRepository<VendedorProfissional, Long> {
}
