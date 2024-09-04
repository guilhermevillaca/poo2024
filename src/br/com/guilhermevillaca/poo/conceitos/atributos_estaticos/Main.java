package br.com.guilhermevillaca.poo.conceitos.atributos_estaticos;

/**
 *
 * @author guilherme.villaca
 */
public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta("Alice");
        Conta conta2 = new Conta("Bob");

        conta1.depositar(1000);
        conta2.depositar(500);

        System.out.println("Total de contas criadas: " + Banco.getTotalDeContas());
        System.out.println("Saldo da conta de Alice: " + conta1.getSaldo());
        System.out.println("Saldo da conta de Bob: " + conta2.getSaldo());
    }
}
