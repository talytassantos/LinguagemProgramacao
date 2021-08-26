package estruturaDeRepeticao;

/*
Objetivo    : Receba 100 números inteiros. 
              Verifique e mostre o maior e o menor valor. 
Programador : Talyta S. Santos
Data        : 12/03/2020
 */
import java.util.Random;

public class Lt01_Ex38 {
    public static void main (String args[]){
        int num=0, maior=0, menor=100;
        
        Random gerador = new Random();
        
        for (int i =0;i<100;i++){
            
            num = gerador.nextInt(1000);
            System.out.print(num + " - ");
           
            if ( num > maior){
                maior = num;
            } else if (num < menor) {
                menor = num;
            }
        }  
        System.out.println("\nO maior número foi: " + maior);
        System.out.println("O menor número foi: " + menor);
    }
}
