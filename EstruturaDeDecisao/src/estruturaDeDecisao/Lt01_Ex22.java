/* 
Objetivo    : Receba 2 valores inteiros e diferentes. 
              Mostre seus valores em ordem crescente.
Programador : Talyta S. Santos
Data        : 13/02/2020
*/
package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex22 {
    public static void main (String Args []) {
        int A, B ;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero inteiro: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero inteiro: "));
        
        if (A == B){
            System.out.println ("Os dois n�meros s�o iguais. Informe n�meros diferentes!");            
        } else if (A < B){
            System.out.println("O menor n�mero �: " + A);  
            System.out.println("O maior n�mero �: " + B);   
        } else {
            System.out.println("O menor n�mero �: " + B);  
            System.out.println("O maior n�mero �: " + A);
        }
    }
}
