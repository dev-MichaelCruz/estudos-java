package Set.Produtos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
  private Set<Produto> produtosSet;

  public CadastroProdutos() {
    this.produtosSet = new HashSet<>();
  }

  public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
    produtosSet.add(new Produto(codigo, nome, preco, quantidade));
  }

  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtosSet);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(produtosSet);
    return produtosPorPreco;
  }

  public static void main(String[] args) {
    // Criando uma instância do CadastroProdutos
    CadastroProdutos cadastroProdutos = new CadastroProdutos();

    // Adicionando produtos ao cadastro
    cadastroProdutos.adicionarProduto("Smartphone", 1L, 1000d, 10);
    cadastroProdutos.adicionarProduto("Notebook", 2L, 1500d, 5);
    cadastroProdutos.adicionarProduto("Mouse", 1L, 30d, 20);
    cadastroProdutos.adicionarProduto("Teclado", 4L, 50d, 15);

    System.out.println(cadastroProdutos.exibirProdutosPorNome());

    System.out.println(cadastroProdutos.exibirProdutosPorPreco());

  }
}

class ComparatorPorPreco implements Comparator<Produto> {
  @Override
  public int compare(Produto produto1, Produto produto2) {
    return Double.compare(produto1.getPreco(), produto2.getPreco());
  }
}
