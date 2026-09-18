package projetostreaming;

public class TestaFilme {
     public static void main(String[] args) {

        // Criando um objeto Filme utilizando o construtor
        Filme filme1 = new Filme("Vingadores: Ultimato", 2019, "14 anos", 181);

        // Testando para ver se pegou os atributos de conteudo
        System.out.println("Título: " + filme1.getTitulo());
        System.out.println("Ano de lançamento: " + filme1.getAnoLancamento());
        System.out.println("Classificação: " + filme1.getClassificacao());

        // Acessando o atributo próprio de Filme
        System.out.println("Duração: " + filme1.getDuracao() + " minutos");
    }
}

