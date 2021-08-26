package sequencial;

/* 
Objetivo    : Coletar o valor do lado de um quadrado, calcular sua área 
            e apresentar o resultado.
Programador : Talyta S. Santos
Data        : 06/02/2020
*/

import javax.swing.JOptionPane;

public class Lt01_Ex01 { 
    public static void main (String args[]) {
        int a, l;
        
        l = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: "));
        
        a = l * l;
        
        System.out.println ("A area do quadrado é : " + a);     
    } // fim do void main   
}//fim da classe