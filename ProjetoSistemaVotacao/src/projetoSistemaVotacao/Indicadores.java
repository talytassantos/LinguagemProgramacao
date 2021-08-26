package projetoSistemaVotacao;

import javax.swing.*;

public class Indicadores {
    
    void CalcularEleitores (Votacao [] votacao, int [][] secoes){
        
        int secao = 0, votos = 1;
        
        for (int i=0; i<votacao.length; i++){
            if(i+1 >= votacao.length){
                if (votacao[i-1].numsecao == votacao[i].numsecao){
                    System.out.println("VOTOS  |" + String.format("%02d", (votos+1)) + "|");
                    secoes[1][secao] = votos +1;
                    votos = 1;
                    
                    System.out.println("SEÇÃO  |" + String.format("%02d",votacao[i].numsecao) + "|");
                    secoes[0][secao] = votacao[i].numsecao; 
                }
            } else if (votacao[i].numsecao != votacao[i+1].numsecao){
                System.out.println("VOTOS  |" + String.format("%02d", (votos)) + "|");
                secoes[1][secao] = votos;
                votos = 1;
                
                System.out.println("SEÇÃO  |" + String.format("%02d",votacao[i].numsecao) + "|");
                secoes[0][secao] = votacao[i].numsecao;
                
                secao++;
                secoes[1][secao] = 1;
            } else {
                votos++;
            }
        }
        JOptionPane.showMessageDialog(null, " SEÇÃO "+ "\n" + " VOTOS");
        System.out.println("SEÇÃO");
        System.out.println("VOTOS");
    }
    
    void ClassificarSecao (Votacao [] votacao, int [][] secoes){
        
        int maior = secoes [1][0];
        int menor = secoes [1][0];
        
        String Maior = "Seção com maior número de votos: " + secoes[0][0] 
                + "(" + secoes [1][0] + ")";
        String Menor = "Seção com menor número de votos: " + secoes[0][0] 
                + "(" + secoes [1][0] + ")";
        
        for (int i=1; i <secoes[i].length; i++){
            if(secoes[1][i] <= menor){
                menor = secoes[1][i];
                Menor = "Seção com menor número de votos: " + secoes[0][i] 
                + "(" + menor + ")";
            }
            if (secoes [1][i] >= maior){
                maior = secoes[1][i];
                Maior = "Seção com maior número de votos: " + secoes[0][i] 
                + "(" + maior + ")";
            }
        }
        JOptionPane.showMessageDialog(null, Maior +"\n" + Menor);     
    }
    
    void votosPorCandidato (int [] classificaCandidato, int [][] candidatos){
        
        int candidato = 0, votos =1;
        String msgCandidato = "CANDIDATO:", msgVoto = "NUM VOTOS:";
        
        for (int i=0; i<classificaCandidato.length; i++){
            if(i+1>=classificaCandidato.length){
                if(classificaCandidato[i-1] == classificaCandidato[i]){
                    msgVoto += " |" + String.format("%03d",(votos+1)) + "|";
                    candidatos[1][candidato] = votos+1;
                    votos = 1;

                    msgCandidato += " |" + String.format("%03d",classificaCandidato[i]) + "|";
                    candidatos[0][candidato] = classificaCandidato[i];

                }
            }else if(classificaCandidato[i] != classificaCandidato[i+1]){
                msgVoto += " |" + String.format("%03d",votos) + "|";
                candidatos[1][candidato] = votos;
                votos = 1;

                msgCandidato += " |" + String.format("%03d",classificaCandidato[i]) + "|";
                candidatos[0][candidato] = classificaCandidato[i];

                candidato++;

                candidatos[1][candidato] = 1;
            }else{
                votos++;
            }    
        }
        JOptionPane.showMessageDialog(null,msgCandidato + "\n" + msgVoto);
        System.out.println(msgCandidato);
        System.out.println(msgVoto);
    }

    void rankearCandidatos(int[] classificaCandidato, int[][] candidatos){
        
        boolean troca = true;
        int auxVoto, auxCandidato;
        String msgCandidato = "CANDIDATO:", msgVoto = "NUM VOTOS:";

        while (troca){
            troca = false;
            for(int i = candidatos[0].length-1; i>0; i--){
                if(candidatos[1][i]>candidatos[1][i-1]){

                    auxCandidato = candidatos[0][i];
                    auxVoto = candidatos[1][i];

                    candidatos[0][i] = candidatos[0][i-1];
                    candidatos[1][i] = candidatos[1][i-1];

                    candidatos[0][i-1] = auxCandidato;
                    candidatos[1][i-1] = auxVoto;

                    troca = true;
                }
            }
        }
        System.out.println();

        for(int y=0; y<=10;y++){
            msgCandidato += " [" + String.format("%03d", candidatos[0][y])+ "]";
        }
        for(int y=0; y<=10;y++){
            msgVoto += " [" + String.format("%03d", candidatos[1][y])+ "]";
        }

        for(int x=0;x<candidatos.length; x++){
            for(int y=0; y<=10;y++){
                System.out.print(" [" + String.format("%03d", candidatos[x][y])+ "]");
            }
            System.out.println();
        }
        JOptionPane.showMessageDialog(null, msgCandidato + "\n" + msgVoto);
    }
  
}