package projetoSistemaVotacao;

//Classe Abstrata
public class Votacao {
 int numsecao;
 int numcandidato;
 
 //Metodo Construtor
 Votacao(){
     this(0 , 0);
 }
        
 //Metodo Procedimento
 Votacao (int numerosecao, int numerocandidato){
     numsecao = numerosecao;
     numcandidato = numerocandidato;
 }
}