package Pesquisa.livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

  private List<Livro> livrosList;

  public CatalogoLivros() {
    this.livrosList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livrosList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livrosList.isEmpty()) {
      for (Livro livro : livrosList) {
        livrosPorAutor.add(livro);
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livroPorIntervaloAnos = new ArrayList<>();

    if (!livrosList.isEmpty()) {
      for (Livro livro : livrosList) {
        if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
          livroPorIntervaloAnos.add(livro);
        }
      }
    }
    return livroPorIntervaloAnos;
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;

    if (!livrosList.isEmpty()) {
      for (Livro livro : livrosList) {
        if (livro.getTitulo().equalsIgnoreCase(titulo))
          ;
        livroPorTitulo = livro;
        break;
      }
    }
    return livroPorTitulo;
  }

  public static void main(String[] args) {

    CatalogoLivros catalogoLivros = new CatalogoLivros();

    // Adicionando livros ao catálogo
    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2022));
    System.out.println(catalogoLivros.pesquisarPorTitulo("O Codificador Limpo"));

  }

}
