package projetostreaming;

public class TestaSerie {
    public static void main(String[] args) {
        // Criando uma série
        Serie serie1 = new Serie("Stranger Things", 2016, "14 anos", 4);
        // Testando para ver se pegou os atributos de conteudo
        System.out.println("Título: " + serie1.getTitulo());
        System.out.println("Ano de lançamento: " + serie1.getAnoLancamento());
        System.out.println("Classificação: " + serie1.getClassificacao());
        // Acessando o atributo próprio de Serie
        System.out.println("Número de temporadas: " + serie1.getNumeroDeTemporadas());
    }
}
