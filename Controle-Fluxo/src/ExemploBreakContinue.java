public class ExemploBreakContinue {
    public static void main(String[] args) {

        // aqui a ececução para no número 3
        // for (int numero = 1; numero <= 5; numero++) {
        // if (numero == 3)
        // break;

        // System.out.println(numero);
        // }

        // aqui a execução pula o número 3 e continua após
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                continue;

            System.out.println(numero);
        }

    }
}
