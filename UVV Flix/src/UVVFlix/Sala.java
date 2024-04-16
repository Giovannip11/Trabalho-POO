
package UVVFlix;

import java.util.ArrayList;
import java.util.List;


public class Sala {
    private int idSala;
    private int numAssentos;
    private String tipoTela;
    private String localizacao;
    private List<Sessao> s = new ArrayList();

    public Sala(int idSala, int numAssentos, String tipoTela, String localizacao) {
        this.idSala = idSala;
        this.numAssentos = numAssentos;
        this.tipoTela = tipoTela;
        this.localizacao = localizacao;
        this.s = new ArrayList();
    }
    public void addSessao(){
        
    }
    public void removerSessao(){
        
    }
    
    
    
    
}
