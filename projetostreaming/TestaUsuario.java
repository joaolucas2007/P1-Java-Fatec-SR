package projetostreaming;

public class TestaUsuario {
    // Criando o metodo main
    public static void main(String[] args) {
       
        /*Usuario usu1 = new Usuario();
      
        usu1.nome = "João";
        usu1.email = "joao.silva@gmail.com";
        usu1.plano = "Premium";*/    


        //Agora usando o construtor para inserir os dados do usuario
        Usuario usu1 = new Usuario("João Silva", "joao.silva@gmail.com", "Premium");
        Usuario usu2 = new Usuario("Maria Souza", "maria.souza@gmail.com", "Básico");

        /*//Chamando os metodos da classe Usuario
        usu1.assistir();   
        usu1.exibirInformacoes();

        usu2.assistir();
        usu2.exibirInformacoes();*/ // Deixando comentado para focar nos metodos Getters e Setter
        
        //Testando o metodo getters trazendo os dados do usuario 1 e usuario 2
        System.out.println("Nome do usuário 1: " + usu1.getNome());
        System.out.println("Email do usuário 1: " + usu1.getEmail());
        System.out.println("Plano do usuário 1: " + usu1.getPlano());

        System.out.println("Nome do usuário 2: " + usu2.getNome());
        System.out.println("Email do usuário 2: " + usu2.getEmail());
        System.out.println("Plano do usuário 2: " + usu2.getPlano());

        //Testando o metodo setters alterando os dados do usuario 1 e usuario 2
        usu1.setNome("João Pedro");
        usu1.setEmail("joaopedro@gmail.com");
        usu1.setPlano("Básico");

        usu2.setNome("Eduarda Lima");
        usu2.setEmail("Eduardalima@gmail.com");
        usu2.setPlano("Premium");

        // Verificando os dados alterados pelos setters
        System.out.println("Dados do usuário 1 após alteração:");
        System.out.println("Nome: " + usu1.getNome());
        System.out.println("Email: " + usu1.getEmail());
        System.out.println("Plano: " + usu1.getPlano());

        System.out.println("Dados do usuário 2 após alteração:");
        System.out.println("Nome: " + usu2.getNome());
        System.out.println("Email: " + usu2.getEmail());
        System.out.println("Plano: " + usu2.getPlano());
    }
}
