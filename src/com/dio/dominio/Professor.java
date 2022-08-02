package com.dio.dominio;

import com.dio.model.Usuario;


public class Professor extends Usuario {
    private String setor;
    private String cargo;

    public Professor(String nome) {
        super(nome);
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
