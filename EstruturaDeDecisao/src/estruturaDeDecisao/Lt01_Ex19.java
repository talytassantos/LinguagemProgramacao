/* 
Objetivo    : Receba dois valores reais. Calcule e mostre o maior deles.
Programador : Talyta S. Santos
Data        : 13/02/2020
*/
package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex19 {
    public static void main (String args []) {
        double A, B, maior = 0; 
        
        A = Double.parseDouble(JOptionPane.showInputDialog("Informe um número real: ")) ; 
        B = Double.parseDouble(JOptionPane.showInputDialog("Informe outro número real: ")) ;
        
        if (A > B){
            maior = A;           
        } else if (B > A){ 
            maior = B;
        } else if (A == B){
            System.out.println ("Os dois números são iguais!");
        }
        System.out.println("O maior valor é: " + maior);
    }
}
