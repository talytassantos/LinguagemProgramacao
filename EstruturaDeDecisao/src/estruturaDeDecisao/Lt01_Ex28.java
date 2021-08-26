/* 
Objetivo    : Receba o preço atual e a venda mensal de um produto. Calcule e 
              mostre o novo preço sabendo que:
              Venda Mensal      | Preço Atual   | Preço | Novo
              < 500             | < 30          | +     | 10%
              >= 500 e < 1000   | >= 30 e < 80  | +     | 15%
              >= 1000           | >= 80         | -     | 5%
Obs.: Para outras condições, o preço será igua  l ao preço atual.
Programador : Talyta S. Santos
Data        : 14/02/2020
*/

package estruturaDeDecisao;
import javax.swing.JOptionPane;

public class Lt01_Ex28 {
    public static void main (String args []) {
        double preco_atual, venda_mensal, novo_preco;
        
        preco_atual = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço atual: "));
        venda_mensal = Double.parseDouble(JOptionPane.showInputDialog("Informe a venda mensal: "));
        
        if (venda_mensal < 500 && preco_atual < 30) {
            novo_preco = (preco_atual * 1.1);
            JOptionPane.showMessageDialog(null, "O novo preço do produto (reajustado em 10%) é: R$ " + novo_preco);
            System.exit(0);
        } else if ((venda_mensal >= 500 && venda_mensal < 1000) && (preco_atual >= 30 && preco_atual < 80)) {
            novo_preco = (preco_atual * 1.15);
            JOptionPane.showMessageDialog(null, "O novo preço do produto (reajustado em 15%) é: R$ " + novo_preco);
            System.exit(0);
        } else if (venda_mensal >= 1000 && preco_atual >= 80) {
            novo_preco = (preco_atual - (preco_atual * 0.05));
            JOptionPane.showMessageDialog(null, "O novo preço do produto (reajustado em -5%) é: R$ " + novo_preco);
            System.exit(0);
        } else {
          JOptionPane.showMessageDialog(null, "O preço do produto permanece o mesmo, que é: R$" + preco_atual);  
        }
    }
}
