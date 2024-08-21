public class Banco {
    private static int totalDeContas = 0;  // Atributo estático

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public static void incrementarContas() {
        totalDeContas++;
    }
}

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
