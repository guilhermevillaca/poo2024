package br.com.guilhermevillaca.poo.julho.atv2;

/**
 *
 * @author villaca
 */
public class Bolo {
    private String sabor;
    private String tamanho;
    private double preco;
    
    public Bolo(String sabor, String tamanho, double preco) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }
    
    public String getSabor() {
        return sabor;
    }
    
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    public String getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
}



