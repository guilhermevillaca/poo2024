package br.com.guilhermevillaca.poo.julho.atv1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author villaca
 */
public class Carro {

    private Modelo modelo;
    private String cor;
    private int numeroDePortas;
    private String tamanho;
    private List<String> opcionais;

    public Carro(Modelo modelo, String cor, int numeroDePortas, String tamanho) {
        this.modelo = modelo;
        this.cor = cor;
        this.numeroDePortas = numeroDePortas;
        this.tamanho = tamanho;
        this.opcionais = new ArrayList<>();

    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public List<String> getOpcionais() {
        return opcionais;
    }

    public void setOpcionais(List<String> opcionais) {
        this.opcionais = opcionais;
    }

    public void adicionarOpcional(String opcional) {
        opcionais.add(opcional);
    }

    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo.getNome());
        System.out.println("Marca: " + modelo.getMarca().getNome());
        System.out.println("Cor: " + cor);
        System.out.println("Número de Portas: " + numeroDePortas);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Opcionais: " + String.join(", ", opcionais));
    }

}
