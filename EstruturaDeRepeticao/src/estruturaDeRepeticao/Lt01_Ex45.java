/*
Objetivo    : Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
Programador : Talyta S. Santos
Data        : 12/03/2020
 */
package estruturaDeRepeticao;

public class Lt01_Ex45 {
    public static void main (String args[]){
        int a, b = 1;
       
        System.out.println(b);
        
        for (a=2;a<=15;a++){            
            b = a * a;
          
            System.out.println(a + "/" + b);                        
        } 
    }  
}