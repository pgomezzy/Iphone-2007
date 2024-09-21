package funcionalidades.dispositivo;
import funcionalidades.internet.Internet;
import funcionalidades.internet.Navegador;
import funcionalidades.musica.Musica;
import funcionalidades.musica.ReprodutorMusical;
import funcionalidades.telefone.AparelhoTelefonico;
import funcionalidades.telefone.Telefone;
import java.util.Scanner;;

public class Celular implements Internet, Musica, Telefone {
    // INTERNET
    public void exibirPagina(String url){
        System.out.println("Entrnado em "+ url);
    }
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a pagina...");
    }
    // MUSICA
    public void ligarCelular(){
        System.out.println("Ligando o celular");

            
    }
    public void tocar(){
        System.out.println("Dando play na musica");
    }
    
    public void pausar()   {
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: "+ musica);
    }
    // TELEFONE
    public void ligar(String numero){
        System.out.println("Ligando para "+ numero);
    }
    public void atender(){
        System.out.println("Tocando... Atender??");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }
    
    // CELULAR
    public void ligar(){
        System.out.println("Ligando o IPhone");
    }

    public void desligar(){
        System.out.println("Desligando o IPhone");
    }

    public void telefone(){
        System.out.println("------------------------");
        System.out.println("Entrando em telefone");
        AparelhoTelefonico telefone = new AparelhoTelefonico(); 
        System.out.println("Digite o numero que deseja ligar: ");  
        Scanner numeroLigar = new Scanner(System.in);
        String numero = numeroLigar.next();
        telefone.ligar(numero);
        // RECEBENDO A LIGAÇÂO
        System.out.println("------------------------");
        System.out.println("Você esta recebendo uma ligação...\n");
        System.out.println("1- Atender ou 2- Desligar: ");
        Scanner atender = new Scanner(System.in);
        String respostaAtender = atender.next();
            switch (respostaAtender) {
                case "1":
                    telefone.atender();
                    break;
                case "2":
                     System.out.println("Atendendo");
                     break;
                }
                
        // CORREIO DE VOZ
        System.out.println("------------------------");
        System.out.println("Ver Coreio de Voz? \n");
        System.out.println("1- Sim \n2- Não");
        Scanner correioVoz = new Scanner(System.in);
        String alternativa = correioVoz.next();
        switch (alternativa) {
        case "1":
            telefone.iniciarCorreioVoz();
                break;
        case "2":
            System.out.println("Saindo do correio de voz");
                break;
                }

        System.out.println("------------------------");
        System.out.println("Saindo de Telefone");
    }
    public void internet(){
    System.out.println("------------------------");
        System.out.println("Entrando em internet");
        Navegador web = new Navegador();
        System.out.println("Digite o link do site: ");
        Scanner site = new Scanner(System.in);
        String url = site.next();
        web.exibirPagina(url);
        // NOVA ABA
        System.out.println("------------------------");
        System.out.println("Abrir nova aba?\n");
        System.out.println("1- Sim \n2- Não");
        Scanner respostaPagina = new Scanner(System.in);
        String aba = respostaPagina.next();

        switch (aba) {
        case "1":
            web.adicionarNovaAba();
            break;
        case "2":
            System.out.println("...");
            break;
                }
        // ATUALIZAR PAGINA
        System.out.println("------------------------");
        web.atualizarPagina();
                
    }
    public void musica(){
        System.out.println("------------------------");
        System.out.println("Entrando em musica");
        System.out.println("Digite o nome da musica para selecionar: ");
        Scanner selecaoMusica = new Scanner(System.in);
        ReprodutorMusical ipod = new ReprodutorMusical();
        String  musica = selecaoMusica.next();
        ipod.selecionarMusica(musica);
        // TOCAR
        System.out.println("------------------------");
        ipod.tocar();
        // PAUSAR
        System.out.println("------------------------");
        System.out.println("Você deseja pausar a musica?\n");
        System.out.println("1- Sim \n2- Não");
        Scanner pausar = new Scanner(System.in);
        String respostaPausar = pausar.next();
    switch (respostaPausar) {
    case "1":
            ipod.pausar();
            break;
    case "2":
            System.out.println("...");
            break;
                }
    
    }

}
