package sequencial;

/*
Objetivo    : Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
Programador : Talyta S. Santos
Data        : 08/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex15 {
    public static void main (String args[]) {
        double co, ca, h, n;
        
        co = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1o cateto do triângulo: "));
        ca = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2o cateto do trinângulo: "));
           
        n = ((co * co) + (ca * ca));        
        h = Math.sqrt(n);
        
        System.out.println("A hipotenusa é" +h);
    }   
}
