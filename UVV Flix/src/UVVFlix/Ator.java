
package UVVFlix;

import java.util.ArrayList;
import java.util.List;


public class Ator {
    public int idAtor;
    public String nome;
    public String papel;
    public List<Filme> filmes = new ArrayList();

    public Ator(int idAtor, String nome, String papel) {
        this.idAtor = idAtor;
        this.nome = nome;
        this.papel = papel;
         
    }
    public void addFilme(Filme filme){
        filmes.add(filme);
    }
    
   
    
    
}
