package br.com.guilhermevillaca.poo.julho.atv2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author villaca
 */
public class Padaria {

    private List<Bolo> bolos;
    private List<Pao> paes;

    public Padaria() {
        this.bolos = new ArrayList<>();
        this.paes = new ArrayList<>();
    }

    public void adicionarBolo(Bolo bolo) {
        bolos.add(bolo);
    }

    public void adicionarPao(Pao pao) {
        paes.add(pao);
    }

    public List<Bolo> getBolos() {
        return bolos;
    }

    public List<Pao> getPaes() {
        return paes;
    }

    public void relatorioBolos() {
        System.out.println("Bolos disponíveis:");
        for (Bolo bolo : bolos) {
            System.out.println("Sabor: " + bolo.getSabor() + ", Tamanho: " + bolo.getTamanho() + ", Preço: " + bolo.getPreco());
        }
    }

    public void relatorioPaes() {
        System.out.println("Pães disponíveis:");
        for (Pao pao : paes) {
            System.out.println("Tipo: " + pao.getTipo() + ", Peso: " + pao.getPeso() + ", Preço: " + pao.getPreco());
        }
    }
}
