package sequencial;

/*
Objetivo    : Receba a quantidade de horas trabalhadas, o valor por hora, 
              o percentual de desconto e o numero de descendentes.
              Calcule o salario que serão as horas trabalhadas x o valor por hora. 
              Calcule o salário liquido (Salário Bruto - desconto). 
              A cada dependente será acrescido R$100 no salário liquido.
              Exiba o salário a receber.
Programador : Talyta S. Santos
Data        : 08/02/2020
 */

import javax.swing.JOptionPane;
        
public class Lt01_Ex16 {
    public static void main (String args []) {
        double hrst, vlrhr, desc, salbruto, salliq;
        int numdep;
                
        hrst = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas: "));
        vlrhr = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor ganho por hora: "));
        desc = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de desconto: "));      
        numdep = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de descendentes: "));
                    
        salbruto = (hrst * vlrhr); 
        salliq = (salbruto - (salbruto * desc) + (desc * 100)); 
        
        System.out.println("O salário bruto a receber é: " + salbruto);
        System.out.println("O salário a receber é: " + salliq);
    }
}
