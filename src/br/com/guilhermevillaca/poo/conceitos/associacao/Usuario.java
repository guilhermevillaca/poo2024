package br.com.guilhermevillaca.poo.conceitos.associacao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme.villaca
 */
public class Usuario {
    private String nome;
    private List<Livro> livrosEmprestados;  // Associação com a classe Livro

    public Usuario(String nome) {
        this.nome = nome;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void emprestarLivro(Livro livro) {
        livrosEmprestados.add(livro);
        System.out.println(nome + " emprestou o livro: " + livro.getTitulo());
    }

    public void devolverLivro(Livro livro) {
        livrosEmprestados.remove(livro);
        System.out.println(nome + " devolveu o livro: " + livro.getTitulo());
    }
}