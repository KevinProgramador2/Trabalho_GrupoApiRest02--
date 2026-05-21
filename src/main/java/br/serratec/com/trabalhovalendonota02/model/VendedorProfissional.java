package br.serratec.com.trabalhovalendonota02.model;

import jakarta.persistence.Entity;

@Entity
public class VendedorProfissional extends Vendedor {
    private String cnpj;

    public VendedorProfissional() {
    }

    public VendedorProfissional(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
