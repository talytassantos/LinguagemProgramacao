package sequencial;

/* 
Objetivo    : Receba a base e a altura de um tri�ngulo. 
              Calcule e mostre a sua �rea.
Programador : Talyta S. Santos
Data        : 06/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex03 {
    public static void main (String args[]) {
        double base, alt;
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do tri�ngulo: "));
        alt = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do tri�ngulo: "));
                        
        double area = (base * alt)/2;
        System.out.println ("A area do tri�ngulo � : " + area); 
    }
}
