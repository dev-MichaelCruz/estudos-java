import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {

        double mesada = 50;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio();

            if (valorDoce > mesada) {
                valorDoce = mesada;
            }

            System.out.println("Doce de valor " + valorDoce + "Adicionado no carrinho");
            mesada -= valorDoce;
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Michael gastou toda sua mesa em doces");
    }

    // cria um valor aleatorio entre 1 e 10
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(1, 10);
    }
}
