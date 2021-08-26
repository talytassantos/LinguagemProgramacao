package estruturaDeRepeticao;

/*
Objetivo    : Receba o número da base e do expoente. 
              Calcule e mostre o valor da potência.
Programador : Talyta S. Santos
Data        : 12/03/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex44 {
    public static void main (String args[]){
        int base, exp, aux, pot;
        
        base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base: "));
        exp = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente: "));
        
        pot = base;
                
        for (aux = exp; aux >= 1; aux--){
            pot = base * pot;
        }
        System.out.println("A potencia de " + base + "^" + exp + " é " + pot);
    }
}
