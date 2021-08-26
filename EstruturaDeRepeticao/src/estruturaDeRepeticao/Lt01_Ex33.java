package estruturaDeRepeticao;

/*
Objetivo    : Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Programador : Talyta S. Santos
Data        : 20/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex33 {
    public static void main (String args[]) {
        double n, serie = 0;
        n = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: "));
        
        while(n>=1) {
            serie = serie + (1/n);
            n--;
        }
        System.out.println("O número de série é %.2f" + serie);
    }
}
