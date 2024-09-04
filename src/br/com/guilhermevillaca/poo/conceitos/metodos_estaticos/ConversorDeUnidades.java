package br.com.guilhermevillaca.poo.conceitos.metodos_estaticos;

/**
 *
 * @author guilherme.villaca
 */
public class ConversorDeUnidades {
    // Método estático para converter de quilômetros para milhas
    public static double kmParaMilhas(double km) {
        return km * 0.621371;
    }

    // Método estático para converter de Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método estático para converter de quilogramas para libras
    public static double kgParaLibras(double kg) {
        return kg * 2.20462;
    }
}
