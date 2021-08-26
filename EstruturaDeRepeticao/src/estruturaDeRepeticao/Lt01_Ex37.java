package estruturaDeRepeticao;

/*
Objetivo    : Receba um n�mero inteiro. 
              Calcule e mostre a s�rie de Fibonacci at� o seu N�n�simo termo.
Programador : Talyta S. Santos
Data        : 12/03/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex37 {
    public static void main (String args[]){
        int n, a=0, b=1, c=0;
        
        //Sequencia fibonacci 1, 2, 3, 5, 8, 13, 21, 34, 55
        n = Integer.parseInt(JOptionPane.showInputDialog("Escolha at� que posi��o da s�rie de fibonacci : "));
        
        System.out.print("O "+n+ "o termo na s�rie de fibonacci � ");
        
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
