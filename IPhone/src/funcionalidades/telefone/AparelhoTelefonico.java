package funcionalidades.telefone;

public class AparelhoTelefonico implements Telefone{
    public void ligar(String numero){
        System.out.println("Ligando para "+ numero);
    }
    public void atender(){
        System.out.println("Atendendo a Ligação");
    }
    public void iniciarCorreioVoz(){
        System.out.println("Correio de voz iniciado");
    }
       
}
