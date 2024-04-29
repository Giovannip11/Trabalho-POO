

package BET;


public class Jogo {
    public int idjogo;
    public String descritivo;
    public double apostaMax;
    public double premioMax;

    public Jogo(int idjogo, String descritivo, double apostaMax, double premioMax) {
        this.idjogo = idjogo;
        this.descritivo = descritivo;
        this.apostaMax = apostaMax;
        this.premioMax = premioMax;
    }
    
    
    public void verificarApostaMax(double valorAposta){
        if(valorAposta>apostaMax){
            InOut.MsgDeAviso("Aviso ", "A aposta excede o limite da aposta");
    }
    }
    public void verificarPremioMax(double valorPremio){
        if(valorPremio > premioMax){
            InOut.MsgDeAviso("Aviso ", "O premio excede  o limite máximo permitido");
        }
    }
    public static Jogo criarJogoDeFutebol(){
        return new Jogo(1,"Futebol",100.0,1000.0);
    }
   
}
