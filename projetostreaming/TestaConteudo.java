package projetostreaming;

public class TestaConteudo {
    public static void main (String[] args) {
        //Criando os objetos a partir do construtor
        Conteudo filme1 = new Conteudo("Vingadores: Ultimato", 2019, "14 anos");
        Conteudo filme2 = new Conteudo("A Origem", 2010, "12 anos");

        //Alterando os dados do conteudo 1 e conteudo 2 utilizando os metodos setters
        filme1.setTitulo("Vingadores: Guerra Infinita");
        filme1.setAnoLancamento(2018);
        filme1.setClassificacao("12 anos");

        filme2.setTitulo("Interestelar");
        filme2.setAnoLancamento(2014);
        filme2.setClassificacao("Livre");   
        
        //Trazendo os dados alterados do conteudo 1 e conteudo 2
        System.out.println("Titulo do conteudo 1 após alteração: " + filme1.getTitulo());
        System.out.println("Ano de lançamento do conteudo 1 após alteração: " + filme1.getAnoLancamento());
        System.out.println("Classificação do conteudo 1 após alteração: " + filme1.getClassificacao());
        
        System.out.println("Titulo do conteudo 2 após alteração: " + filme2.getTitulo());    
        System.out.println("Ano de lançamento do conteudo 2 após alteração: " + filme2.getAnoLancamento());
        System.out.println("Classificação do conteudo 2 após alteração: " + filme2.getClassificacao());
    }
}
