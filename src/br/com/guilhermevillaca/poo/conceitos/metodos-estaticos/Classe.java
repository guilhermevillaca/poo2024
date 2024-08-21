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
