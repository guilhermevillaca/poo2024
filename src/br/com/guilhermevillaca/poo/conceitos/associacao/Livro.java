package br.com.guilhermevillaca.poo.conceitos.associacao;

/**
 *
 * @author guilherme.villaca
 */
public class Livro {
    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
}
