package projetostreaming;

public class TestaTudo {
    public static void main(String[] args) {

        //Testando a classe usuario e adicionando dois objetos usuarios

        Usuario usuario1 = new Usuario("João Silva", "joao.silva@gmail.com", "Premium");
        Usuario usuario2 = new Usuario("Maria Souza", "maria.souza@gmail.com", "Básico");


        usuario1.exibirInformacoes();

        System.out.println();

        usuario2.exibirInformacoes();


        //Testando a classe filmes e adicionando objeto filme e objeto serie

        Filme filme = new Filme("Vingadores: Ultimato", 2019, "14 anos", 181);
        Serie serie = new Serie("Stranger Things", 2016, "14 anos", 4);


        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Ano de lançamento: " + filme.getAnoLancamento());
        System.out.println("Classificação: " + filme.getClassificacao());
        System.out.println("Duração: " + filme.getDuracao() + " minutos");

        //testando a reescrita de metodo

        System.out.println("Informações do filme:");
        filme.exibirInformacoes();



        System.out.println("Título: " + serie.getTitulo());
        System.out.println("Ano de lançamento: " + serie.getAnoLancamento());
        System.out.println("Classificação: " + serie.getClassificacao());
        System.out.println("Número de temporadas: " + serie.getNumeroDeTemporadas());

        //testando a reescrita de metodo

        System.out.println("Informações da série:");
        serie.exibirInformacoes();


        //Alterando os dados dos usuarios utilizando os setters

        usuario1.setNome("João Pedro");
        usuario1.setEmail("joaopedro@gmail.com");
        usuario1.setPlano("Básico");

        //Alterando os dados do filme utilizando os setters

        filme.setTitulo("Vingadores: Guerra Infinita");
        filme.setDuracao(149);

        //Alterando os dados da serie utilizando os setters

        serie.setNumeroDeTemporadas(5);


        usuario1.exibirInformacoes();

        System.out.println();

        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Duração: " + filme.getDuracao() + " minutos");

        System.out.println("Série: " + serie.getTitulo());
        System.out.println("Temporadas: " + serie.getNumeroDeTemporadas());


        //Testando o metodo assistir


        usuario1.assistir();

        //Testando a sobrecarga do metodo assistir

        usuario1.assistir(filme);


        //Testando a reescrita do metodo


        filme.exibirInformacoes();

        System.out.println();

        serie.exibirInformacoes();
    }
}