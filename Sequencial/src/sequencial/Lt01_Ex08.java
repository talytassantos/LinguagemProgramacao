package sequencial;

/* 
Objetivo    : Receba o valor de um depósito em poupança. 
              Calcule e mostre o valor após 1 mês de aplicação 
              sabendo que rende 1,3% a. m.    
Programador : Talyta S. Santos
Data        : 07/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex08 {
    public static void main (String args[]) {
    
        double valorDeposito, valorCorrigido;
        
        valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do Depósito: "));
        valorCorrigido = valorDeposito + (valorDeposito * (1.3/100));
        
        System.out.println ("O valor do Depósito após 1 mês de aplicação, será de " + (valorCorrigido));
   }
}
