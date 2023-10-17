package equipamentos.estabelecimento;

import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;

public class Fabrica {
    public static void main(String[] args) throws Exception {

        Impressora impressora = new Deskjet();

        impressora.imprimir();
    }
}
