package projetoSistemaVotacao;

import javax.swing.*;

public class MenuSecundario {
    
    Indicadores ind = new Indicadores ();
    
    void menuIndicadores (Votacao [] votacao){
        boolean troca = true;
        int qtdSecoes = 1, qdtCandidatos = 1;
        
        int [] classificaCandidatos = new int [votacao.length-1];
        
        for(int i=0; i<votacao.length-1; i++){
            if(votacao[i].numsecao != votacao[i+1].numsecao){
                qtdSecoes ++;
            }
            classificaCandidatos[i] = votacao[i].numcandidato;
        }
        
        while(troca){
            troca = false;
            for (int i=0; i<classificaCandidatos.length-1; i++){
                if (classificaCandidatos[i] > classificaCandidatos[i+1]){
                    int aux = classificaCandidatos [i];
                        classificaCandidatos[i] = classificaCandidatos[i+1];
                    classificaCandidatos[i+1] = aux;
                    troca = true;
                }
            }
        }
        
        for (int i=0; i<classificaCandidatos.length-1 ; i++){
            if (classificaCandidatos[i] != classificaCandidatos[i+1]){
                qdtCandidatos ++;
            }
        }
        
        int [][] secoes = new int [2][qtdSecoes];
        int [][] candidatos = new int [2][qdtCandidatos];
        int opc = 0;
        
        while (opc != 9){
            opc = Integer.parseInt(JOptionPane.showInputDialog
            ("                   Mostrar Indicadores"
           + "\n            Estatísticas de Votação em 2016"
           + "\n 1 – Quantidade Eleitores por Seção"
           + "\n 2 – Seção com Maior e Menor número de Eleitores"
           + "\n 3 – Quantidade de votos por candidato"
           + "\n 4 – 10 primeiros colocadas (nro  cand. e qtd votos )"
           + "\n 9 – Finaliza consulta"));
            
            switch (opc) {
                case 1 : ind.CalcularEleitores(votacao, secoes); //Chamada de Procedimento; 
                         break;
                case 2 : ind.ClassificarSecao(votacao, secoes);  //Chamada de Procedimento; 
                         break;
                case 3 : ind.votosPorCandidato(classificaCandidatos, candidatos);  //Chamada de Procedimento; 
                         break;
                case 4 : ind.rankearCandidatos(classificaCandidatos, candidatos);  //Chamada de Procedimento; 
                         break;
                case 9 : JOptionPane.showMessageDialog(null,"FINALIZADO!");
                         break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA!");
                         break;
            }
        }
    }   
}