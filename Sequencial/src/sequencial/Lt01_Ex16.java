package sequencial;

/*
Objetivo    : Receba a quantidade de horas trabalhadas, o valor por hora, 
              o percentual de desconto e o numero de descendentes.
              Calcule o salario que ser�o as horas trabalhadas x o valor por hora. 
              Calcule o sal�rio liquido (Sal�rio Bruto - desconto). 
              A cada dependente ser� acrescido R$100 no sal�rio liquido.
              Exiba o sal�rio a receber.
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
        numdep = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de descendentes: "));
                    
        salbruto = (hrst * vlrhr); 
        salliq = (salbruto - (salbruto * desc) + (desc * 100)); 
        
        System.out.println("O sal�rio bruto a receber �: " + salbruto);
        System.out.println("O sal�rio a receber �: " + salliq);
    }
}
