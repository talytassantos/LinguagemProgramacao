package estruturaDeRepeticao;

/*
Objetivo    : Calcule e mostre o quadrado dos números entre 10 e 150.
Programador : Talyta S. Santos
Data        : 20/02/2020
 */

public class Lt01_Ex31 {
    public static void main (String args[]) {
        int n = 10, quad;
        
        while (n>=10 && n<=150){
            quad = (n*n);
            System.out.println("O quadrado de " + n + " é: " + quad);
            n++;
        } 
        System.exit(0);
    }   
}
