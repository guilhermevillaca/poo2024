package br.com.guilhermevillaca.poo.agosto;

/**
 *
 * @author guilherme.villaca
 */
public class Principal3 {
    public static void main(String[] args) {
        // Criando alguns produtos
        Produto produto1 = new Produto("Laptop", 3500.00, 10);
        Produto produto2 = new Produto("Smartphone", 2000.00, 5);
        Produto produto3 = new Produto("Fone de Ouvido", 150.00, 20);

        // Criando um cliente
        Cliente cliente = new Cliente("Maria Silva", "maria.silva@email.com", "123.456.789-00");

        // Criando uma venda
        Venda venda = new Venda(cliente);

        // Adicionando produtos ao carrinho
        venda.adicionarProduto(produto1, 2);
        venda.adicionarProduto(produto2, 1);
        venda.adicionarProduto(produto3, 5);

        // Calculando o valor total
        double valorTotal = venda.calcularValorTotal();
        System.out.println("Valor total da compra: R$ " + valorTotal);

        // Finalizando a venda
        venda.finalizarVenda();
    }
}
