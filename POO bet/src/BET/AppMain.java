package BET;

import java.util.Date;
import java.util.Random;

public class AppMain {

    public static void main(String[] args) {
        Random random = new Random();
        boolean continuar = true;

        while (continuar) {
            Jogador jogador1 = new Jogador(1, "João", "Silva", "joao123", "12345678900", "Brasileiro", new Date(), new Credito(1000.0, new Date()));
            Jogador jogador2 = new Jogador(2, "Maria", "Santos", "maria456", "98765432100", "Brasileira", new Date(), new Credito(1500.0, new Date()));

            InOut.MsgDeAviso("Jogos disponíveis", "(1) Barcelona X Real Madrid - $500 aposta máxima\n(2) Manchester United X Liverpool - $300 aposta máxima");

            int numeroJogo = InOut.leInt("Escolha um número correspondente ao jogo que você quer apostar: ");

            double limiteAposta;
            switch (numeroJogo) {
                case 1:
                    limiteAposta = 500.0;
                    break;
                case 2:
                    limiteAposta = 300.0;
                    break;
                default:
                    InOut.MsgDeAviso("Aviso", "Jogo inválido!");
                    return;
            }

            double valorAposta = InOut.leDouble("Digite o valor da aposta (máximo $" + limiteAposta + "): ");

            if (valorAposta > limiteAposta) {
                InOut.MsgDeAviso("Aviso", "Aposta excede o limite máximo permitido");
                return;
            }

            Aposta aposta1 = new Aposta(valorAposta, numeroJogo, jogador2);
            aposta1.valorAposta = valorAposta;
            aposta1.repetir = 1;

            Jogo jogoFutebol = criarJogoDeFutebol(numeroJogo);
            if (jogoFutebol == null) {
                InOut.MsgDeAviso("Aviso", "Jogo não encontrado!");
                return;
            }
            aposta1.adicionarJogo(jogoFutebol);

            jogador1.fazerAposta(aposta1);

            jogador1.verApostas();

            double resultadoAleatorio = random.nextDouble() * 1000;
            InOut.MsgDeAviso("Resultado", "" + resultadoAleatorio);

            if (resultadoAleatorio > valorAposta) {
                InOut.MsgDeAviso("Parabéns", "Você ganhou!!!");
            } else {
                InOut.MsgDeAviso("Você perdeu", "Melhore");
            }

            String resposta = InOut.leString("Deseja fazer outra aposta? (Digite 'sair' para sair, ou 'continuar' para fazer outra aposta): ");
            if (resposta.equalsIgnoreCase("sair")) {
                continuar = false;
            }
        }
    }

    public static Jogo criarJogoDeFutebol(int numeroJogo) {
        switch (numeroJogo) {
            case 1:
                return new Jogo(1, "Barcelona vs Real Madrid", 500.0, 5000.0);
            case 2:
                return new Jogo(2, "Manchester United vs Liverpool", 300.0, 3000.0);
            default:
                return null;
        }
    }
    
}
