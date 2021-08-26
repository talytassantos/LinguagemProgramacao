package estruturaDeRepeticao;

/*
Objetivo    : Receba um número inteiro. 
              Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
Programador : Talyta S. Santos
Data        : 12/03/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex37 {
    public static void main (String args[]){
        int n, a=0, b=1, c=0;
        
        //Sequencia fibonacci 1, 2, 3, 5, 8, 13, 21, 34, 55
        n = Integer.parseInt(JOptionPane.showInputDialog("Escolha até que posição da série de fibonacci : "));
        
        System.out.print("O "+n+ "o termo na série de fibonacci é ");
        
        if (n==1){ 
           c = a + b;
           System.out.println(c);
        } else {
            while (n>=1){
                c = a + b;        
                
                a = b;
                b = c;
                n --;
                
                System.out.print(c + " ");
            }
        }
    }
}
