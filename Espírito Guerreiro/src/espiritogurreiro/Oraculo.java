package espiritogurreiro;

import java.util.Random;

public class Oraculo {

    public String nome;
    public Guerreiro g;
    public String frase;

    public Oraculo(Guerreiro g) {
        
        this.g = g;
  
    }



    public void definirNome(){
        this.nome=InOut.leString("Digite o nome do Oraculo");
    }
    public void prologoIntroducao() {

        InOut.MsgDeAviso("Prologo", "Bem vindo ao mundo  de Espirito Guerreiro\nNome do Oraculo: "+this.nome+"\nVidas do guerreiro: "+g.qtdVidas);
        
    }

    public void prologoPerdedor() {

       InOut.MsgDeAviso("Prologo", "Voce foi derrotado.");
    }

    public void prologoVencedor() {

         InOut.MsgDeAviso("Prologo", "Voce venceu!!");
    }

    public boolean loadLevel01() {
        while (g.qtdVidas > 0) { 
        Random random = new Random();
        int numOraculo = random.nextInt(6);
        InOut.MsgDeAviso("Level 1", "Neste Level você jogará Par ou Ímpar contra o Oráculo. Boa sorte!");
        int numGuerreiro = InOut.leInt("Digite um número de 0 a 5");
        
        // Verifica se o número digitado pelo jogador é válido
        if (numGuerreiro < 0 || numGuerreiro > 5) {
            InOut.MsgDeAviso("ERRO", "Número inválido. Digite um número entre 0 e 5.");
            continue; 
        }
        
        String escolha = InOut.leString("Escolha entre Par ou Ímpar").toLowerCase();
        
        if (!(escolha.equals("par") || escolha.equals("ímpar"))) {
            InOut.MsgDeAviso("ERRO", "Escolha inválida. Escolha apenas entre Par ou Ímpar.");
            continue;
        }
        
        int soma = numOraculo + numGuerreiro;
        boolean resultado = (soma % 2 == 0 && escolha.equals("par")) || (soma % 2 != 0 && escolha.equals("ímpar"));

        InOut.MsgDeAviso("Número do Oráculo:", "" + numOraculo);
        InOut.MsgDeAviso("Soma:", "" + soma);
        
        if (resultado) {
            InOut.MsgDeAviso("Level 1", "Você ganhou!");
            return true; 
        } else {
            g.qtdVidas--; 
            InOut.MsgDeAviso("Level 1", "Você perdeu!");
            InOut.MsgDeAviso("Vidas Restantes:", "" + g.qtdVidas);
        }
    }
    
    InOut.MsgDeAviso("Game Over", "Você perdeu todas as vidas. Fim de jogo!");
    return false; 
}

    public boolean loadLevel02() {
      
        InOut.MsgDeAviso("Level 2", "Neste Level voce resolverá 3 charadas,boa sorte");
        int resposta1=1 ; 
        String resposta2="Meu nome";
        String resposta3="Leiteiro";
        
        
        int palpite1 = InOut.leInt("Charada 1: O que é o que é? É o primeiro a nascer mas não o menor, sou a base de tudo e sem mim nada se pode fazer, sou a unidade e essencia da vida");
        if(palpite1==1){
            InOut.MsgDeAviso("Level 2", "Resposta correta!");
        }else{
            InOut.MsgDeAviso("Level 2" , "Resposta Incorreta");
            return false;
        }
        String palpite2 = InOut.leString("Charada 2: O que é o que é? E meu, mas meus amigos usam mais que eu.");
        if (palpite2.equals(resposta2)){
            InOut.MsgDeAviso("Level 2", "Resposta Correta!");
        }else{
             InOut.MsgDeAviso("Level 2" , "Resposta Incorreta");
            return false;
        }
        String palpite3 = InOut.leString("Charada 3:O que é o que é? Da leite mas não e vaca.");
        if(palpite3.equals(resposta3)){
             InOut.MsgDeAviso("Level 2", "Resposta correta!");
        }else{
            InOut.MsgDeAviso("Level 2" , "Resposta Incorreta");
            return false;
        }
        
        InOut.MsgDeAviso("Level 2", "Parabéns voce acertou todas as charadas");
        return true;
    }

    public boolean decidirVidaExtra(String Misericordia) {
        
        String[] palavras = Misericordia.split("\\s+"); 
        if (palavras.length > 5) {
            InOut.MsgDeAviso("Decisão do Oráculo:", "Vida extra concedida!");
            return true;
        } else {
            InOut.MsgDeAviso("Decisão do Oráculo:", "Vida extra não concedida.");
            return false;
        }
    }
        
    }

