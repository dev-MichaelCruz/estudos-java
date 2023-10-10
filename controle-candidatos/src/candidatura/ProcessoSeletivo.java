package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };

    for (String candidato : candidatos) {
      entrandoEmContato(candidato);
    }
  }

  // LIGAR PARA O CANDIDATO
  static void entrandoEmContato(String candidato) {
    int tentativasRealizadas = 1;
    boolean continuarTentando = true;
    boolean atendeu = false;

    do {
      atendeu = atender();
      continuarTentando = !atendeu;

      if (continuarTentando) {
        tentativasRealizadas++;
      } else {
        System.out.println("CONTATO REALIZADO COM SUCESSO!");
      }
    } while (continuarTentando && tentativasRealizadas < 3);

    if (atendeu) {
      System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa");
    } else {
      System.out.println(
          "Não conseguimos contato com " + candidato + ", número máximo de tentativas: " + tentativasRealizadas);
    }
  }

  // MÉTODO AUXILIAR
  static boolean atender() {
    return new Random().nextInt(3) == 1;
  }

  // IMPRIMIR LISTA DE CANDIDATOS SELECIONADOS
  static void imprimirSelecionados() {
    String[] candidatos = { "Felipe", "Marcia", "Julia", "Paulo", "Augusto" };

    for (int indice = 0; indice < candidatos.length; indice++) {
      System.out.println("o candidato " + (indice + 1) + " é " + candidatos[indice]);
    }

    // OU
    for (String candidato : candidatos) {
      System.out.println("O candiato selecionado foi " + candidato);
    }
  }

  // VALOR PRETENDIDO ALEATÓRIO
  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  // SELECIONANDO CANDIDATOS
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

  // ANALISANDO CANDIDATOS
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
