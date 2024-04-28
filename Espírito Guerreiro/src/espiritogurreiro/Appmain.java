package espiritogurreiro;

import java.util.Random;

public class Appmain {

    public static void main(String[] args) {
        Random random = new Random();
        Guerreiro g = new Guerreiro("Guerreiro", 3, new Bolsa());
        Oraculo oraculo = new Oraculo(g);
        oraculo.definirNome();
        oraculo.prologoIntroducao();
        
      
        jogarPartida(oraculo, g);

        
        jogarPartida(oraculo, g);
    }
    
    public static void jogarPartida(Oraculo oraculo, Guerreiro g) {
        if (oraculo.loadLevel01()) {
            g.qtdVidas = g.sortearVidas();
            oraculo.prologoIntroducao();

           
            String misericordia = g.vidaExtra();
            boolean vidaExtra = oraculo.decidirVidaExtra(misericordia);

            if (vidaExtra) {
                g.qtdVidas++;
                oraculo.prologoIntroducao();
            }

            if (oraculo.loadLevel02()) {
                if (!vidaExtra) { 
                    misericordia = g.vidaExtra(); 
                    vidaExtra = oraculo.decidirVidaExtra(misericordia);

                    if (vidaExtra) {
                        g.qtdVidas++;
                        oraculo.prologoIntroducao();
                    }
                }
            } else {
                oraculo.prologoPerdedor();
            }
        } else {
            oraculo.prologoPerdedor();
        }
    }
}
