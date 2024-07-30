package br.com.guilhermevillaca.poo.julho.atv2;

/**
 *
 * @author villaca
 */
public class Principal {

    public static void main(String[] args) {
        Padaria minhaPadaria = new Padaria();

        Bolo bolo1 = new Bolo("Chocolate", "Grande", 20.0);
        Bolo bolo2 = new Bolo("Morango", "Médio", 15.0);
        Bolo bolo3 = new Bolo("Baunilha", "Pequeno", 10.0);

        Pao pao1 = new Pao("Francês", 0.05, 0.5);
        Pao pao2 = new Pao("Integral", 0.1, 1.0);
        Pao pao3 = new Pao("Centeio", 0.08, 0.8);

        minhaPadaria.adicionarBolo(bolo1);
        minhaPadaria.adicionarBolo(bolo2);
        minhaPadaria.adicionarBolo(bolo3);

        minhaPadaria.adicionarPao(pao1);
        minhaPadaria.adicionarPao(pao2);
        minhaPadaria.adicionarPao(pao3);

        minhaPadaria.relatorioBolos();
        minhaPadaria.relatorioPaes();
    }

}
