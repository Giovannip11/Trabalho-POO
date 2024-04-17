
package UVVFlix;

import java.time.LocalTime;


public class Sessao {
    
    public boolean statusSessao;
    public String horario;
    public Sala s;

    public Sessao(boolean statusSessao, String horario, Sala s) {
        this.statusSessao = statusSessao;
        this.horario = horario;
        this.s = s;
    }
    
    
    
    public void iniciarSessao(){
        InOut.MsgDeAviso("Status da Sessão", "A sessão está iniciando...");
    }
    public void terminarSessao(){
        InOut.MsgDeAviso("Status da Sessão", "A sessão está terminando...");
    }
    
    public void checarHorario(){
         LocalTime horarioAtual = LocalTime.now();
        System.out.println("Horário atual: " + horarioAtual);
        System.out.println("Horário da sessão: " + horario);
    }
   
}
