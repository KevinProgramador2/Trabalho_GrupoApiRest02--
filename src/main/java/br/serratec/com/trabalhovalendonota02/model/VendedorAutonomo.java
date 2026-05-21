package br.serratec.com.trabalhovalendonota02.model;

import jakarta.persistence.*;
@Entity
public class VendedorAutonomo extends Vendedor{
    private Double comissao;

    public VendedorAutonomo() {
    }

    public VendedorAutonomo(Double comissao) {
        this.comissao = comissao;
    }

    public Double getComissao() {
        return comissao;
    }

    public void setComissao(Double comissao) {
        this.comissao = comissao;
    }
}

