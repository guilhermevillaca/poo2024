package br.com.guilhermevillaca.poo.conceitos.associacao;

/**
 *
 * @author 10380
 */
public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Java: Como Programar", "Deitel & Deitel");
        Livro livro2 = new Livro("Head First Java", "Kathy Sierra & Bert Bates");

        Usuario usuario = new Usuario("Carlos");
        usuario.emprestarLivro(livro1);
        usuario.emprestarLivro(livro2);

        usuario.devolverLivro(livro1);
    }
}
