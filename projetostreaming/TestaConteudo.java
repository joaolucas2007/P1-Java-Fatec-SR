package projetostreaming;

public class TestaConteudo {
    public static void main (String[] args) {
        //Criando os objetos a partir do construtor
        Conteudo filme1 = new Conteudo("Vingadores: Ultimato", 2019, "14 anos");
        Conteudo filme2 = new Conteudo("A Origem", 2010, "12 anos");

        //Criando objetos a partir do construtor porém series

        Conteudo serie1 = new Conteudo("Breaking Bad", 2008, "16 anos");
        Conteudo serie2 = new Conteudo("Game of Thrones", 2011, "18 anos");


        //Alterando os dados do filme1 e filme2 utilizando os metodos setters
        filme1.setTitulo("Vingadores: Guerra Infinita");
        filme1.setAnoLancamento(2018);
        filme1.setClassificacao("12 anos");

        filme2.setTitulo("Interestelar");
        filme2.setAnoLancamento(2014);
        filme2.setClassificacao("Livre");


        //Alterando os dados da serie1 e serie2 utilizando os metodos setters
        serie1.setTitulo("Stranger Things");
        serie1.setAnoLancamento(2016);
        serie1.setClassificacao("14 anos");

        serie2.setTitulo("Interstellar");
        serie2.setAnoLancamento(2014);
        serie2.setClassificacao("12 anos");



        //Trazendo os dados alterados do conteudo 1 e conteudo 2
        System.out.println("Titulo do conteudo 1 após alteração: " + filme1.getTitulo());
        System.out.println("Ano de lançamento do conteudo 1 após alteração: " + filme1.getAnoLancamento());
        System.out.println("Classificação do conteudo 1 após alteração: " + filme1.getClassificacao());
        
        System.out.println("Titulo do conteudo 2 após alteração: " + filme2.getTitulo());
        System.out.println("Ano de lançamento do conteudo 2 após alteração: " + filme2.getAnoLancamento());
        System.out.println("Classificação do conteudo 2 após alteração: " + filme2.getClassificacao());


        //Trazendo os dados alterados da serie 1 e serie 2
        System.out.println("Titulo da serie 1 após alteração: " + serie1.getTitulo());
        System.out.println("Ano de lançamento da serie 1 após alteração: " + serie1.getAnoLancamento());
        System.out.println("Classificação da serie 1 após alteração: " + serie1.getClassificacao());
    }
}
