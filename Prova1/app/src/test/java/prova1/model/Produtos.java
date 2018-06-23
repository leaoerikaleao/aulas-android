package prova1.model;

public class Produtos {

    private String nome;
    private String descricao;
    private String unidade;
    private String perecivel;
    private boolean promocao;

    public Produtos(String nome, String descricao, String unidade, String perecivel, boolean promocao) {
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

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

}
