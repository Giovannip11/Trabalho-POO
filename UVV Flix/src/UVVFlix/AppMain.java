
package UVVFlix;
     
public class AppMain {
    public static void main(String[] args) {
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        Ator ator1 = new Ator(1, "Leonardo DiCaprio", "Protagonista");
       Ator ator2 = new Ator(2, "Brad Pitt", "Protagonista");
       Ator ator3 = new Ator(3,"Jonan Hill", "Coadjuvante");
       
       
       Filme filme1 = new Filme(1, "O Regresso", "2h36m", "Western");
       Filme filme2 = new Filme(2, "Encontro Marcado", "3h1m", "Romance/Fantasia");
       
       filme1.addAtor(ator1);
       filme2.addAtor(ator2);
       filme1.addAtor(ator3);
       Sala sala1 = new Sala(1, 100, "3D", "Primeiro andar");
       Sala sala2 = new Sala(2, 70, "IMAX", "Segundo andar");
        
       Sessao sessao1 = new Sessao(true, "19:30", sala1);
       Sessao sessao2 = new Sessao(false, "20:30", sala2);
       
       sala1.addSessao(sessao1);
       sala2.addSessao(sessao2);
       
       InOut.MsgDeAviso("Filme", filme1.titulo);
       InOut.MsgDeAviso("Atores: ",filme1.mostrarAtores());
       
       InOut.MsgDeAviso("Horario da sessão: ", sessao1.horario);
       
       
       sessao1.addFilmes(filme2);
       sessao1.addFilmes(filme1);
       InOut.MsgDeAviso("Filmes:", sessao1.mostrarFilmes());
        sessao1.iniciarSessao();
       sessao1.terminarSessao();
                
    }
}
