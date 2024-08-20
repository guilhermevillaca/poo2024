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
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", disponibilidade=" + (disponibilidade ? "Disponível" : "Indisponível") +
                '}';
    }
}

class Usuario {
    private String nome;
    private int idade;
    private int numeroIdentificacao;

    public Usuario(String nome, int idade, int numeroIdentificacao) {
        this.nome = nome;
        this.idade = idade;
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", numeroIdentificacao=" + numeroIdentificacao +
                '}';
    }
}

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

public class SistemaBiblioteca {
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
