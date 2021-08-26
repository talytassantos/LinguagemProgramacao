/* 
Objetivo    : Receba 3 coeficientes A, B, e C de uma equação de 2o grau da 
              fórmula Ax²+Bx+C=0. Verifique e mostre a existência de raízes 
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
            System.out.println ("Não existem raízes reais!");
        } else if (delta > 0) {
            x1 = ((-B + B) / 2 * A);
            x2 = ((-B - B) / 2 * A);
            
            System.out.println("A raíz real x1 é: " + x1);
            System.out.println("A raíz real x2 é: " + x2);   
        } else if (delta == 0) {
            x1 = ((-B + raiz) / 2 * A);
            System.out.println("A raíz real x1 é: " + x1);
        }      
    }
}