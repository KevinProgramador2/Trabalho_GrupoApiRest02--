package br.serratec.com.trabalhovalendonota02.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class VendedorAutonomo  extends Vendedor{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Double comissao;

    @ManyToOne
    @JoinColumn(name= "id_vendedor")
    private Vendedor vendedor;

}

