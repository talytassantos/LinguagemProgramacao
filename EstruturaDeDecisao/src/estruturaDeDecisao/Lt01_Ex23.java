/* 
Objetivo    : Receba 3 valores obrigatoriamente em ordem crescente e 
              um 4º valor não necessariamente em ordem. 
              Mostre os 4 números em ordem crescente.
Programador : Talyta S. Santos
Data        : 13/02/2020
*/
package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex23 {
    public static void main (String args []) {
        int a = 0, b = 0, c = 0, d = 0;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1o número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2o número: "));
        
        if (a >= b){
            JOptionPane.showMessageDialog(null,"Os números não podem ser iguais."
                    + "O 2o número deve ser maior que o primeiro!"); 
            System.exit(0);
        } else {
            c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3o número: "));
        } if (b >= c) {
            JOptionPane.showMessageDialog(null,"Os números não podem ser iguais."
                    + "O 3o número deve ser maior que o segundo!"); 
            System.exit(0);
        } else {
            d = Integer.parseInt(JOptionPane.showInputDialog("Digite o 4o número: "));
        } if (d >= c ) {
            System.out.println ("Os números em ordem são: " + a + " " + b + " " + c + " " + d);
        } else if (d <= a) {
            System.out.println("Os números em ordem são: " + d + " " + a + " " + b + " " + c);
        } else if (d <= c) {
            System.out.println("Os números em ordem são: " + a + " " + b + " " + d + " " + c);
        } else if (d <= b) {
            System.out.println("Os números em ordem são: " + a + " " + d + " " + b + " " + c);
        }
    }
}
