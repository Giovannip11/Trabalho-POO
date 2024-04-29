
package BET;

import java.util.ArrayList;
import java.util.List;

public class Aposta {
    private static int contadorAposta =1;
    public int idAposta;
    public double valorAposta;
    public int repetir;
    public Jogador j;
    public List<Jogo> jogo = new ArrayList();

    public Aposta(double valorAposta, int repetir, Jogador j) {
        this.valorAposta = valorAposta;
        this.repetir = repetir;
        this.j = j;
        this.idAposta=contadorAposta++;
    }

    
    
    public void setJogador(Jogador jogador){
        this.j=jogador;
    }
    public void adicionarJogo(Jogo jogo){
        this.jogo.add(jogo);
    }
            
    public void addJogo(Jogo jogos){
        jogo.add(jogos);
    }
    public void calcularValortotal(){
         double total = 0;
         for (Jogo jogos : jogo){
             total += jogos.apostaMax;
         }
         total *= repetir;
         valorAposta = total;
    }

    public int getIdAposta() {
        return idAposta;
    }
}
