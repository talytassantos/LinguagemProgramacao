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
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
        
        if (A == B){
            System.out.println ("Os dois números são iguais. Informe números diferentes!");            
        } else if (A < B){
            System.out.println("O menor número é: " + A);  
            System.out.println("O maior número é: " + B);   
        } else {
            System.out.println("O menor número é: " + B);  
            System.out.println("O maior número é: " + A);
        }
    }
}
