package br.com.guilhermevillaca.poo.enumexemplo;

/**
 *
 * @author guilherme.villaca
 */
public class Jogador {

    private String nome;
    private int numero;
    private PosicaoTatica posicaoTatica;

    public Jogador(String nome, int numero, PosicaoTatica posicaoTatica) {
        this.nome = nome;
        this.numero = numero;
        this.posicaoTatica = posicaoTatica;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public PosicaoTatica getPosicaoTatica() {
        return posicaoTatica;
    }

    @Override
    public String toString() {
        return "Jogador{"
                + "nome='" + nome + '\''
                + ", numero=" + numero
                + ", posicaoTatica=" + posicaoTatica
                + '}';
    }
}
