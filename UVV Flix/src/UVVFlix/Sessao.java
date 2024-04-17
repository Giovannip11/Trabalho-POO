package UVVFlix;

import java.util.ArrayList;
import java.util.List;

public class Sessao {

    public boolean statusSessao;
    public String horario;
    public Sala s;
    public List<Filme> f = new ArrayList();

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
    
    public void addFilmes(Filme fi){
        f.add(fi);
    }

    

    public String mostrarFilmes() {
        StringBuilder listaFilmes = new StringBuilder();
        for (Filme filme : f) {
            listaFilmes.append(filme.titulo).append(", ");
        }
        return listaFilmes.toString();
    }

}
