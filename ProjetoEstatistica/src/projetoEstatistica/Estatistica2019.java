package projetoEstatistica;

/*
Data: 04/06/2020
Programadora: Talyta S. Santos
*/

import javax.swing.*;

public class Estatistica2019 {

    public static void main(String[] args) {
        
        //Instancia da Classe Abstrata
        Estatistica [ ] estatistica = new Estatistica [3];
        
        //Instancia da Classe Metodos
        ClasseMetodos m = new ClasseMetodos ();   
    
        //Execu��o do Metodo Construtor
        for (int i=0; i<3 ; i++){
            estatistica [i] = new Estatistica ();
        }
        
        int opc = 0;       
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog("                   MENU ESTAT�STICA"
                                                           + "\n     Estat�sticas de acidentes em 2019"
                                                           + "\n 1 - Cadastro Estat�stica"
                                                           + "\n 2 - Consulta por quantidade de acidentes"
                                                           + "\n 3 - Consulta por estat�sticas de acidentes"
                                                           + "\n 4 - Acidentes acima da m�dia das 10 cidades"
                                                           + "\n 9 - Finaliza"));
            switch (opc) {
                case 1: estatistica = m.FCadastraEstatistica(estatistica); //Chamada de Fun��o
                        break;
                case 2: m.PQtdAcidentes(estatistica);                      //Chamada de Procedimento
                        break;
                case 3: m.PConsultaMaiorMenor(estatistica);                //Chamada de Procedimento
                        break;
                case 4: m.PConsultaEstatistica(estatistica);               //Chamada de Procedimento
                        break;
                case 9: JOptionPane.showMessageDialog(null,"Programa Finalizado");
                        break;
                default: JOptionPane.showMessageDialog(null,"Op��o Inv�lida");              
            }           
        } 
    }   
}