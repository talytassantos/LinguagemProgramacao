package sequencial;

/* 
Objetivo    : Receba os valores do comprimento, largura e altura 
              de um paralelepípedo.
              Calcule e mostre seu volume.
Programador : Talyta S. Santos
Data        : 07/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex07 {
    public static void main (String args []) {
        int C, L, A, V;
        
        L = Integer.parseInt(JOptionPane.showInputDialog("Informe a largura do paralelepipedo: "));
        C = Integer.parseInt(JOptionPane.showInputDialog("Informe o comprimento do paralelepipedo: "));
        A = Integer.parseInt(JOptionPane.showInputDialog("Informe a altura do paralelepipedo: "));
      
        V = L * C * A; 
        
        System.out.println("O volume do paralelepido informado é: " + V);        
    }
}
