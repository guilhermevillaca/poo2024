package br.com.guilhermevillaca.poo.agosto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme.villaca
 */
class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public boolean emprestarLivro(String titulo, int numeroIdentificacao) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                if (livro.isDisponivel()) {
                    livro.setDisponibilidade(false);
                    System.out.println("Livro " + titulo + " emprestado ao usuário " + numeroIdentificacao);
                    return true;
                } else {
                    System.out.println("Livro " + titulo + " não está disponível.");
                    return false;
                }
            }
        }
        System.out.println("Livro " + titulo + " não encontrado.");
        return false;
    }

    public boolean devolverLivro(String titulo, int numeroIdentificacao, boolean atrasado) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && !livro.isDisponivel()) {
                livro.setDisponibilidade(true);
                if (atrasado) {
                    System.out.println("Livro " + titulo + " devolvido com atraso. Multa aplicada.");
                } else {
                    System.out.println("Livro " + titulo + " devolvido no prazo.");
                }
                return true;
            }
        }
        System.out.println("Livro " + titulo + " não encontrado ou já está disponível.");
        return false;
    }

    public void consultarLivrosDisponiveis() {
        System.out.println("Livros disponíveis:");
        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }
}