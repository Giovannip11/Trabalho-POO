
package UVVFlix;

public class AppMain {
    public static void main(String[] args) {
        
       
        Sala sala1 = new Sala(1, 100, "Tela Grande", "Local 1");
        Sessao sessao1 = new Sessao(true, "18:00", sala1);
        Filme filme1 = new Filme(1, "Filme Teste", 2, "Ação");
      
        
       
        int opcao;
        do {
            InOut.MsgDeAviso("Bem vindo ao menu principal", "=== MENU PRINCIPAL ===");
            InOut.MsgDeAviso("Ações", "1: Adicionar Ator\n2: Mostrar Atores de um Filme\n3: Adicionar Filme a uma Sessão\n4: Mostrar Filmes de uma Sessão\n5: Iniciar Sessão\n6: Terminar Sessão\n7: Sair");
            opcao = InOut.leInt("Escolha uma opção: ");
            
            switch (opcao) {
                case 1:
                
                    int idAtor = InOut.leInt("Informe o ID do ator: ");
                    String nomeAtor = InOut.leString("Informe o nome do ator: ");
                    String papelAtor = InOut.leString("Informe o papel do ator: ");
                    Ator novoAtor = new Ator(idAtor, nomeAtor, papelAtor);
                    
                    filme1.addAtor(novoAtor);
                    break;
                case 2:
                 
                    String tituloFilme = InOut.leString("Informe o título do filme: ");
                    InOut.MsgDeAviso("Atores do Filme", filme1.mostrarAtores());
                    break;
                case 3:
                    
                    int idFilme = InOut.leInt("Informe o ID do filme: ");
                    String tituloFilmeAdd = InOut.leString("Informe o título do filme: ");
                    long duracaoFilme = InOut.leLong("Informe a duração do filme em minutos: ");
                    String generoFilme = InOut.leString("Informe o gênero do filme: ");
                    Filme novoFilme = new Filme(idFilme, tituloFilmeAdd, duracaoFilme, generoFilme);
                    
                    sessao1.addFilmes(novoFilme);
                    break;
                case 4:
                   
                    InOut.MsgDeAviso("Filmes da Sessão", sessao1.mostrarFilmes());
                    break;
                case 5:
                    
                    sessao1.iniciarSessao();
                    break;
                case 6:
                    
                    sessao1.terminarSessao();
                    break;
                case 7:
                   
                    InOut.MsgDeAviso("Saindo do programa...", "");
                  break;
                  default:
                      InOut.MsgDeErro("ERRO","Opção invalida!");
            }
        }while (opcao !=7  );
    }
}
