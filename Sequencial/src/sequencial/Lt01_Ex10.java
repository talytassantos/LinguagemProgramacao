package sequencial;

/* 
Objetivo    : Receba 2 n�meros reais. Calcule e mostre a diferen�a desses valores.
Programador : Talyta S. Santos
Data        : 07/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex10 {
    public static void main (String args []) {
        double A, B, Dif;
        
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero real: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite outro n�mero real: "));
        
        Dif = (A - B);
        
        System.out.println ("A diferen�a entre os n�meros �: " + Dif);
    }
}
