package com.example.erika.prova2.model;

import java.io.Serializable;

public class Pedido implements Serializable {

    String bebida;
    Double valorBebida;
    String prato;
    Double valorPrato;
    String nome;

    Double total;

    public Pedido(String bebida, Double valorBebida, String prato, Double valorPrato, String nome) {
        this.bebida = bebida;
        this.valorBebida = valorBebida;
        this.prato = prato;
        this.valorPrato = valorPrato;
        this.nome = nome;
    }

    public Double total(){
        return valorBebida + valorPrato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public Double getValorBebida() {
        return valorBebida;
    }

    public void setValorBebida(Double valorBebida) {
        this.valorBebida = valorBebida;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public Double getValorPrato() {
        return valorPrato;
    }

    public void setValorPrato(Double valorPrato) {
        this.valorPrato = valorPrato;
    }



}
