/* 
Objetivo    : Receba 3 valores obrigatoriamente em ordem crescente e 
              um 4� valor n�o necessariamente em ordem. 
              Mostre os 4 n�meros em ordem crescente.
Programador : Talyta S. Santos
Data        : 13/02/2020
*/
package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex23 {
    public static void main (String args []) {
        int a = 0, b = 0, c = 0, d = 0;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1o n�mero: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2o n�mero: "));
        
        if (a >= b){
            JOptionPane.showMessageDialog(null,"Os n�meros n�o podem ser iguais."
                    + "O 2o n�mero deve ser maior que o primeiro!"); 
            System.exit(0);
        } else {
            c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3o n�mero: "));
        } if (b >= c) {
            JOptionPane.showMessageDialog(null,"Os n�meros n�o podem ser iguais."
                    + "O 3o n�mero deve ser maior que o segundo!"); 
            System.exit(0);
        } else {
            d = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4o n�mero: "));
        } if (d >= c ) {
            System.out.println ("Os n�meros em ordem s�o: " + a + " " + b + " " + c + " " + d);
        } else if (d <= a) {
            System.out.println("Os n�meros em ordem s�o: " + d + " " + a + " " + b + " " + c);
        } else if (d <= c) {
            System.out.println("Os n�meros em ordem s�o: " + a + " " + b + " " + d + " " + c);
        } else if (d <= b) {
            System.out.println("Os n�meros em ordem s�o: " + a + " " + d + " " + b + " " + c);
        }
    }
}
