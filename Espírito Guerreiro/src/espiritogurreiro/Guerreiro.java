package espiritogurreiro;

import java.util.Random;

public class Guerreiro {

    public String nome;
    public int qtdVidas;
    public Bolsa myBolsa;

    public Guerreiro(String nome, int qtdVidas, Bolsa myBolsa) {
        this.nome = nome;
        this.qtdVidas = qtdVidas;
        this.myBolsa = myBolsa;
    }

    public String vidaExtra() {

        
        return InOut.leString("Digite seu pedido de misericordia");
    }
    public int  sortearVidas(){
        Random random = new Random();
        
        int vidasSorteadas = random.nextInt(4)+9;
        
        InOut.MsgDeAviso("Número de vidas:", ""+vidasSorteadas);
        
        return vidasSorteadas;
    }
}
