package Map.PesquisaProdutos;

public class Produto {

  private String nome;
  private int quantidade;
  private double preco;

  public Produto(String nome, int quantidade, double preco) {
    this.nome = nome;
    this.quantidade = quantidade;
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

}
