package br.com.guilhermevillaca.poo.conceitos.atributos_estaticos;

/**
 *
 * @author guilherme.villaca
 */
public class Banco {
    private static int totalDeContas = 0;  // Atributo estático

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public static void incrementarContas() {
        totalDeContas++;
    }
}
