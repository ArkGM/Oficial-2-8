public class Funcionario extends Pessoa {

  private Double Matricula;
  private String Departamento;

  @Override
  public void Listar() {
    for (int i = 0; i < pointer; i++) {

      System.out.println(lista_contato[i].getNome());
      System.out.println(lista_contato[i].getEndereco());
      System.out.println(lista_contato[i].getTelefone());
      System.out.println(getMatricula());
      System.out.println(getDepartamento());

    }
  }

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
