package projetostreaming;

public class TestaConteudo {
    public static void main (String[] args) {
        //Criando os objetos a partir do construtor
        Conteudo conteudo1 = new Conteudo("Vingadores: Ultimato", 2019, "14 anos");
        Conteudo conteudo2 = new Conteudo("A Origem", 2010, "12 anos");



        //ultilizando os metodos getters para trazer os dados do conteudo 1 e conteudo 2
        System.out.println("Titulo do conteudo 1: " + conteudo1.getTitulo());
        System.out.println("Ano de lançamento do conteudo 1: " + conteudo1.getAnoLancamento());
        System.out.println("Classificação do conteudo 1: " + conteudo1.getClassificacao());

        System.out.println("Titulo do conteudo 2: " + conteudo2.getTitulo());
        System.out.println("Ano de lançamento do conteudo 2:" + conteudo2.getAnoLancamento());
        System.out.println("Classificação do conteudo 2: " + conteudo2.getClassificacao());

        //Alterando os dados do conteudo 1 e conteudo 2 utilizando os metodos setters
        conteudo1.setTitulo("Vingadores: Guerra Infinita");
        conteudo1.setAnoLancamento(2018);
        conteudo1.setClassificacao("12 anos");

        conteudo2.setTitulo("Interestelar");
        conteudo2.setAnoLancamento(2014);
        conteudo2.setClassificacao("Livre");   
        
        //Trazendo os dados alterados do conteudo 1 e conteudo 2
        System.out.println("Titulo do conteudo 1 após alteração: " + conteudo1.getTitulo());
        System.out.println("Ano de lançamento do conteudo 1 após alteração: " + conteudo1.getAnoLancamento());
        System.out.println("Classificação do conteudo 1 após alteração: " + conteudo1.getClassificacao());
        
        System.out.println("Titulo do conteudo 2 após alteração: " + conteudo2.getTitulo());    
        System.out.println("Ano de lançamento do conteudo 2 após alteração: " + conteudo2.getAnoLancamento());
        System.out.println("Classificação do conteudo 2 após alteração: " + conteudo2.getClassificacao());
    }
}
