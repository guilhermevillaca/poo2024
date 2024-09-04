package br.com.guilhermevillaca.poo.conceitos.atributos_estaticos;

/**
 *
 * @author guilherme.villaca
 */
public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
        this.saldo = 0;
        Banco.incrementarContas();  // Incrementa o total de contas quando uma nova conta é criada
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public double getSaldo() {
        return this.saldo;
    }
}