package sequencial;

/* 
Objetivo    : Receba o raio de uma circunfer�ncia. 
              Calcule e  mostre o comprimento da circunfer�ncia
Programador : Talyta S. Santos
Data        : 08/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex11 {
    public static void main (String args[]) {
        double c, pi = 3.14, raio;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da circunfer�ncia: "));
                       
        c = (2 * pi * raio);
        
        System.out.println("O comprimento da circunfer�ncia �:" + c);
    }
}
