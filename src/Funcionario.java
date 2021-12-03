public class Funcionario extends Pessoa {

  private Double Matricula;
  private String Departamento;

  public Double getMatricula() {
    return Matricula;
  }

  public String getDepartamento() {
    return Departamento;
  }

  public void setDepartamento(String departamento) {
    this.Departamento = departamento;
  }

  public void setMatricula(Double matricula) {
    this.Matricula = matricula;
  }

}
