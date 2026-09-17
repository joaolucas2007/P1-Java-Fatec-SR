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

    
        usu1.assistir();   
        
        usu1.exibirInformacoes();
    }
}
