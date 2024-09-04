package br.com.guilhermevillaca.poo.conceitos.agregacao;

/**
 *
 * @author guilherme.villaca
 */
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
