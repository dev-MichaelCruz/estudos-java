package Set.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

  private Set<Convidado> convidadoSet;

  public ConjuntoConvidados() {
    this.convidadoSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    convidadoSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;

    for (Convidado convidado : convidadoSet) {
      if (convidado.getCodigoConvite() == codigoConvite) {
        convidadoParaRemover = convidado;
        break;
      }
    }
    convidadoSet.remove(convidadoParaRemover);
  }

  public int contarConvidados() {
    return convidadoSet.size();
  }

  public void exibirConvidados() {
    for (Convidado convidado : convidadoSet) {
      System.out.println(convidado);
    }
  }

  public static void main(String[] args) {

    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

    // Exibindo o número de convidados no conjunto (deve ser zero)
    System.out
        .println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    // Adicionando convidados ao conjunto
    conjuntoConvidados.adicionarConvidado("Alice", 1234);
    conjuntoConvidados.adicionarConvidado("Bob", 1235);
    conjuntoConvidados.adicionarConvidado("Charlie", 1235);
    conjuntoConvidados.adicionarConvidado("David", 1236);

    System.out
        .println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");

    conjuntoConvidados.removerConvidadoPorConvite(1236);
    System.out
        .println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
  }

}
