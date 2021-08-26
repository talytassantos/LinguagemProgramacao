/* 
Objetivo    : Receba a hora de início e de final de um jogo (HH,MM) 
              sabendo que o tempo máximo é de 24 horas e pode começar num dia e
              terminar noutro.
Programador : Talyta S. Santos
Data        : 13/02/2020
*/
package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex25 {
    public static void main (String args[]) {
        int hr_inicio, min_inicio, hr_fim, min_fim, hr_total, min_total;
                
        hr_inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora inicial do jogo: "));
                
        if (hr_inicio > 23 || hr_inicio < 0) {
            JOptionPane.showMessageDialog(null,"Erro. Hora inválida! \nHora não deve ser maior que 23 hrs");
            System.exit(0);
        } 
      
        min_inicio = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto inicial do jogo: "));
       
        if (min_inicio > 59 || min_inicio < 0)
        {
            JOptionPane.showMessageDialog(null,"Erro. Minuto inválido! \nMinutos não devem ser maior que 59 min.");
            System.exit(0);
        }
      
        hr_fim = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora final do jogo: "));
        
        if (hr_fim > 24 || hr_fim < 0) {
            JOptionPane.showMessageDialog(null,"Erro. Hora inválida! \nHora não deve ser maior que 23 hrs");
            System.exit(0);
        }
      
        min_fim = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto final do jogo: "));
       
        if (min_fim > 59 || min_fim < 0) {
            JOptionPane.showMessageDialog(null,"Erro. Minuto inválido! \nMinutos não devem ser maior que 59 min.");
            System.exit(0);
        }
        
        if (hr_fim >= hr_inicio) {
            hr_total = (hr_fim - hr_inicio);
        } else {
            hr_total = ((hr_fim + 24) - hr_inicio);
        }
        
        if (min_fim >= min_inicio) {
            min_total = (min_fim - min_inicio); 
        } else {
            min_total = ((min_fim + 59) - min_inicio);
        } 
        
        JOptionPane.showMessageDialog(null,"A duração do jogo foi de " + hr_total + " horas e " + min_total + "  minutos " );
        System.exit(0);
    }
}
