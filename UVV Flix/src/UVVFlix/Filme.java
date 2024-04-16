
package UVVFlix;

import java.util.ArrayList;
import java.util.List;


public class Filme {
    private int idFilme;
    private String titulo;
    private String duracao;
    private String genero;
    private List<Ator> a = new ArrayList();

    public Filme(int idFilme, String titulo, String duracao, String genero) {
        this.idFilme = idFilme;
        this.titulo = titulo;
        this.duracao = duracao;
        this.genero = genero;
    }
    
    
    
    public void addAtor (Ator at){
       a.add(at);
    }
    public void mostrarAtores(Ator at){
        for (int i = 0;i< a.size();i++){
            InOut.MsgDeInformacao("Lista de Atores", a.get(i).toString());
        }
        
    }
}
