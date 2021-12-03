public class Usuario extends Pessoa {

  private String Login;
  private String Senha;

  public String getLogin() {
    return Login;
  }

  public String getSenha() {
    return Senha;
  }

  public void setSenha(String senha) {
    this.Senha = senha;
  }

  public void setLogin(String login) {
    this.Login = login;
  }

}
