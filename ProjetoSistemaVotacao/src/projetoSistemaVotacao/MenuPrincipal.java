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
            ("                   SISTEMA DE VOTAÇÃO"
           + "\n 1 – Carregar Seção/Número Eleitor "
           + "\n 2 – Classificar por Seção"
           + "\n 3 – Gravar Registros"
           + "\n 4 – Mostrar Indicadores "
           + "\n 9 – Finalizar"));
            
            switch (opc) {
                case 1 : votacao = v.FCadastraVotacao(votacao); //Chamada de Função;
                         break;
                case 2 : votacao = v.FClassificaSecao(votacao); //Chamada de Função;
                         break;
                case 3 : votacao = v.FGravaVotacao(votacao);    //Chamada de Função;
                         break;
                case 4 : ms.menuIndicadores(votacao);           //Mostrar Menu Secundário
                         break;
                case 9 : JOptionPane.showMessageDialog(null,"FINALIZADO!"); //Mostrar menu *****
                         break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA!");
                         break;
            } 
        }
    }
}