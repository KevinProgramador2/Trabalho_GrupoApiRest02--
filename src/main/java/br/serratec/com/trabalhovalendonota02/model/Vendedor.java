package br.serratec.com.trabalhovalendonota02.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;

@Getter
@Setter
@Entity
@Inheritance(strategy =  InheritanceType.JOINED)// cria tabelas separadas para as especializações.;
public  class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String email;
    private Double salario;

    @JsonManagedReference
    @OneToMany(mappedBy = "id_vendedor", fetch = FetchType.EAGER)
    private List<LancamentoVendas>  lancamento ;

}
