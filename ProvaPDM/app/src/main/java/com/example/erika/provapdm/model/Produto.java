package com.example.erika.provapdm.model;

import java.io.Serializable;

public class Produto implements Serializable{

    private String nome;
    private String descricao;
    private String unidade;
    private String perecivel;
    private String promocao;

    public Produto(String nome, String descricao, String unidade, String perecivel, String promocao) {
        this.nome = nome;
        this.descricao = descricao;
        this.unidade = unidade;
        this.perecivel = perecivel;
        this.promocao = promocao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getPerecivel() {
        return perecivel;
    }

    public void setPerecivel(String perecivel) {
        this.perecivel = perecivel;
    }

    public String getPromocao() {
        return promocao;
    }

    public void setPromocao(String promocao) {
        this.promocao = promocao;
    }

}