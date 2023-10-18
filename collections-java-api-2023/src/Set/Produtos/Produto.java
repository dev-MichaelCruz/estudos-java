package Set.Produtos;

public class Produto implements Comparable<Produto> {

  private long codigo;
  private String nome;
  private double preco;
  private int quantidade;

  public Produto(long codigo, String nome, double preco, int quantidade) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  @Override
  public int compareTo(Produto produto) {
    return nome.compareToIgnoreCase(produto.getNome());
  }

  public String getNome() {
    return nome;
  }

  public long getCodigo() {
    return codigo;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public String toString() {
    return "Produto [nome=" + nome + ", codigo=" + codigo + ", preco=" + preco + ", quantidade=" + quantidade + "]";
  }

}
