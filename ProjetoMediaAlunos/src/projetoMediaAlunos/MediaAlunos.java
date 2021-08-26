package projetoMediaAlunos;

import javax.swing.*;

public class MediaAlunos {
    public static void main (String args[]){
        
        int i,j;
        double mediaP1 = 0, mediaP2 = 0;
        double[][] notasAlunos = new double [3][2];
        
        for ( i = 0 ; i < notasAlunos.length ; i++){
            
            double [] mediaAlunos = new double [3];
                    
            for ( j = 0 ; j < notasAlunos[i].length ; j++){
                
                notasAlunos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " +(j+1)+ " do aluno " +(i+1)));
                mediaAlunos[i] = mediaAlunos [i] + notasAlunos[i][j];            
            }
            mediaAlunos [i] = (mediaAlunos[i]/2);
            System.out.println("A média do " +(i+1)+ " aluno é: " + mediaAlunos[i]);
            
            mediaP1 = mediaP1 + notasAlunos [i][0];         
            mediaP2 = mediaP2 + notasAlunos [i][1];
        
        }
       System.out.println("A Media da P1 é " + (mediaP1/notasAlunos.length));
       System.out.println("A Media da P2 é " + (mediaP2/notasAlunos.length));   
    }   
}