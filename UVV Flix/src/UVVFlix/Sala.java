
package UVVFlix;

import java.util.ArrayList;
import java.util.List;


public class Sala {
    public int idSala;
    public int numAssentos;
    public String tipoTela;
    public String localizacao;
    public List<Sessao> s = new ArrayList();

    public Sala(int idSala, int numAssentos, String tipoTela, String localizacao) {
        this.idSala = idSala;
        this.numAssentos = numAssentos;
        this.tipoTela = tipoTela;
        this.localizacao = localizacao;
        this.s = new ArrayList();
    }
    public void main(){
        
    }
    public void menu(){
        
    }
    public void addSessao(Sessao ss){
        s.add(ss);
    }
    public void removerSessao(Sessao ss){
        s.remove(ss);
        
    }
    
    
    
    
    
}
