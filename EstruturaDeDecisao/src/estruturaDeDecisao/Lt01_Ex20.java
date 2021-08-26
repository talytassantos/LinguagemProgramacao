/* 
Objetivo    : Receba 3 coeficientes A, B, e C de uma equa��o de 2o grau da 
              f�rmula Ax�+Bx+C=0. Verifique e mostre a exist�ncia de ra�zes 
              reais e se caso exista. Calcular e mostrar.
Programador : Talyta S. Santos
Data        : 13/02/2020
*/
package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex20 {
    public static void main (String args[]) {
        double A, B, C, delta, x1, x2, raiz ;
            
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite A: "));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite B: "));
        C = Double.parseDouble(JOptionPane.showInputDialog("Digite C: "));
        
        delta = ((B * B) - (4 * A * C));
        raiz = Math.sqrt(delta);
        
        if (delta < 0) {
            System.out.println ("N�o existem ra�zes reais!");
        } else if (delta > 0) {
            x1 = ((-B + B) / 2 * A);
            x2 = ((-B - B) / 2 * A);
            
            System.out.println("A ra�z real x1 �: " + x1);
            System.out.println("A ra�z real x2 �: " + x2);   
        } else if (delta == 0) {
            x1 = ((-B + raiz) / 2 * A);
            System.out.println("A ra�z real x1 �: " + x1);
        }      
    }
}