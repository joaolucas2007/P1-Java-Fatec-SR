package projetostreaming;

//Criando a classe Filme que herda da classe Conteudo
public class Filme extends Conteudo {

    private int duracao; // tempo do filme em minutos

    //Criando o construtor da classe Filme que chama o construtor da classe Conteudo
    public Filme(String titulo, int anoLancamento, String classificacao, int duracao) {

        super(titulo, anoLancamento, classificacao);

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
    @Override
public void exibirInformacoes() {
    System.out.println("Título: " + getTitulo());
    System.out.println("Ano de lançamento: " + getAnoLancamento());
    System.out.println("Classificação: " + getClassificacao());
    System.out.println("Duração: " + duracao + " minutos");
}
}