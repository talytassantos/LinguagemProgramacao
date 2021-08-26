package estruturaDeRepeticao;

/*
Objetivo    : Receba um n�mero inteiro. Calcule e mostre o seu fatorial.
Programador : Talyta S. Santos
Data        : 20/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex32 {
    public static void main (String args[]){
        int n, fat, a;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
        
        fat = n;
        a = n;
        
        while(n>1){
            fat = (fat*(n-1));
            n--;
        }
        System.out.println("O fatorial de " + a + " �: " + fat);
    } 
}