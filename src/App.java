public class App {
    public static void main(String[] args) throws Exception {

        Usuario Us = new Usuario();

        Us.setNome("Gabriel");
        Us.setTelefone("7195241632178");
        Us.setEndereco("Rua tal");
        Us.setLogin("biel 1");
        Us.setSenhaIncriptada("416854dgasdgdg");

        Us.incluir(Us);
        Us.Listar();

    }
}
