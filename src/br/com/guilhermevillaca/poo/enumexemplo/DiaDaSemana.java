package br.com.guilhermevillaca.poo.enumexemplo;

/**
 *
 * @author guilherme.villaca
 */
public enum DiaDaSemana {
    DOMINGO(1),
    SEGUNDA_FEIRA(2),
    TERCA_FEIRA(3),
    QUARTA_FEIRA(4),
    QUINTA_FEIRA(5),
    SEXTA_FEIRA(6),
    SABADO(7);

    private int valor;

    // Construtor do enum
    DiaDaSemana(int valor) {
        this.valor = valor;
    }

    // Método getter para obter o valor do dia
    public int getValor() {
        return valor;
    }

}
