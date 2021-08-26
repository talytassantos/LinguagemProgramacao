/* 
Objetivo    : Receba o n�mero de voltas, a extens�o do circuito (em metros) e 
              o tempo de dura��o (minutos). Calcule e mostre a velocidade m�dia 
              em km/h. 
Programador : Talyta S. Santos
Data        : 14/02/2020
*/
package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex27 {
    public static void main (String args []) {
        int num_voltas, duracao;
        double ext_circuito, vm_kmh, esp;
        
        num_voltas = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de voltas: "));
        ext_circuito = Double.parseDouble(JOptionPane.showInputDialog("Informe a extens�o do circuito (em metros): "));
        duracao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de dura��o (em minutos): "));
        
        esp = (num_voltas * ext_circuito); 
        vm_kmh = (esp / duracao);
        vm_kmh = (vm_kmh * 0.06);
        
        JOptionPane.showMessageDialog(null, "A velocidade m�dia em km/h � de: " + vm_kmh * 0.06);        
    }
}
