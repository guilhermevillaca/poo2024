package br.com.guilhermevillaca.poo.conceitos.composicao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme.villaca
 */
public class Casa {

    private List<Quarto> quartos;  // Composição - Casa "possui" Quarto

    public Casa() {
        quartos = new ArrayList<>();
        quartos.add(new Quarto("Quarto Principal"));
        quartos.add(new Quarto("Quarto de Hóspedes"));
        quartos.add(new Quarto("Cozinha"));
        quartos.add(new Quarto("Sala de Estar"));
    }

    public void mostrarQuartos() {
        for (Quarto quarto : quartos) {
            System.out.println("Casa tem: " + quarto.getNome());
        }
    }
}
