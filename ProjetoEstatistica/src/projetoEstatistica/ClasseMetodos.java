package projetoEstatistica;

/*
Data: 04/06/2020
Programadora: Talyta S. Santos
*/
 
import javax.swing.*;

public class ClasseMetodos {
    
    //Função que recebe registro estatistica e retorna estatistica
    public Estatistica [] FCadastraEstatistica (Estatistica [] estatistica) {
    
        for (int i=0; i<3; i++){
        estatistica[i].codigocidade = Integer.parseInt(JOptionPane.showInputDialog
                                                ("Informe o código da cidade:"));
        estatistica[i].nomecidade = JOptionPane.showInputDialog
                                                ("Informe o nome da cidade:");
        estatistica[i].qtdacidentes = Integer.parseInt(JOptionPane.showInputDialog
                                                ("Informe a quantidade de acidentes:"));
                
        }
        return estatistica;
    }
    
    //Procedimento para Consulta por quantidade de acidentes > 100 e < 500**arrumar;
    public void PQtdAcidentes (Estatistica [] estatistica){
        
        for (int i=0; i < 3; i++){
            if (estatistica[i].qtdacidentes > 100 && estatistica[i].qtdacidentes < 500){
            System.out.println("Cidade com quantidades de acidentes entre 100 e 500\n" + estatistica[i].codigocidade + " " 
               + estatistica[i].nomecidade + " " + estatistica[i].qtdacidentes);
            }
        }
    }
    
    //Procedimento para Consultar por:
    //    menor numero de acidentes && maior numero de acidentes;
    public void PConsultaMaiorMenor (Estatistica [] estatistica){   
        
        for (int i=0; i < 3; i++){
            
            int codmaior = 0, qtdmaior = 0, codmenor = 0, qtdmenor = 0;
            String nomemaior = null, nomemenor = null;
                      
            if (estatistica[i].qtdacidentes >= qtdmaior){
                qtdmaior = estatistica[i].qtdacidentes;
                codmaior = estatistica[i].codigocidade;
                nomemaior = estatistica[i].nomecidade;
            }
            else if (estatistica[i].qtdacidentes <= qtdmenor){
                qtdmenor = estatistica[i].qtdacidentes;
                codmenor = estatistica[i].codigocidade;
                nomemenor = estatistica[i].nomecidade;
            }           
            System.out.println("Cidade com MAIOR número de acidentes: \n" + codmaior + " " + nomemaior + " " + qtdmaior);
            System.out.println("Cidade com MENOR número de acidentes: \n" + codmenor + " " + nomemenor + " " + qtdmenor);
        }
    }
    
    //Procedimento 
    public void PConsultaEstatistica (Estatistica [] estatistica){
              
        int media = 0, soma = 0;
        
        for (int i=0; i < 3; i++){
            soma = soma + estatistica[i].qtdacidentes;
        }
        
        media = soma/3;
        System.out.println("A média de acidentes é: " + media);
        
        for (int i=0; i < 3; i++){
            if (estatistica[i].qtdacidentes > media){            
            System.out.println("Cidade com acidentes maior que a média: \n" + estatistica[i].codigocidade + " " 
               + estatistica[i].nomecidade + " " + estatistica[i].qtdacidentes);
            }
        }
        
    }
    
}
