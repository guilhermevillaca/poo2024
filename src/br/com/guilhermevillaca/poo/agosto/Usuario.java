package br.com.guilhermevillaca.poo.agosto;

/**
 *
 * @author guilherme.villaca
 */
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
