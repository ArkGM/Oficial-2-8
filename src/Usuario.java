import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Usuario extends Pessoa {

  private String Login;
  private String Senha;
  private String SenhaIncriptada;

  public void SenhaIncriptada() throws NoSuchAlgorithmException, UnsupportedEncodingException {

    MessageDigest digest = MessageDigest.getInstance("SHA-256");
    byte MessageDigest[] = digest.digest(Senha.getBytes("UTF-8"));

    System.out.print(MessageDigest);
  }

  @Override
  public void Listar() {
    for (int i = 0; i < pointer; i++) {

      System.out.println(lista_contato[i].getNome());
      System.out.println(lista_contato[i].getEndereco());
      System.out.println(lista_contato[i].getTelefone());
      System.out.println(getLogin());
      System.out.println(getSenha());

    }
  }

  public String getLogin() {
    return Login;
  }

  public String getSenhaIncriptada() {
    return SenhaIncriptada;
  }

  public void setSenhaIncriptada(String senhaIncriptada) {
    this.SenhaIncriptada = senhaIncriptada;
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
