package sequencial;

/*
Objetivo    : Calcule a quantidade de litros gastos em uma viagem, sabendo que 
              o automovel faz 12 km/l. Receber o tempo de percurso e a 
              velocidade média.
Programador : Talyta S. Santos
Data        : 08/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex17 {
    public static void main (String args []) {
      double tmp, vm, d, l;
     
      tmp = Double.parseDouble(JOptionPane.showInputDialog("Informe o tempo do percurso: "));
      vm = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média: "));
      
      d = (tmp * vm);  
      l = (d / 12); 
      
      System.out.println("A quantidade de litros gastos será de: " + l); 
    }    
}
