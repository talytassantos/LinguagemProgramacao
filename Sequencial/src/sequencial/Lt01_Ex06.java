package sequencial;

/* 
Objetivo    : Receba os valores em x e y. 
              Efetua a troca de seus valores e mostre seus conte�dos.
Programador : Talyta S. Santos
Data        : 07/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex06 {
    public static void main (String args []) {
        int X, Y, A;
                
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para X: "));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para Y: "));
        
        A = X;
        X = Y;
        Y = A;
        
        System.out.println("O novo conte�do de X �: " + X);
        System.out.println("O novo conte�do de Y �: " + Y);                 
    }    
}
