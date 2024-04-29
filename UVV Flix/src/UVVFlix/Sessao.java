package UVVFlix;

import java.util.ArrayList;
import java.util.List;

public class Sessao {

    public boolean statusSessao;
    public String horario;
    public Sala s;
    public List<Filme> filmes = new ArrayList();

    public Sessao(boolean statusSessao, String horario, Sala s) {
        this.statusSessao = statusSessao;
        this.horario = horario;
        this.s = s;
        
    }

    public void iniciarSessao() {
        InOut.MsgDeAviso("Status da Sessão", "A sessão está iniciando...");
    }

    public void terminarSessao() {
        InOut.MsgDeAviso("Status da Sessão", "A sessão está terminando...");
    }
    
    public void addFilmes(Filme filme){
        filmes.add(filme);
        filme.s=this;
    }

    

    public String mostrarFilmes() {
        StringBuilder listaFilmes = new StringBuilder();
        for (Filme filme : filmes) {
            listaFilmes.append(filme.titulo).append(", ");
        }
        return listaFilmes.toString();
    }

}
