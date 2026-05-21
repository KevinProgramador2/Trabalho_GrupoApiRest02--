package br.serratec.com.trabalhovalendonota02.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Vendedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome não pode ser vazio ou nulo")
    private String nome;

    @Email(message = "Email inválido")
    @NotBlank(message = "O email não pode ser vazio")
    private String email;

    @NotNull(message = "O salário não pode ser nulo")
    @DecimalMin(value = "1621.00", message = "O salário não pode ser inferior ao salário mínimo")
    private Double salario;

    @OneToMany(mappedBy = "vendedor")
    private List<LancamentoVendas> lancamentoVendas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public List<LancamentoVendas> getLancamentoVendas() {
        return lancamentoVendas;
    }

    public void setLancamentoVendas(List<LancamentoVendas> lancamentoVendas) {
        this.lancamentoVendas = lancamentoVendas;
    }
}