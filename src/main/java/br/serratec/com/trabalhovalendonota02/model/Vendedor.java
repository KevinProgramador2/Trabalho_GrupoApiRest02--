package br.serratec.com.trabalhovalendonota02.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String email;git
    private Double salario;

    @OneToMany
    JoinColumn(mappedBy ="id_vAutonomo");

    private VendedorAutonomo vendedorAutonomo;

}
