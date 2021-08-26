package funcao;

/*
                        Exercicio de Fun��o
Objetivo    : Calcule e mostre o quadrado dos n�meros entre 10 e 150.
Programador : Talyta S. Santos
Data        : 27/02/2020
 */

import javax.swing.JOptionPane;

public class Lt01_ModFun31 {
    public static void main (String args[]){
    
    int n = 10;
    JOptionPane.showMessageDialog(null,"A rela��o dos quadrados entre 10 e 150 � mostrado no console.\n"
            + "O quadrado de 150 � "+ FuncaoQuad(n));      
    }
    
    static int FuncaoQuad (int num) {
    int quad = 0;
    
        while (num>=10 && num<=150){
            quad = (num * num) ;
            System.out.println("O quadrado de " + num + " �: " +quad);
            num ++;
        }
    return quad;
    }
}
