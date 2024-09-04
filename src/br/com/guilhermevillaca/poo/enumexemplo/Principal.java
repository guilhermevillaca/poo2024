package br.com.guilhermevillaca.poo.enumexemplo;

/**
 *
 * @author guilherme.villaca
 */
public class Principal {

    public static void main(String[] args) {

        // Exemplo de uso do enum DiaDaSemana
        DiaDaSemana hoje = DiaDaSemana.SEXTA_FEIRA;

        //System.out.println("Hoje: " + hoje);

        //System.out.println("Hoje: " + hoje + " e seu valor numerico: " + hoje.getValor());

        // Criando o time
        Time time = new Time();

        // Criando jogadores
        Jogador jogador1 = new Jogador("João", 1, PosicaoTatica.GOLEIRO);
        Jogador jogador2 = new Jogador("Carlos", 2, PosicaoTatica.ZAGUEIRO);
        Jogador jogador3 = new Jogador("Pedro", 3, PosicaoTatica.ZAGUEIRO);
        Jogador jogador4 = new Jogador("Rafael", 4, PosicaoTatica.LATERAL);
        Jogador jogador5 = new Jogador("Lucas", 5, PosicaoTatica.LATERAL);
        Jogador jogador6 = new Jogador("Ricardo", 6, PosicaoTatica.MEIA);
        Jogador jogador7 = new Jogador("Marcos", 7, PosicaoTatica.MEIA);
        Jogador jogador8 = new Jogador("André", 8, PosicaoTatica.MEIA);
        Jogador jogador9 = new Jogador("Felipe", 9, PosicaoTatica.ATACANTE);
        Jogador jogador10 = new Jogador("Thiago", 10, PosicaoTatica.ATACANTE);
        Jogador jogador11 = new Jogador("Paulo", 11, PosicaoTatica.ATACANTE);

        // Adicionando os jogadores ao time
        time.adicionarJogador(jogador1);
        time.adicionarJogador(jogador2);
        time.adicionarJogador(jogador3);
        time.adicionarJogador(jogador4);
        time.adicionarJogador(jogador5);
        time.adicionarJogador(jogador6);
        time.adicionarJogador(jogador7);
        time.adicionarJogador(jogador8);
        time.adicionarJogador(jogador9);
        time.adicionarJogador(jogador10);
        time.adicionarJogador(jogador11);

        // Consultar jogadores do time
        System.out.println("Jogadores do time:");
        time.consultarJogadores();

        // Substituir um jogador
        Jogador novoJogador = new Jogador("Roberto", 12, PosicaoTatica.ATACANTE);
        System.out.println("\nSubstituindo o jogador com número 9...");
        time.substituirJogador(9, novoJogador);

        // Consultar jogadores após a substituição
        System.out.println("\nJogadores do time após a substituição:");
        time.consultarJogadores();
    }
}
