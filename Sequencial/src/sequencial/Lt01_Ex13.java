package sequencial;

/*
Objetivo    : Receba a quantidade de alimento em quilos. 
              Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia
Programador : Talyta S. Santos
Data        : 08/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex13 {
    public static void main(String args []) {
        double qtd_kg, dias;
        qtd_kg = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de alimentos em kilos: "));
        
        dias = (qtd_kg / 0.05) ;
        
        System.out.println("Os alimentos durarão " + dias + " dias.");
    }
}
