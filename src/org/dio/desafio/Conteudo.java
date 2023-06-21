package org.dio.desafio;

public abstract class Conteudo {

    protected static final Double XP_PADRAO = 10d;

    private String descricao;
    private String titulo;

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public abstract Double calcularXp();
}
