package projetoSistemaVotacao;

/*
Data: 25/06/2020
Programadora: Talyta S. Santos
*/

import javax.swing.*;
import java.io.*;

public class MenuPrincipal {
    
    public static void main(String[] args) throws IOException {
        //Instancia da Classe Abstrata
        Votacao [] votacao = new Votacao [100];
        
        //Instancia da Classe de Metodos e Mostra Indicadores
        Votacao2016 v = new Votacao2016 ();
        MenuSecundario ms = new MenuSecundario();
               
        int opc = 0;
        
        while (opc!=9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog
            ("                   SISTEMA DE VOTA��O"
           + "\n 1 � Carregar Se��o/N�mero Eleitor "
           + "\n 2 � Classificar por Se��o"
           + "\n 3 � Gravar Registros"
           + "\n 4 � Mostrar Indicadores "
           + "\n 9 � Finalizar"));
            
            switch (opc) {
                case 1 : votacao = v.FCadastraVotacao(votacao); //Chamada de Fun��o;
                         break;
                case 2 : votacao = v.FClassificaSecao(votacao); //Chamada de Fun��o;
                         break;
                case 3 : votacao = v.FGravaVotacao(votacao);    //Chamada de Fun��o;
                         break;
                case 4 : ms.menuIndicadores(votacao);           //Mostrar Menu Secund�rio
                         break;
                case 9 : JOptionPane.showMessageDialog(null,"FINALIZADO!"); //Mostrar menu *****
                         break;
                default: JOptionPane.showMessageDialog(null,"OP��O INV�LIDA!");
                         break;
            } 
        }
    }
}