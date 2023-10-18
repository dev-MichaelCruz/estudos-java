package Set.Alunos;

import java.util.Comparator;
// import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

  private Set<Aluno> setAlunos;

  public GerenciadorAlunos() {
    this.setAlunos = new HashSet<>();
  }

  public void adicionarAluno(String nome, long matricula, double media) {
    setAlunos.add(new Aluno(nome, 0, media));
  }

  public void removerAluno(long matricula) {
    Aluno alunoParaRemover = null;

    for (Aluno aluno : setAlunos) {
      if (aluno.getMatricula() == matricula) {
        alunoParaRemover = aluno;
        setAlunos.remove(alunoParaRemover);
        break;
      }
    }
  }

  public void exibirAlunosPorNome() {
    Set<Aluno> alunosPorNome = new TreeSet<>(setAlunos);

    if (!setAlunos.isEmpty()) {
      System.out.println(alunosPorNome);
    } else {
      System.out.println("Conjunto vazio");
    }
  }

  public void exibirAlunosPorNota() {
    Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());

    if (!setAlunos.isEmpty()) {
      alunosPorNota.addAll(setAlunos);
      System.out.println(alunosPorNota);
    } else {
      System.out.println("Conjunto vazio");
    }
  }

}

// class ComparatorPorNome implements Comparable<Aluno> {
// @Override
// public int compareTo(Aluno aluno1) {
// }
// }

class ComparatorPorNota implements Comparator<Aluno> {
  @Override
  public int compare(Aluno aluno1, Aluno aluno2) {
    return Double.compare(aluno1.getNota(), aluno2.getNota());
  }

}
