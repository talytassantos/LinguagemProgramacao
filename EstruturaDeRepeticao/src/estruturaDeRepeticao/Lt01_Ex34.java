package estruturaDeRepeticao;

/*
Objetivo    : Receba um n�mero. 
              Calcule e mostre os resultados da tabuada desse n�mero.
Programador : Talyta S. Santos
Data        : 20/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex34 {
    public static void main (String args[]) {
        double n,a=1, res;
        n = Double.parseDouble(JOptionPane.showInputDialog("Informe um n�mero: "));
                 
        while (a<=10) {
            res = n * a;
            System.out.println(res);
            a++;
        }             
    }     
}
