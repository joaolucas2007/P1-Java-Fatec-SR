package projetostreaming;

//Criando a classe Filme que herda da classe Conteudo
public class Filme extends Conteudo {

    private int duracao; // tempo do filme em minutos

    //Criando o construtor da classe Filme que chama o construtor da classe Conteudo
    public Filme(String titulo, int anoLncamento, String classificacao, int duracao) {

        super(titulo, anoLncamento, classificacao);

        this.duracao = duracao;
    }

    // Getter da duração
    public int getDuracao() {
        return duracao;
    }

    // Setter da duração
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}