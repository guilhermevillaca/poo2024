package br.com.guilhermevillaca.poo.agosto;

/**
 *
 * @author guilherme.villaca
 */
public class Principal {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(new Livro("Java: Como Programar", "Deitel", 2020));
        biblioteca.adicionarLivro(new Livro("Clean Code", "Robert C. Martin", 2008));
        biblioteca.adicionarLivro(new Livro("Design Patterns", "GoF", 1994));

        // Cadastrando usuários
        biblioteca.cadastrarUsuario(new Usuario("Alice", 30, 1));
        biblioteca.cadastrarUsuario(new Usuario("Bob", 25, 2));

        // Consultando livros disponíveis
        biblioteca.consultarLivrosDisponiveis();

        // Realizando empréstimo de um livro
        biblioteca.emprestarLivro("Java: Como Programar", 1);

        // Tentando emprestar o mesmo livro novamente
        biblioteca.emprestarLivro("Java: Como Programar", 2);

        // Devolvendo o livro
        biblioteca.devolverLivro("Java: Como Programar", 1, false);

        // Consultando livros disponíveis novamente
        biblioteca.consultarLivrosDisponiveis();

        // Devolvendo com atraso
        biblioteca.devolverLivro("Clean Code", 2, true);
    }
}
