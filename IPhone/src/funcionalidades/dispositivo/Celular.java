package funcionalidades.dispositivo;
import funcionalidades.internet.Internet;
import funcionalidades.musica.Musica;
import funcionalidades.telefone.Telefone;

public class Celular implements Internet, Musica, Telefone {
    
    public void exibirPagina(String url){
        System.out.println("Entrnado em "+ url);
    }
    public void adicionarNovaAba(){
        System.out.println("Abrindo nova aba");
    }
    public void atualizarPagina(){
        System.out.println("Atualizando a pagina...");
    }

    public void Ligar(){
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

    public void ligar(String numero){
        System.out.println("Ligando para "+ numero);
    }
    public void atender(){
        System.out.println("Tocando... Atender??");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }
    // public void funcionalidade(String escolha){
    //     switch (escolha) {
    //         case "telefone":
    //             System.out.println("entrando em telefone");
    //             break;
    //         case "internet":
    //         System.out.println("entrando em internet");
    //             break;
    //         case "musica":
    //         System.out.println("entrando em musica");
    //             break;
    //         default:
    //         System.out.println("Escolha uma das opções");
    //             break;
    //     }
    // }
}
