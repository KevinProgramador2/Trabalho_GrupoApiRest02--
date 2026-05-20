package br.serratec.com.trabalhovalendonota02.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
public class LancamentoVendas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private Vendedor vendedor;
    private LocalDate data;
    private Double valor;

}
