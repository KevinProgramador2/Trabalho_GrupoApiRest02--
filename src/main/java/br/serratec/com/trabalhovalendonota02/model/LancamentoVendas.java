package br.serratec.com.trabalhovalendonota02.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor

public class LancamentoVendas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;


    private LocalDate data;
    private Double valor;

    @JsonBackReference
    @ManyToOne
    private Vendedor vendedor;


}
