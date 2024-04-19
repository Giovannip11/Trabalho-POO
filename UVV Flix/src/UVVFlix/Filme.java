
package UVVFlix;

import java.util.ArrayList;
import java.util.List;


public class Filme {
    public  int idFilme;
    public String titulo;
    public String duracao;
    public String genero;
    public List<Ator> atores = new ArrayList();
    public Sessao s;

    public Filme(int idFilme, String titulo, String duracao, String genero) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
        this.atores = new ArrayList<>();
    }
    
    
    
    public void addAtor (Ator ator){
       atores.add(ator);
       ator.addFilme(this);
    }
    public String mostrarAtores(){
        StringBuilder listaAtores = new StringBuilder();
        for (Ator ator : atores) {
            listaAtores.append(ator.nome).append(", ");
        }
        return listaAtores.toString();
        
    }
}
