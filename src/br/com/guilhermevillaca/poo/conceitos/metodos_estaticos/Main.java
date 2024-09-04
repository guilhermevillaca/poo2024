package br.com.guilhermevillaca.poo.conceitos.metodos_estaticos;

/**
 *
 * @author guilherme.villaca
 */
public class Main {

    public static void main(String[] args) {
        // Utilizando métodos estáticos sem precisar instanciar a classe
        double milhas = ConversorDeUnidades.kmParaMilhas(10);
        double fahrenheit = ConversorDeUnidades.celsiusParaFahrenheit(25);
        double libras = ConversorDeUnidades.kgParaLibras(70);

        System.out.println("10 km em milhas: " + milhas);
        System.out.println("25°C em Fahrenheit: " + fahrenheit);
        System.out.println("70 kg em libras: " + libras);
    }
}
