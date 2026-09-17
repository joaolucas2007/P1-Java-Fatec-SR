package projetostreaming;

public class TestaUsuario {
    
    public static void main(String[] args) {

        // Criando usuários utilizando o construtor
        Usuario usu1 = new Usuario("João Silva", "joao.silva@gmail.com", "Premium");
        Usuario usu2 = new Usuario("Maria Souza", "maria.souza@gmail.com", "Básico");

        // Criando um conteúdo
        Conteudo filme1 = new Conteudo("Vingadores: Ultimato", 2019, "14 anos");
        Conteudo filme2 = new Conteudo("A Origem", 2010, "12 anos");
        // Testando a sobrecarga do método assistir
        usu1.assistir(filme1);
        usu2.assistir(filme2);
        // Testando o método assistir() e exibirInformacoes()
        usu1.assistir();
        usu1.exibirInformacoes();

        usu2.assistir();
        usu2.exibirInformacoes();

        // Testando os setters
        usu1.setNome("João Pedro");
        usu1.setEmail("joaopedro@gmail.com");
        usu1.setPlano("Básico");

        usu2.setNome("Eduarda Lima");
        usu2.setEmail("Eduardalima@gmail.com");
        usu2.setPlano("Premium");

        // Verificando os dados alterados pelos setters junto do conteúdo que cada usuário está assistindo
        System.out.println("Dados do usuário 1 após alteração:");
        System.out.println("Nome: " + usu1.getNome());
        System.out.println("Email: " + usu1.getEmail());
        System.out.println("Plano: " + usu1.getPlano());
        System.out.println("Filme que o usuario 1 está assistindo: " + filme1.getTitulo());

        System.out.println("Dados do usuário 2 após alteração:");
        System.out.println("Nome: " + usu2.getNome());
        System.out.println("Email: " + usu2.getEmail());
        System.out.println("Plano: " + usu2.getPlano());
        System.out.println("Filme que o usuario 2 está assistindo: " + filme2.getTitulo());
    }
}