package estruturaDeRepeticao;

/*
Objetivo    : Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
Programador : Talyta S. Santos
Data        : 12/03/2020
 */

public class Lt01_Ex42 {
    public static void main (String args[]){
        int a, b=1;
        
        System.out.println(b);
        
        for (a=2;a<=50;a++){            
            b = b+2;
          
            System.out.println(a + "/" + b);                        
        } 
    }  
}
