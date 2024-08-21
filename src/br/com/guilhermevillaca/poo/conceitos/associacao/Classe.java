import java.util.ArrayList;
import java.util.List;

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
