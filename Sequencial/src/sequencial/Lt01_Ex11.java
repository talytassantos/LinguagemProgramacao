package sequencial;

/* 
Objetivo    : Receba o raio de uma circunferência. 
              Calcule e  mostre o comprimento da circunferência
Programador : Talyta S. Santos
Data        : 08/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex11 {
    public static void main (String args[]) {
        double c, pi = 3.14, raio;
        
        raio = Double.parseDouble(JOptionPane.showInputDialog("Informe o raio da circunferência: "));
                       
        c = (2 * pi * raio);
        
        System.out.println("O comprimento da circunferência é:" + c);
    }
}
