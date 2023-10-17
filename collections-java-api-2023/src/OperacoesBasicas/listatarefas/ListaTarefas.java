package OperacoesBasicas.listatarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

  private List<Tarefa> tarefaList;

  public ListaTarefas() {
    this.tarefaList = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> tarefasParaRemover = new ArrayList<>();
    for (Tarefa tarefa : tarefaList) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(tarefa);
      }
    }

    tarefaList.removeAll(tarefasParaRemover);
  }

  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  public void obterDescricoesTerafs() {
    System.out.println(tarefaList);
  }

  public static void main(String[] args) {
    ListaTarefas listaTarefa = new ListaTarefas();

    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 3");
    System.out.println(listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.removerTarefa("Tarefa 3");
    System.out.println(listaTarefa.obterNumeroTotalTarefas());

    listaTarefa.obterDescricoesTerafs();

  }
}
