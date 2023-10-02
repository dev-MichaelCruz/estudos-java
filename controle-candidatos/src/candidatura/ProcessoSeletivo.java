package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    selecionarCandidatos();

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

    while (candidatosSelecionados < 5) {
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
