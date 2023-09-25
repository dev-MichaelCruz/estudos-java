public class Operadores {
    public static void main(String[] args) {

        // double soma = 12.7 + 32.93;
        // int subtracao = 3 - 2;
        // int multiplicacao = 3 * 3;
        // int divisao = 4 / 2;
        // int modulo = 18 % 2; // resto da divisao
        // double resultado = (10 * 7) + (20 / 4);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao); // 31

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao); // 1111

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao); // 1111

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao); // 1111

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao); // 13

        // Invertendo o valor de uma variável de positivo para negativo
        int numero = 5;

        numero = -numero;
        System.out.println(numero); // -5

        // Invertando de negativo para positivo
        int numero2 = -5;
        numero2 = numero2 * -1;
        System.out.println(numero2); // 5

        // CONDICIONAIS
        int a = 9;
        int b = 8;

        // if else
        if (a == b) {
            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }

        // if else (clean code)
        if (a != b) {
            System.out.println("verdadeiro");

        }

        // Operador ternário
        // se a igual a b, entao "verdadeiro" senao "falso"
        String result = a == b ? "verdadeiro" : "falso";
        System.out.println(result);

        // LÓGICOS
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas são verdadeiras");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das duas é verdadeira");
        }

        if (!condicao1 && !condicao2) {
            System.out.println("As duas são falsas");
        }

    }
}
