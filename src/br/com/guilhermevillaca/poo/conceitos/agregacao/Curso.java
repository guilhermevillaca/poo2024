package br.com.guilhermevillaca.poo.conceitos.agregacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme.villaca
 */
class Curso {

    private String nome;
    private List<Estudante> estudantes;  // Agregação - Curso "tem" Estudantes

    public Curso(String nome) {
        this.nome = nome;
        this.estudantes = new ArrayList<>();
    }

    public void matricularEstudante(Estudante estudante) {
        estudantes.add(estudante);
        System.out.println(estudante.getNome() + " matriculado no curso " + nome);
    }

    public void listarEstudantes() {
        System.out.println("Estudantes no curso " + nome + ":");
        for (Estudante estudante : estudantes) {
            System.out.println("- " + estudante.getNome());
        }
    }
}
