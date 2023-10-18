package Map.Contatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

  private Map<String, Integer> agendaContatoMap;

  public AgendaContatos() {
    this.agendaContatoMap = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone) {
    agendaContatoMap.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!agendaContatoMap.isEmpty()) {
      agendaContatoMap.remove(nome);
    }
  }

  public void exibirContatos() {
    System.out.println(agendaContatoMap);
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!agendaContatoMap.isEmpty()) {
      numeroPorNome = agendaContatoMap.get(nome);
    }
    return numeroPorNome;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.adicionarContato("Camila", 123455);
    agendaContatos.adicionarContato("Lucas", 123456);
    agendaContatos.adicionarContato("Marcelo", 123457);
    agendaContatos.adicionarContato("Andressa", 123458);
    agendaContatos.adicionarContato("João", 123459);

    agendaContatos.exibirContatos();

    agendaContatos.removerContato("Camila");
    agendaContatos.exibirContatos();

    System.out.println(agendaContatos.pesquisarPorNome("Marcelo"));
  }

}
