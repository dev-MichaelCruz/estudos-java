import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira a primeira nota do aluno");
        double primeiraNota = leitor.nextDouble();

        System.out.println("Insira a segunda nota do aluno");
        double segundaNota = leitor.nextDouble();

        double media = (primeiraNota + segundaNota) / 2;

        System.out.println("A média do aluno é: " + media);

    }

}
