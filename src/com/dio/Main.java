package com.dio;

import com.dio.dominio.Aluno;
import com.dio.dominio.Curso;

public class Main {
    public static void main(String[] args) {

        //Iniciando Testes
        //Criando o Curso
        Curso cursoInfo = new Curso("Progamacao em Java", "Orientacao a objetos");

        //Criando um aluno com o construtor e inserindo dados adicionais
        Aluno aluno1 = new Aluno("Carlos Eduardo", cursoInfo);

        System.out.println(aluno1);
    }
}