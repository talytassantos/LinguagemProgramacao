package projetoLoja;

/*
Data: 07/05/2020
Programadora: Talyta S. Santos
*/

import javax.swing.*;

public class Ex1_loja {
    public static void main (String args[]){
        int i;
        double tot_geral=0, tot_vend, comissao = 0;
        double qtd[ ] = new double [5];
        double preco[ ] = new double [5];

        for ( i = 0 ; i <= 4 ; i++){
            qtd [i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a"
                    + " quantidade vendida do " +(i+1)+ "o produto: "));
            preco [i] = Double.parseDouble(JOptionPane.showInputDialog("Digite "
                    + "o preço do " +(i+1)+ "o produto: "));
        }
        for ( i = 0 ; i <= 4 ; i++){
            tot_vend = qtd[i] * preco[i];
            System.out.println ("Quantidade vendida do " +(i+1)+ "o produto:"
                    +qtd[i]+ " Valor do " +(i+1)+"o produto: " +preco[i]+ 
                    " - Total geral da venda: " +tot_vend );
            tot_geral = tot_geral + tot_vend;
        }
        comissao = (tot_geral * 0.05);
        System.out.println ("Valor total das vendas: " +tot_geral+ 
                " Valor da comissão: " + comissao);
    }    
}