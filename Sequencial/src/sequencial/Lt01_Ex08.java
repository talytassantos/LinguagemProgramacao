package sequencial;

/* 
Objetivo    : Receba o valor de um dep�sito em poupan�a. 
              Calcule e mostre o valor ap�s 1 m�s de aplica��o 
              sabendo que rende 1,3% a. m.    
Programador : Talyta S. Santos
Data        : 07/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex08 {
    public static void main (String args[]) {
    
        double valorDeposito, valorCorrigido;
        
        valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Dep�sito: "));
        valorCorrigido = valorDeposito + (valorDeposito * (1.3/100));
        
        System.out.println ("O valor do Dep�sito ap�s 1 m�s de aplica��o, ser� de " + (valorCorrigido));
   }
}
