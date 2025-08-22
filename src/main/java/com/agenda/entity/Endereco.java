package com.agenda.entity;

public class Endereco {

    private String cep;
    private Integer numero;
    private String cidade;
    private String estado;

    public Endereco(){}

    public Endereco(String cep, Integer numero, String cidade, String estado) {
        this.cep = cep;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cep: " + cep +
                " Número: " + numero +
                ", Cidade: " + cidade +
                ", Estado: "  + estado;
    }
}
