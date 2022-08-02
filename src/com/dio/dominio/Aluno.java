package com.dio.dominio;

import com.dio.model.Usuario;

import java.time.LocalDate;

public class Aluno extends Usuario {
    private Curso curso;
    private LocalDate dataMatricula = LocalDate.now();
    private LocalDate dataTermino = dataMatricula.plusYears(1);

    public Aluno(String nome,Curso curso) {
        super(nome);
        this.setNome(nome);
        this.curso = curso;
        this.dataMatricula = getDataMatricula();
        this.dataTermino = getDataTermino();
    }



    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    @Override
    public String toString() {
        return "Aluno{" + getNome() +
                ",curso:" + curso +
                ", dataMatricula=" + dataMatricula +
                ", dataTermino=" + dataTermino +
                '}';
    }
}
