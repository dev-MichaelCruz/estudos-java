package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

  private List<Pessoa> pessoasList;

  public OrdenacaoPessoas() {
    this.pessoasList = new ArrayList<>();
  }

  public void adicionarPessoa(String nome, int idade, double altura) {
    pessoasList.add(new Pessoa(nome, idade, altura));
  }

  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
    Collections.sort(pessoasPorIdade);
    return pessoasPorIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> pessoaPorAltura = new ArrayList<>();
    Collections.sort(pessoaPorAltura, new ComparatorPorAltura());

    return pessoaPorAltura;
  }

  public static void main(String[] args) {
    OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

    ordenacaoPessoas.adicionarPessoa("Michael", 31, 1.80);
    ordenacaoPessoas.adicionarPessoa("Han Solo", 6, 1.20);
    ordenacaoPessoas.adicionarPessoa("Garapa", 4, 1.10);

    System.out.println(ordenacaoPessoas.ordenarPorIdade());
    System.out.println(ordenacaoPessoas.ordenarPorAltura());
  }

}
