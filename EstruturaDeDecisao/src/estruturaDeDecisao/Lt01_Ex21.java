/* 
Objetivo    : Receba 4 notas bimestrais de um aluno. Calcule e mostre a média
              aritmetica. Mostre a mensagem de acordo com a média. 
              a) Se a média for >= 6,0 exibir "Aprovado" 
              b) Se a média for >= 3,0 ou <6,0 exibir "Exame" 
              c) Se a média for < 3,0 "Retido"
Programador : Talyta S. Santos
Data        : 13/02/2020
*/
package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex21 {
    public static void main (String args[]) {
        double n1, n2, n3, n4, media;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1a nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 2a nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 3a nota: "));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 4a nota: "));
        
        media = (n1 + n2 + n3 + n4) / 4 ;
        
        if (media >= 6){
            System.out.println("Aprovado!");
        } else if (media >= 3 || media < 6){ 
            System.out.println("Exame!");
        } else {
            System.out.println("Retido!");
        }       
    }
}