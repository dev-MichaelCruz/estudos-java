package OperacoesBasicas.carrinhocompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Item> itensList;

  public CarrinhoDeCompras() {
    this.itensList = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    itensList.add(new Item(nome, preco, quantidade));
  }

  public void removerItem(String nome) {
    List<Item> itensParaRemover = new ArrayList<>();

    for (Item item : itensList) {
      if (item.getNome().equalsIgnoreCase(nome)) {
        itensParaRemover.add(item);
      }
    }
    itensList.removeAll(itensParaRemover);
  }

  public void calcularValorTotal() {
    double valorTotal = 0;

    if (!itensList.isEmpty()) {
      for (Item item : itensList) {
        double valorItem = item.getPreco() * item.getQuantidade();
        valorTotal += valorItem;
      }

      System.out.println("O valor total é: " + valorTotal);
    } else {
      System.out.println("A lista de itens está vazia");
    }
  }

  public void exibirItens() {
    System.out.println(itensList);
  }

  public static void main(String[] args) {
    CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

    carrinho.adicionarItem("Item 1", 12.3, 2);
    carrinho.adicionarItem("Item 2", 3.67, 10);
    carrinho.adicionarItem("Item 3", 13.2, 1);

    carrinho.calcularValorTotal();
    carrinho.exibirItens();
    carrinho.removerItem("Item 2");

    carrinho.exibirItens();
    carrinho.calcularValorTotal();
  }
}
