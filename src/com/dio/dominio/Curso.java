package com.dio.dominio;

public class Curso {
    private String nomeCurso;
    private String descricaoCurso;

    public Curso(String nome, String descricao) {
        this.nomeCurso = nome;
        this.descricaoCurso = descricao;
    }

    //Getter and Setter


    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getDescricaoCurso() {
        return descricaoCurso;
    }

    public void setDescricaoCurso(String descricaoCurso) {
        this.descricaoCurso = descricaoCurso;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nomeCurso='" + nomeCurso + '\'' +
                ", descricaoCurso='" + descricaoCurso + '\'' +
                '}';
    }
}
