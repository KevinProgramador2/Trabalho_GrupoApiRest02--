package br.serratec.com.trabalhovalendonota02.model;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter

public class VendedorProfissional extends Vendedor  {

    private String cpnj;

    @ManyToOne
    @JoinColumn(name= "id_vendedor")
    private Vendedor vendedor;

}
