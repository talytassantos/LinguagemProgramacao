package estruturaDeRepeticao;

/*
Objetivo    : Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
Programador : Talyta S. Santos
Data        : 12/03/2020
 */

import javax.swing.JOptionPane;
        
public class Lt01_Ex36 {
    public static void main (String args []){
 
        int x, fat, b=1;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        
        System.out.print(b);
        
        fat = x;
       
        if (x!=0){
            for (int n = x ; n > 1; n--){
                fat = fat * (n-1);
            
                System.out.print (" + "+b+"/"+ fat);
            }
        }
    } 
} 