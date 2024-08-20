import java.util.ArrayList;
import java.util.List;

class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidadeEstoque=" + quantidadeEstoque +
                '}';
    }
}

class Cliente {
    private String nome;
    private String email;
    private String cpf;

    public Cliente(String nome, String email, String cpf) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}

class Venda {
    private List<Produto> produtos;
    private Cliente cliente;
    private double valorTotal;

    public Venda(Cliente cliente) {
        this.produtos = new ArrayList<>();
        this.cliente = cliente;
        this.valorTotal = 0.0;
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        if (produto.getQuantidadeEstoque() >= quantidade) {
            produto.setQuantidadeEstoque(produto.getQuantidadeEstoque() - quantidade);
            for (int i = 0; i < quantidade; i++) {
                produtos.add(produto);
            }
            valorTotal += produto.getPreco() * quantidade;
            System.out.println("Produto " + produto.getNome() + " adicionado ao carrinho.");
        } else {
            System.out.println("Estoque insuficiente para o produto " + produto.getNome());
        }
    }

    public double calcularValorTotal() {
        return valorTotal;
    }

    public void finalizarVenda() {
        System.out.println("Venda finalizada para o cliente " + cliente.getNome());
        System.out.println("Produtos comprados:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
        System.out.println("Valor total: R$ " + valorTotal);
    }
}

public class SistemaVendas {
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
