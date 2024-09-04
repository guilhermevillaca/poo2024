package br.com.guilhermevillaca.poo.enumexemplo;

/**
 *
 * @author guilherme.villaca
 */
import java.util.ArrayList;
import java.util.List;

public class Time {

    private List<Jogador> jogadores;

    public Time() {
        this.jogadores = new ArrayList<>();
    }

    // Adicionar um jogador ao time (máximo 11 jogadores)
    public void adicionarJogador(Jogador jogador) {
        if (jogadores.size() < 11) {
            jogadores.add(jogador);
        } else {
            System.out.println("O time já possui 11 jogadores. Substitua um jogador para adicionar outro.");
        }
    }

    // Substituir um jogador (remover pelo número e adicionar outro)
    public void substituirJogador(int numero, Jogador novoJogador) {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getNumero() == numero) {
                jogadores.set(i, novoJogador);
                System.out.println("Jogador substituído.");
                return;
            }
        }
        System.out.println("Jogador com número " + numero + " não encontrado.");
    }

    // Consultar todos os jogadores do time
    public void consultarJogadores() {
        for (Jogador jogador : jogadores) {
            System.out.println(jogador);
        }
    }
}
