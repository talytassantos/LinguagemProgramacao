package sequencial;

/* 
Objetivo    : Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais 
              (considerar que a equação possue2 raízes).
Programador : Talyta S. Santos
Data        : 06/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex05 {
    public static void main (String args[]) {
        int A, B, C, Delta;
        double R, x1, x2;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite B: "));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite C: "));
        
        Delta = (B*B) - (4*A*C);
        
        R = Math.sqrt(Delta);
                
        x1 = (-B + R) / 2*A;          
        x2 = (-B - R) / 2*A;
        
        System.out.println("A primeira raiz é: " + x1);
        System.out.println("A segunda raiz é: " + x2);
    }
}
