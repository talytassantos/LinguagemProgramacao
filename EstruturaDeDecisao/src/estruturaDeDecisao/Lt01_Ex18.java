/* 
Objetivo    : Receba dois valores inteiros. Calcule e mostre o resultado da 
              diferença do maior pelo menor valor.
Programador : Talyta S. Santos
Data        : 13/02/2020
*/
package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex18 {
    public static void main (String args []) {
        int A, B, Dif;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: ")); 
        B = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número: ")); 
        
        if (A > B) {
          Dif = (A - B);
        } else {
          Dif = (B - A);
        }
        System.out.println("A diferença do maior pelo menor valor é: " + Dif);
    }
}