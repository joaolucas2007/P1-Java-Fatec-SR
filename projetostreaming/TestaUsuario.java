package projetostreaming;

public class TestaUsuario {
    // Criando o metodo main
    public static void main(String[] args) {
        // Criando o objeto usuario1 da classe Usuario
        Usuario usu1 = new Usuario();
        // Atribuindo valores aos atributos do objeto usuario1
        usu1.nome = "João";
        usu1.email = "joao.silva@gmail.com";
        usu1.plano = "Premium";
        // Chamando o metodo assistir do objeto usuario1
        usu1.assistir();
        // Chamando o metodo exibirInformacoes do objeto usuario1
        usu1.exibirInformacoes();
    }
}
