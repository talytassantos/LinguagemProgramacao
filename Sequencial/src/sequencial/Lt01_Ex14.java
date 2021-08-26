package sequencial;

/*
Objetivo    : Receba 2ângulosde um triângulo. Calcule e mostre o valor do 3º ângulo.
Programador : Talyta S. Santos
Data        : 08/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex14 {
    public static void main (String args []) {
        double ang1, ang2, ang3;
        
        ang1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 1° angulo do triangulo "));
        ang2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o 2° angulo do triangulo "));
        
        ang3 = (180 - ang1 - ang2);

        System.out.println("O valor do 3° angulo do triangulo é " + ang3);
    }
}
