package sequencial;

/* 
Objetivo    : Receba os 2 n�meros inteiros. Calcule e mostre a soma dos quadrados.   
Programador : Talyta S. Santos
Data        : 07/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex09 {
    public static void main (String arg []) {
       int n1, n2, somaQ;
       
       n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
       n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: ")) ;
               
       somaQ = (n1 * n1) + (n2 * n2);

       System.out.println ("A soma dos quadrados de A e B �: " + somaQ);             
    }  
}
