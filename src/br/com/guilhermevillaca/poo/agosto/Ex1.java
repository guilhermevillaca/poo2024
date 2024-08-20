public class Imovel {
    // Atributos
    private String nomeProprietario;
    private String endereco;
    private double valorCompra;
    private int anoConstrucao;

    // Construtor
    public Imovel(String nomeProprietario, String endereco, double valorCompra, int anoConstrucao) {
        this.nomeProprietario = nomeProprietario;
        this.endereco = endereco;
        this.valorCompra = valorCompra;
        this.anoConstrucao = anoConstrucao;
    }

    // Método para calcular o valor de venda
    public double calcularValorVenda(int anoVenda, double taxaCorrecaoMonetaria) {
        int anosPassados = anoVenda - anoConstrucao;
        double valorFinal = valorCompra;

        // Aplica acréscimo de 2% por ano
        for (int i = 0; i < anosPassados; i++) {
            valorFinal += valorFinal * 0.02;
        }

        // Aplica a taxa de correção monetária
        valorFinal += valorFinal * (taxaCorrecaoMonetaria / 100);

        return valorFinal;
    }

    // Métodos getters para acessar os atributos (se necessário)
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public int getAnoConstrucao() {
        return anoConstrucao;
    }

    // Método main para teste
    public static void main(String[] args) {
        // Criação de um objeto Imovel
        Imovel imovel = new Imovel("João Silva", "Rua das Flores, 123", 200000.0, 2010);

        // Cálculo do valor de venda
        double valorVenda = imovel.calcularValorVenda(2024, 5.0); // ano de venda: 2024, taxa de correção: 5%
        System.out.println("Valor de venda: " + valorVenda);
    }
}
