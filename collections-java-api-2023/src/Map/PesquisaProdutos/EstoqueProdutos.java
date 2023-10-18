package Map.PesquisaProdutos;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

  private Map<Long, Produto> estoqueProdutosMap;

  public EstoqueProdutos() {
    this.estoqueProdutosMap = new HashMap<>();
  }

  public void adicionarProduto(Long cod, String nome, int quantidade, double preco) {
    estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
  }

  public void exibirProdutos() {
    System.out.println(estoqueProdutosMap);
  }

  public double calcularValorTotalEstoque() {
    double valorTotalEstoque = 0;

    if (!estoqueProdutosMap.isEmpty()) {
      for (Produto produto : estoqueProdutosMap.values()) {
        valorTotalEstoque += (produto.getPreco() * produto.getQuantidade());
      }
    }
    return valorTotalEstoque;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;

    for (Produto produto : estoqueProdutosMap.values()) {
      if (produto.getPreco() > maiorPreco) {
        produtoMaisCaro = produto;
        maiorPreco = produto.getPreco();
      }
    }
    return produtoMaisCaro;
  }

  public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;

    if (!estoqueProdutosMap.isEmpty()) {
      for (Produto produto : estoqueProdutosMap.values()) {
        if (produto.getPreco() < menorPreco) {
          produtoMaisBarato = produto;
          menorPreco = produto.getPreco();
        }
      }
    }
    return produtoMaisBarato;
  }

  public static void main(String[] args) {
    EstoqueProdutos estoqueProdutosMap = new EstoqueProdutos();

    estoqueProdutosMap.exibirProdutos();

    estoqueProdutosMap.adicionarProduto(1L, "Notebook", 1, 1500.0);
    estoqueProdutosMap.adicionarProduto(2L, "Mouse", 5, 25.0);
    estoqueProdutosMap.adicionarProduto(3L, "Monitor", 10, 400.0);
    estoqueProdutosMap.adicionarProduto(4L, "Teclado", 2, 40.0);

    estoqueProdutosMap.exibirProdutos();

    System.out.println(estoqueProdutosMap.calcularValorTotalEstoque());

    System.out.println(estoqueProdutosMap.obterProdutoMaisCaro());

    System.out.println(estoqueProdutosMap.obterProdutoMaisBarato());

  }

}
