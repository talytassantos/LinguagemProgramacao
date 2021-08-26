package estruturaDeRepeticao;

/*
Objetivo    : Mostre todas as possibilidades de 2 dados de forma que a soma 
              tenha como resultado 7.
Programador : Talyta S. Santos
Data        : 12/03/2020
 */

public class Lt01_Ex41 {
    public static void main (String args[]){
        int d1 = 1, d2;
    
        do {
            d2 = 1;
            while (d2<=6){
                if ((d1 + d2) == 7){
                    System.out.println("Possibilidades: " +d1+ " e "+d2 );
                }
                d2++;
            }
            d1++;
        }while(d1<=6);     
    }  
}