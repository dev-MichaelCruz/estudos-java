package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

  @Override
  public void copiar() {
    throw new UnsupportedOperationException("Unimplemented method 'copiar'");
  }

  @Override
  public void digitalizar() {
    throw new UnsupportedOperationException("Unimplemented method 'digitalizar'");
  }

  @Override
  public void imprimir() {
    throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
  }

}
