package estruturaDeRepeticao;

/*
Objetivo    : Receba 2 n�meros inteiros, verifique qual o maior entre eles. 
              Calcule e mostre o resultado da somat�ria dos n�meros �mpares 
              entre esses valores.
Programador : Talyta S. Santos
Data        : 27/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex35 {
    public static void main (String args[]) {
        int a, b, soma=0;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero inteiro: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero inteiro: "));
                   
        if (a==b) {
            JOptionPane.showMessageDialog(null, "N�o h� somat�ria entre os n�meros impares"
                    + " entre os dois n�meros, pois eles s�o iguais.");
            System.exit(0);
        } 
        else if (a>b) {
            while (a>=b) {
                if (a%2==1){
                    soma = (soma + a);
                    a--;
                } else {
                    a--;
                }                       
            }
            JOptionPane.showMessageDialog(null,"A somat�ria dos n�meros impares entre os valores informados �"
             + soma);
        } else {
            while (b>=a) {
                if (b%2==1){
                    soma = (soma + b);
                    b--;
                } else {
                    b--;
                }                       
            }
            JOptionPane.showMessageDialog(null,"A somat�ria dos n�meros impares entre os valores informados �"
             + soma);
        }    
    }
}
