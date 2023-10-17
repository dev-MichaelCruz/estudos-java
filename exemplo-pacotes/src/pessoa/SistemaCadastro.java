package pessoa;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "00011122233");

        marcos.setEndereco("Rua 10, 43");

        System.out.println(marcos.getNome()+
                " - " + marcos.getCpf()+
                " - " + marcos.getEndereco());

    }
}
