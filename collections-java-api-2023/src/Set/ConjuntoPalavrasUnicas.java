package Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
  private Set<String> palavrasUnicasSet;

  public ConjuntoPalavrasUnicas() {
    this.palavrasUnicasSet = new HashSet<>();
  }

  public void adicionarPalavra(String palavra) {
    palavrasUnicasSet.add(palavra);
  }

  public void removerPalavra(String palavra) {
    if (!palavrasUnicasSet.isEmpty()) {
      if (palavrasUnicasSet.contains(palavra)) {
        palavrasUnicasSet.remove(palavra);
      } else {
        System.out.println("Palavra não encontrada");
      }
    } else {
      System.out.println("Conjutno vazio");
    }
  }

  public boolean verificarPalavra(String palavra) {
    return palavrasUnicasSet.contains(palavra);
  }

  public void exbirPalavrasUnicas() {
    if (!palavrasUnicasSet.isEmpty()) {
      System.out.println(palavrasUnicasSet);
    } else {
      System.out.println("Conjutno vazio");
    }
  }

  public static void main(String[] args) {

    ConjuntoPalavrasUnicas conjuntoLinguagens = new ConjuntoPalavrasUnicas();

    conjuntoLinguagens.adicionarPalavra("Java");
    conjuntoLinguagens.adicionarPalavra("Python");
    conjuntoLinguagens.adicionarPalavra("JavaScript");
    conjuntoLinguagens.adicionarPalavra("Python");
    conjuntoLinguagens.adicionarPalavra("C++");
    conjuntoLinguagens.adicionarPalavra("Ruby");

    conjuntoLinguagens.exbirPalavrasUnicas();

    conjuntoLinguagens.removerPalavra("Ruby");
    conjuntoLinguagens.exbirPalavrasUnicas();

    System.out.println(conjuntoLinguagens.verificarPalavra("Ruby"));
    System.out.println(conjuntoLinguagens.verificarPalavra("Java"));

    conjuntoLinguagens.exbirPalavrasUnicas();

  }

}
