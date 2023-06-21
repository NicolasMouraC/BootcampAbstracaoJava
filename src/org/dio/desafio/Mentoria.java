package org.dio.desafio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate dataMentoria;
    
    @Override
    public Double calcularXp() {
        return XP_PADRAO * 20d;
    }

    public Mentoria(LocalDate dataMentoria, String titulo, String descricao) {
        this.dataMentoria = dataMentoria;
        this.setTitulo(titulo);
        this.setDescricao(descricao);
    }

    public LocalDate getLocalDate() {
        return this.dataMentoria;
    }

    public void setLocalDate(LocalDate dataMentoria, String titulo, String descricao) {
        this.dataMentoria = dataMentoria;
        this.setTitulo(titulo);
        this.setDescricao(descricao);
    }

    @Override
    public String toString() {
        return "Mentoria: " + this.getTitulo() + "\n °Descrição: " + this.getDescricao() + "\n °Data: " + this.getLocalDate();
    }
}
