package projetostreaming;

public class Usuario {
    
    // Criando os Atributos da classe Usuario
   private String nome;
   private String email;
   private String plano;
    
    // Criando os metodos da classe usuario
    void assistir () {
        System.out.println("O usuário está assistindo.");
    }

    //Criando uma sobrecarga conteudo para assistir
    void assistir ( Conteudo conteudo) {
        System.out.println("O usuário está assistindo." + conteudo.getTitulo());
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


    //Criando os metodos Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getPlano() {
        return plano;
    }
    public void setPlano(String plano) {
        this.plano = plano;
    }
}

