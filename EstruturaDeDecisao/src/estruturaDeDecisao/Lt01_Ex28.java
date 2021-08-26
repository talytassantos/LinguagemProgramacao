/* 
Objetivo    : Receba o pre�o atual e a venda mensal de um produto. Calcule e 
              mostre o novo pre�o sabendo que:
              Venda Mensal      | Pre�o Atual   | Pre�o | Novo
              < 500             | < 30          | +     | 10%
              >= 500 e < 1000   | >= 30 e < 80  | +     | 15%
              >= 1000           | >= 80         | -     | 5%
Obs.: Para outras condi��es, o pre�o ser� igua  l ao pre�o atual.
Programador : Talyta S. Santos
Data        : 14/02/2020
*/

package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex28 {
    public static void main (String args []) {
        double preco_atual, venda_mensal, novo_preco;
        
        preco_atual = Double.parseDouble(JOptionPane.showInputDialog("Informe o pre�o atual: "));
        venda_mensal = Double.parseDouble(JOptionPane.showInputDialog("Informe a venda mensal: "));
        
        if (venda_mensal < 500 && preco_atual < 30) {
            novo_preco = (preco_atual * 1.1);
            JOptionPane.showMessageDialog(null, "O novo pre�o do produto (reajustado em 10%) �: R$ " + novo_preco);
            System.exit(0);
        } else if ((venda_mensal >= 500 && venda_mensal < 1000) && (preco_atual >= 30 && preco_atual < 80)) {
            novo_preco = (preco_atual * 1.15);
            JOptionPane.showMessageDialog(null, "O novo pre�o do produto (reajustado em 15%) �: R$ " + novo_preco);
            System.exit(0);
        } else if (venda_mensal >= 1000 && preco_atual >= 80) {
            novo_preco = (preco_atual - (preco_atual * 0.05));
            JOptionPane.showMessageDialog(null, "O novo pre�o do produto (reajustado em -5%) �: R$ " + novo_preco);
            System.exit(0);
        } else {
          JOptionPane.showMessageDialog(null, "O pre�o do produto permanece o mesmo, que �: R$" + preco_atual);  
        }
    }
}
