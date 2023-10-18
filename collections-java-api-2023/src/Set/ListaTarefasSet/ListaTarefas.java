package Set.ListaTarefasSet;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
  private Set<Tarefa> setTarefas;

  public ListaTarefas() {
    this.setTarefas = new HashSet<>();
  }

  public void adicionarTarefa(String descricao) {
    setTarefas.add(new Tarefa(descricao, false));
  }

  public void removerTarefa(String descricao) {
    Tarefa tarefaParaRemover = null;
    for (Tarefa tarefa : setTarefas) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        tarefaParaRemover = tarefa;
        setTarefas.remove(tarefaParaRemover);
        break;
      }
    }
  }

  public void exibirTarefas() {
    System.out.println(setTarefas);
  }

  public void contarTarefas() {
    System.out.println(setTarefas.size());
  }

  public Set<Tarefa> obterTarefasConcluidas() {
    Set<Tarefa> tarefasConcluidas = new HashSet<>();

    for (Tarefa tarefa : setTarefas) {
      if (tarefa.isConcluida()) {
        tarefasConcluidas.add(tarefa);
      }
    }

    return tarefasConcluidas;
  }

  public Set<Tarefa> obterTarefasPendentes() {
    Set<Tarefa> tarefasPendentes = new HashSet<>();

    for (Tarefa tarefa : setTarefas) {
      if (!tarefa.isConcluida()) {
        tarefasPendentes.add(tarefa);
      }
    }

    return tarefasPendentes;
  }

  public void marcarTarefaConcluida(String descricao) {
    for (Tarefa tarefa : setTarefas) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        tarefa.setConcluida(true);
        break;
      }
    }
  }

  public void marcarTarefaPendente(String descricao) {
    for (Tarefa tarefa : setTarefas) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        tarefa.setConcluida(false);
        break;
      }
    }
  }

  public void limparListaTarefas() {
    setTarefas.removeAll(setTarefas);
  }

  public static void main(String[] args) {
    ListaTarefas listaTarefas = new ListaTarefas();

    listaTarefas.adicionarTarefa("Tarefa 1");
    listaTarefas.adicionarTarefa("Tarefa 2");
    listaTarefas.adicionarTarefa("Tarefa 3");
    listaTarefas.adicionarTarefa("Tarefa 3");

    listaTarefas.exibirTarefas();

    listaTarefas.marcarTarefaConcluida("Tarefa 1");
    listaTarefas.exibirTarefas();

    listaTarefas.removerTarefa("Tarefa 2");
    listaTarefas.exibirTarefas();

    listaTarefas.contarTarefas();

    listaTarefas.obterTarefasConcluidas();
    listaTarefas.obterTarefasPendentes();

    listaTarefas.limparListaTarefas();
    listaTarefas.exibirTarefas();
  }
}
