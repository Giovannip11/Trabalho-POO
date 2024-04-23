package espiritogurreiro;

import java.util.Random;

public class Guerreiro {

    public String nome;
    public int qtdVidas;
    public Bolsa myBolsa;

    public String vidaExtra() {

        return null;
    }
    public int  sortearVidas(){
        Random random = new Random();
        
        int qtdVidas = random.nextInt(4)+9;
        
        InOut.MsgDeAviso("Número de vidas:", ""+qtdVidas);
        
        return qtdVidas;
    }
}
