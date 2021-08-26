package projetoEstatistica;

/*
Data: 04/06/2020
Programadora: Talyta S. Santos
*/

//Classe Abstrata
class Estatistica {
    int codigocidade;
    String nomecidade;
    int qtdacidentes;
    
    //Metodo Construtor
    Estatistica(){
        this (0, "", 0);
    }
    
    //Metodo Procedimento
    Estatistica (int cidade,String nome,int qtd){
        codigocidade = cidade;
        nomecidade = nome;
        qtdacidentes = qtd;
    } 
}