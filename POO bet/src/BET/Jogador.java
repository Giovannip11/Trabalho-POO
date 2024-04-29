
package BET;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Jogador {
    public int idjogador;
    public String nome;
    public String sobrenome;
    public String apelido;
    public String cpf;
    public String nacionalidade;
    public Date dataNascimento;
    public Credito c;
    public List <Aposta> apostas = new ArrayList();

    public Jogador(int idjogador, String nome, String sobrenome, String apelido, String cpf, String nacionalidade, Date dataNascimento, Credito c) {
        this.idjogador = idjogador;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.apelido = apelido;
        this.cpf = cpf;
        this.nacionalidade = nacionalidade;
        this.dataNascimento = dataNascimento;
        this.c = c;
    }
    
    
    public void fazerAposta(Aposta aposta){
          aposta.setJogador(this);
          apostas.add(aposta);
          for(Jogo jogo : aposta.jogo){
              jogo.verificarApostaMax(aposta.valorAposta);
          }
          InOut.MsgDeAviso("Aviso", "Aposta feita");
    }
    public void verApostas(){
        if(apostas.isEmpty()){
            InOut.MsgDeAviso("Aviso", "Não há apostas registradas.");
        }else{
            InOut.MsgDeAviso("Apostas", "Listagem de apostas: ");
            for(Aposta aposta : apostas){
                int idAposta  = aposta.getIdAposta();
                InOut.MsgDeInformacao("",""+idAposta);
            }
        }
    }

    
}
