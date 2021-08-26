package funcao;

/*
Objetivo    : Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
Programador : Talyta S. Santos
Data        : 20/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_ModFun33 {
    public static void main (String args[]){
        double n;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
        JOptionPane.showMessageDialog(null,"O número de série é "+ FuncaoSerie(n));
    }
    
    static double FuncaoSerie (double num){
        double serie = 0;
        
        while (num>=1){
            serie = serie + (1/num);
            num--;
        }
        return serie;
    }
}