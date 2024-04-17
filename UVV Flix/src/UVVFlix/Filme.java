
package UVVFlix;

import java.util.ArrayList;
import java.util.List;


public class Filme {
    public  int idFilme;
    public String titulo;
    public String duracao;
    public String genero;
    public List<Ator> a = new ArrayList();

    public Filme(int idFilme, String titulo, String duracao, String genero) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }
    
    
    
    public void addAtor (Ator at){
       a.add(at);
    }
    public String mostrarAtores(){
        StringBuilder listaAtores = new StringBuilder();
        for (Ator ator : a) {
            listaAtores.append(ator.nome).append(", ");
        }
        return listaAtores.toString();
        
    }
}
