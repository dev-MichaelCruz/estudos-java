import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numeroConta = leitor.nextInt();

        System.out.println("Digite o número a Agência:");
        String numeroAgencia = leitor.next();

        System.out.println("Digite o dígito a Agência:");
        String digitoAgencia = leitor.next();

        System.out.println("Digite o nome do cliente:");
        String nomeCliente = leitor.next();

        System.out.println("Digite o sobrenome do cliente:");
        String sobrenomeCliente = leitor.next();

        System.out.println("Qual o valor do depósito inicial?");
        double saldo = leitor.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente
                + " ,obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + "-" + digitoAgencia
                + ", conta " + numeroConta + " e seu saldo de R$ " + saldo + " já está disponível para saque");

    }
}
