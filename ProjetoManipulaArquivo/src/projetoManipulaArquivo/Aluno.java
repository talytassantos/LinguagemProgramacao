package projetoManipulaArquivo;

public class Aluno {
    String pnome;
    String unome;
    int pontos;
    
    //Metodo Construtor
    Aluno(){
        this(" ", " ", 0);
    }
           
    //Metodo Procedimento
    Aluno (String pnomealuno, String unomealuno, int pontosaluno){
        pnome = pnomealuno;
        unome = unomealuno;
        pontos = pontosaluno;
    }
}