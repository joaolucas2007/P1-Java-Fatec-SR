package projetostreaming;

public class Serie extends Conteudo {
    private int numeroDeTemporadas;

    // Criando o construtor da classe Serie que chama o construtor da classe Conteudo
    public Serie(String titulo, int anoLancamento, String classificacao, int numeroDeTemporadas) {
        super(titulo, anoLancamento, classificacao);
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    // Getter e Setter para numeroDeTemporadas
    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }
}
