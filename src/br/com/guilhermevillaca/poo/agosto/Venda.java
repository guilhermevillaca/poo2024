package br.com.guilhermevillaca.poo.agosto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author guilherme.villaca
 */
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