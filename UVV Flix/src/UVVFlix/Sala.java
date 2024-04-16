
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
    public void colsultarNumdeAssenteos(int numAssentos){
        for (int i=0;i< s.size();i++){
            InOut.MsgDeAviso("Números de assentos:", s.get(i).toString());
        }
        
    }
    
    
    
    
}
