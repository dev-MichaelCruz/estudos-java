package TratamentoDeExcecoes;

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class AboutMe {
  public static void main(String[] args) {

    try {
      Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

      System.out.println("Digite seu nome:");
      String nome = leitor.next();

      System.out.println("Digite seu sobrenome:");
      String sobrenome = leitor.next();

      System.out.println("Digite a sua idade:");
      int idade = leitor.nextInt();

      System.out.println("Digite a sua altura:");
      double altura = leitor.nextDouble();

      System.out.println("Olá, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
      System.out.println("Tenho " + idade + " anos.");
      System.out.println("Minha altura é " + altura + "cm.");
      leitor.close();

    } catch (InputMismatchException e) {
      System.err.println("Os campos de idade e altura, devem ser numéricos");
      main(args);
    }

  }
}
