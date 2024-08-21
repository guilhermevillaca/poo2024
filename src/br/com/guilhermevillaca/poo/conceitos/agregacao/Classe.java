import java.util.ArrayList;
import java.util.List;

class Estudante {
    private String nome;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

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

public class Main {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Ana");
        Estudante estudante2 = new Estudante("Bruno");

        Curso curso = new Curso("Engenharia de Software");
        curso.matricularEstudante(estudante1);
        curso.matricularEstudante(estudante2);

        curso.listarEstudantes();
    }
}
