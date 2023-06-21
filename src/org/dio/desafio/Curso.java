package org.dio.desafio;

public class Curso extends Conteudo {
    private Double cargaHoraria = 0d;

    @Override
    public Double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public Curso(Double cargaHoraria, String titulo, String descricao) {
        this.cargaHoraria = cargaHoraria;
        this.setTitulo(titulo);
        this.setDescricao(descricao);
    }

    public Double getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(Double cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso: " + this.getTitulo() + "\n °Descrição: " + this.getDescricao() + "\n °Carga horaria: " + this.getCargaHoraria() + "\n";
    }
}
