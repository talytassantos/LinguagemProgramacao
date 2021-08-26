package funcao;

/*
Objetivo    : Receba um n�mero inteiro. Calcule e mostre o seu fatorial.
Programador : Talyta S. Santos
Data        : 20/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_ModFun32 {
    public static void main (String args []){
        int n;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
        JOptionPane.showMessageDialog(null,"O fatorial de " + n + " � " + FuncaoFatorial(n));
    }
    
    static int FuncaoFatorial (int num){
    int fat = num;
    
        while (num>1){
            fat = (fat*(num-1));
            num--;
        }
    return fat;
    }
}