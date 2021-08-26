package estruturaDeRepeticao;

/*
Objetivo    : Calcule e mostre quantos anos serão necessários para que Ana 
              seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano
              e Maria tem 1,5 m e cresce 2 cm ao ano.
Programador : Talyta S. Santos
Data        : 12/03/2020
 */

public class Lt01_Ex43 {
    public static void main (String args[]){
        double ana = 1.10, maria = 1.5;
        int anos = 0;
        
        while(ana < maria){
            
            maria = maria + 0.02;
            ana = ana + 0.03;
            
            anos ++;
        }
        System.out.println(anos);
    }  
}

