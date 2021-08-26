package projetoClasse;

/*
Data: 28/05/2020
Programadora: Talyta S. Santos
*/

import javax.swing.*;

public class Metodos {
    
    public void CarregaExercicio1 (double v[]){
        
        int i;
        int qtd[ ] = new int [5];
        double preco[ ] = new double [5];
                
        for ( i = 0 ; i <= 4 ; i++){            
            qtd [i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade vendida do " +(i+1)+ "o produto: "));
            preco [i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do " +(i+1)+ "o produto: "));       
        }
        
        double tot_geral = 0, tot_vend = 0, comissao = 0;
       
        for ( i = 0 ; i <= 4 ; i++){           
            tot_vend = qtd[i] * preco[i];
            System.out.println ("Quantidade vendida do " +(i+1)+ "o produto:" +qtd[i]+ " Valor do " +(i+1)+"o produto: " +preco[i]+ " - Total geral da venda: " +tot_vend );
            tot_geral = tot_geral + tot_vend;
        }
        
        comissao = (tot_geral * 0.05);
        System.out.println ("Valor total das vendas: " +tot_geral+ " Valor da comissão: " + comissao);
    }
    
    public double [] CarregaExercicio2 (double a [ ][ ]) { //Verificar se erro está nessa linha pois as duas pontas contem [][]
        
        int i,j;
        
        double [] mediaAlunos = new double [3];
        double [][] notasAlunos = new double [3][2];
        
        for ( i = 0 ; i < notasAlunos.length ; i++){         
            for ( j = 0 ; j < notasAlunos[i].length ; j++){       
                notasAlunos[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " +(j+1)+ " do aluno " +(i+1)));
                mediaAlunos[i] = mediaAlunos [i] + notasAlunos[i][j];              
            }                           
            mediaAlunos [i] = (mediaAlunos[i]/2);
            //JOptionPane.showMessageDialog(null,"A média do " +(i+1)+ " aluno é: ");
        }
        return mediaAlunos; 
    }
}