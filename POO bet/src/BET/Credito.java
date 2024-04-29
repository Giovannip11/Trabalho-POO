
package BET;
import java.util.Date;

public class Credito {
    public double saldo;
    public Date validade;
    public String moeda;
    public boolean bloqueado;
    public Jogador j;

    public Credito(double saldo, Date validade) {
        this.saldo = saldo;
        this.validade = validade;
    }
    
    public void setJogador(Jogador jogador){
        this.j=jogador;
    }
    
    public void verificarValidade(){
        Date dataAtual = new Date();
        if (validade.before(dataAtual)) {
            InOut.MsgDeAviso("Aviso", "Crédito expirado!");
        }
    }
    public void bloquearCartao(){
        if(saldo<0){
            InOut.MsgDeAviso("Aviso", "Bloqueado");
        }
    }
    public void exibirSaldo(){
        InOut.MsgDeAviso("Saldo", "Saldo Atual: "+ saldo);
    }
}
    