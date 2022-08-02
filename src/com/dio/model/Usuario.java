package com.dio.model;

public abstract class Usuario {
    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    //Getter e setter

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
