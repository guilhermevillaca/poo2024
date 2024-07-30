package br.com.guilhermevillaca.poo.julho.atv2;

/**
 *
 * @author villaca
 */
public class Pao {

    private String tipo;
    private double peso;
    private double preco;

    public Pao(String tipo, double peso, double preco) {
        this.tipo = tipo;
        this.peso = peso;
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
