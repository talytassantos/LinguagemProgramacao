package funcao;

/*
                        Exercicio de Função
Objetivo    : Calcule e mostre o quadrado dos números entre 10 e 150.
Programador : Talyta S. Santos
Data        : 27/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_ModFun31 {
    public static void main (String args[]){
    
    int n = 10;
    JOptionPane.showMessageDialog(null,"A relação dos quadrados entre 10 e 150 é mostrado no console.\n"
            + "O quadrado de 150 é "+ FuncaoQuad(n));      
    }
    
    static int FuncaoQuad (int num) {
    int quad = 0;
    
        while (num>=10 && num<=150){
            quad = (num * num) ;
            System.out.println("O quadrado de " + num + " é: " +quad);
            num ++;
        }
    return quad;
    }
}
