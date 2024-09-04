package br.com.guilhermevillaca.poo.agosto;

import java.util.ArrayList;
import java.util.List;

class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponibilidade = true; // Por padrão, o livro está disponível
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    @Override
    public String toString() {
        return "Livro{"
                + "titulo='" + titulo + '\''
                + ", autor='" + autor + '\''
                + ", anoPublicacao=" + anoPublicacao
                + ", disponibilidade=" + (disponibilidade ? "Disponível" : "Indisponível")
                + '}';
    }
}
