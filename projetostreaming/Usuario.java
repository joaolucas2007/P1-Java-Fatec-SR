package projetostreaming;

public class Usuario {
    
    // Criando os Atributos da classe Usuario
    String nome;
    String email;
    String plano;
    
    // Criando os metodos da classe usuario
    void assistir () {
        System.out.println("O usuário está assistindo.");
    }
    void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Plano: " + plano);
    }
    public Usuario(String nome, String email, String plano) {
        this.nome = nome;
        this.email = email;
        this.plano = plano;
    }
}

