/* 
Objetivo    : Receba o tipo de investimento (1 = poupança e 2 = renda fixa) 
              e o valor do investimento. Calcule e mostre o valor corrigido em 
              30 dias, sabendo que a poupança rende = 3% e a renda fixa = 5%. 
              Demais tipos não serão considerados. 
Programador : Talyta S. Santos
Data        : 14/02/2020
*/
package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex29 {
    public static void main (String args []) {
        int tp_invest;
        double vlr_invest, vlr_corrigido;
        
        tp_invest = Integer.parseInt(JOptionPane.showInputDialog("Qual "
                + "investimento deseja realizar? \nDigite \n1 para POUPANÇA \n2 para RENDA FIXA"));
        
        if (tp_invest != 1 && tp_invest != 2) {
            JOptionPane.showMessageDialog(null, "           ERRO\nOPÇÃO INVÁLIDA");
            System.exit(0);
        } else if (tp_invest == 1) {
            vlr_invest = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do investimento: "));
            vlr_corrigido = (vlr_invest * 1.03);
            JOptionPane.showMessageDialog(null,"Para POUPANÇA\n "
                    + "O valor investido corrigido daqui à 30 dias será de: " + vlr_corrigido);
            System.exit(0);
        } else {
            vlr_invest = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do investimento: "));
            vlr_corrigido = (vlr_invest * 1.05);
            JOptionPane.showMessageDialog(null,"Para RENDA FIXA\n"
                    + "O valor investido corrigido daqui à 30 dias será de: " + vlr_corrigido);
            System.exit(0);
        }
    }
}