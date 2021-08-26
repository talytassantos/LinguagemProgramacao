package projetoClasse;

/*
Data: 28/05/2020
Programadora: Talyta S. Santos
*/

import javax.swing.*;

public class Principal {
   
    public static void main (String args []) {        
        Metodos m = new Metodos ();
                
        double v [] = new double [5];
        double a [][] = new double [5][5];
        
        int opc = 0;       
        
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Executar exercicio da aula 1 "
                    + "\n2 - Executar exercicio da aula 2  \n9 - Finalizar"));
            switch (opc) {
                
                case 1: m.CarregaExercicio1(v);
                        break;
                case 2: v = m.CarregaExercicio2(a);
                        break;
                case 9: JOptionPane.showMessageDialog(null,"Finalizar");
                        break;
                default: JOptionPane.showMessageDialog(null,"Opção Inválida");              
            }           
        } while (opc != 9);
    }  
}