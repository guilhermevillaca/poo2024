package br.com.guilhermevillaca.poo.julho.atv1;

/**
 *
 * @author villaca
 */
public class Principal {

    public static void main(String[] args) {

        Marca marca1 = new Marca("Toyota");
        Modelo modelo1 = new Modelo("Corolla", marca1);
        Carro carro1 = new Carro(modelo1, "Azul", 4, "Médio");
        carro1.adicionarOpcional("Ar-condicionado");
        carro1.adicionarOpcional("Direção Hidráulica");

        carro1.exibirDetalhes();

        Marca marca2 = new Marca("Honda");
        Modelo modelo2 = new Modelo("Civic", marca2);
        Carro carro2 = new Carro(modelo2, "Preto", 4, "Médio");
        carro2.adicionarOpcional("Teto Solar");
        carro2.adicionarOpcional("Bancos de Couro");

        carro2.exibirDetalhes();

    }

}
