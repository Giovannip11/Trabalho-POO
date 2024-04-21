package espiritogurreiro;

import java.util.Random;

public class Oraculo {

    public String nome;
    public Guerreiro g;
    public String frase;

    public void prologoIntroducao() {

        InOut.MsgDeAviso("Prologo", "Bem vindo ao mundo  de Espirito Guerreiro");
    }

    public void prologoPerdedor() {

       InOut.MsgDeAviso("Prologo", "Voce foi derrotado.");
    }

    public void prologoVencedor() {

         InOut.MsgDeAviso("Prologo", "Voce venceu!!");
    }

    public boolean loadLevel01(int num,int escolha) {
        Random random = new Random();
        int num = random.nextInt(6);
        for ()
              
        return true;
    }

    public boolean loadLevel02() {

        return true;
    }

    public boolean decidirVidaExtra(String frase) {
        return true;
    }
}
