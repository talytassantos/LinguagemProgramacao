/* 
Objetivo    : Receba 2 números inteiros. 
              Verifique e mostre se o maior número é múltiplo do menor
Programador : Talyta S. Santos
Data        : 13/02/2020
*/
package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex26 {
    public static void main (String args[]) {
        int n1, n2, maior = 0, menor = 0;
        double resto;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
                
        if (n1 == n2) {
            JOptionPane.showMessageDialog(null,"Erro. \nInforme números diferentes!");
            System.exit(0);
        } else if (n1 > n2) {
            maior = n1;
            menor = n2;
        } else {
            maior = n2;
            menor = n1;
        }
        resto = maior % menor;
        
        if (resto == 0) {
            JOptionPane.showMessageDialog(null,"O número " + maior + " é múltiplo de " + menor);
        } else {
            JOptionPane.showMessageDialog(null,"O número " + maior + "NÃO é multiplo de " + menor);
        }        
    }
}
