/* 
Objetivo    : Receba o número de voltas, a extensão do circuito (em metros) e 
              o tempo de duração (minutos). Calcule e mostre a velocidade média 
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
        
        num_voltas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de voltas: "));
        ext_circuito = Double.parseDouble(JOptionPane.showInputDialog("Informe a extensão do circuito (em metros): "));
        duracao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de duração (em minutos): "));
        
        esp = (num_voltas * ext_circuito); 
        vm_kmh = (esp / duracao);
        vm_kmh = (vm_kmh * 0.06);
        
        JOptionPane.showMessageDialog(null, "A velocidade média em km/h é de: " + vm_kmh * 0.06);        
    }
}
