package projetoSistemaVotacao;

import java.io.*;
import java.util.*;

public class Votacao2016 {
    
    Random random = new Random ();
    
    public Votacao [] FCadastraVotacao (Votacao [] votacao){
    
        for (int i = 0; i<votacao.length; i++){
            votacao[i] = new Votacao();
        }
        
        for (int i = 0; i<votacao.length; i++){
                       
            votacao[i].numsecao = random.nextInt(10);
            System.out.println(votacao[i].numcandidato);
            
            votacao[i].numcandidato = random.nextInt(300);
            System.out.print(votacao[i].numsecao + " ");
        }      
        return votacao;
    }
    
    public Votacao [] FClassificaSecao (Votacao [] votacao){
        
        boolean troca = true;
        
        while (troca){
            troca = false;
            for (int i = 0; i<votacao.length-1 ; i++){
                if (votacao[i].numsecao > votacao [i+1].numsecao){
                    int aux = votacao[i].numsecao;
                    votacao[i].numsecao = votacao [i+1].numsecao;
                    votacao[i+1].numsecao = aux;
                    troca = true;
                }
            }
        }
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO");
        return votacao;
    }
    
    public Votacao [] FGravaVotacao (Votacao [] votacao) throws IOException {
        
        int i;
        String fileName = "ArquivoVotacao.txt";
        BufferedWriter gravar = new BufferedWriter (new FileWriter (fileName));
               
        for (i=0 ; i<100 ; i++){
            
            gravar.write(Integer.toString(votacao[i].numcandidato));
            gravar.write(" , ");
            gravar.write(Integer.toString(votacao[i].numsecao));
            gravar.newLine();
        }
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO");
        gravar.close();
        return votacao;        
    }   
}