package sequencial;

/*
Objetivo    : Receba o ano de nascimento e o ano atual. 
              Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
Programador : Talyta S. Santos
Data        : 08/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex12 {
    public static void main (String args[]) {
        int anoNasc, anoAtual, idade, idade17;
                      
        anoNasc  = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento: "));
        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
        
        idade = (anoAtual - anoNasc);
        idade17 = idade + 17;
        
        System.out.println("A idade é: " + idade);
        System.out.println("A idade daqui a 17 será de: " + idade17);
    }
}
