package Set.Alunos;

public class Aluno {

  private String nome;
  private long matricula;
  private double nota;

  public Aluno(String nome, int matricula, double nota) {
    this.nome = nome;
    this.matricula = matricula;
    this.nota = nota;
  }

  @Override
  public String toString() {
    return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
  }

  public String getNome() {
    return nome;
  }

  public long getMatricula() {
    return matricula;
  }

  public double getNota() {
    return nota;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (matricula ^ (matricula >>> 32));
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Aluno other = (Aluno) obj;
    if (matricula != other.matricula)
      return false;
    return true;
  }

}
