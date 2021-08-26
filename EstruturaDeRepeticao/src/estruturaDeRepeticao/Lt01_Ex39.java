package estruturaDeRepeticao;

/*
Objetivo    : Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
              Casa: 1 2 3 4 ... 64
              Qte: 1 2 4 8 ... N
Programador : Talyta S. Santos
Data        : 12/03/2020
 */

public class Lt01_Ex39 {
    public static void main (String agrs[]){
        int casa=1, qtd=1, aux;
        
        System.out.println("Casa: "+ casa +" Qtde:  "+qtd );
        
        for (aux=2;aux<=64;aux++){
            qtd = qtd * 2 ;
            
            System.out.println("Casa: "+ aux +" Qtde:  "+qtd );
        }
    } 
}
