package projetostreaming;

public class Conteudo {
    private String titulo;
    private int anoLancamento;
    private String classificacao;

    //Criando o construtor da classe Conteudo
    public Conteudo(String titulo, int anoLancamento, String classificacao) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.classificacao = classificacao;
    }

    //Criando os metodos Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento; 
    }
    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    //Criando o metodo exibirInformacoes que exibe as informações do conteudo
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Ano de lançamento: " + anoLancamento);
        System.out.println("Classificação: " + classificacao);
    }
}
