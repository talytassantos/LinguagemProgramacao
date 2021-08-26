/* 
Objetivo    : Receba um valor inteiro. 
              Verifique e mostre se � divis�vel por 2 e 3.
Programador : Talyta S. Santos
Data        : 13/02/2020
*/
package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex24 {
    public static void main (String Args[]) {
        int A;
        double resto1, resto2;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
        
        resto1 = A % 2;
        resto2 = A % 3;
        
        if (resto1 == 0 && resto2 == 0){
            System.out.println(" O n�mero � divisivel por 2 e por 3!");
        } else if (resto1 == 0 && resto2 != 0) {
            System.out.println(" O n�mero � divisivel apenas por 2!");
        } else if (resto1 != 0 && resto2 == 0) {
            System.out.println(" O n�mero � divisivel apenas por 3!");
        } else {
            System.out.println(" O n�mero n�o � divis�vel nem por 2 e nem por 3!");
        }
    }
}
