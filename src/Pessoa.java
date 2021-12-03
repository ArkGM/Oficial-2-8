public class Pessoa implements InterfacePessoa {

  private String nome;
  private String Telefone;
  private String Endereco;
  private Pessoa[] lista_contato;
  private int max = 10;
  private int pointer = 0;

  public Pessoa(String nome, String telefone, String email, String endereco) {
    this.nome = "nome";
    this.Telefone = "telefone";
    this.Endereco = "endereco";
  }

  public Pessoa() {

    lista_contato = new Pessoa[max];
  }

  @Override
  public void incluir(Pessoa p) {

    lista_contato[pointer] = p;
    pointer++;
    System.out.println("Contato adicionado com sucesso.\n");

    if (pointer == max) {

      System.out.println("Você adicionou o ultimo contato a lista.\nSe quiser adicionar mais contatos exclua um.");
    }
  }

  @Override
  public void Alterar(Pessoa contatoAntigo, Pessoa contatoNovo) {

    for (int i = 0; i < pointer; i++) {
      if (contatoAntigo.equals(lista_contato[i])) {
        lista_contato[i].setNome(contatoNovo.getNome());
        lista_contato[i].setEndereco(contatoNovo.getEndereco());
        lista_contato[i].setTelefone(contatoNovo.getTelefone());
      }
    }
  }

  @Override
  public void Excluir(Pessoa p) {

    for (int i = 0; i < pointer; i++) {
      if (p.equals(lista_contato[i])) {
        lista_contato[i].setNome(null);
        lista_contato[i].setEndereco(null);
        lista_contato[i].setTelefone(null);
      }
    }
  }

  @Override
  public void Listar() {
    for (int i = 0; i < pointer; i++) {

      System.out.println(lista_contato[i].getNome());
      System.out.println(lista_contato[i].getEndereco());
      System.out.println(lista_contato[i].getTelefone());

    }
  }

  public String getNome() {
    return nome;
  }

  public String getEndereco() {
    return Endereco;
  }

  public void setEndereco(String endereco) {
    this.Endereco = endereco;
  }

  public String getTelefone() {
    return Telefone;
  }

  public void setTelefone(String telefone) {
    this.Telefone = telefone;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

}
