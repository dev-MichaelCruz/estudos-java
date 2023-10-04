package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    imprimirSelecionados();
  }

  // impirmir lista de selecionados
  static void imprimirSelecionados() {
    String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };

    for (int indice = 0; indice < candidatos.length; indice++) {
      System.out.println("o candidato " + (indice + 1) + " é " + candidatos[indice]);
    }

    // OU
    for (String candidato : candidatos) {
      System.out.println(" O candiato selecionado foi " + candidato);
    }
  }

  // Valor pretendidao randomico
  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void selecionarCandidatos() {
    String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Luiza", "Daniel", "Marcela", "José",
        "Carlos" };

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;

    while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      double salarioBase = 2000;

      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " solicitou este salário de R$ " + salarioPretendido);

      if (salarioPretendido <= salarioBase) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
        candidatosSelecionados++;

      }
      candidatoAtual++;
    }

  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;

    if (salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("Ligar para o candidato com contraproposta");
    } else {
      System.out.println("Aguardando demais candidatos");
    }
  }
}
