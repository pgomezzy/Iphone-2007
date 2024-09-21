package dispositivo;
import dispositivo.musica.ReprodutorMusical;
import dispositivo.telefone.AparelhoTelefonico;
public class IPhone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical ipod = new ReprodutorMusical();
        ipod.tocar();
        ipod.selecionarMusica("Heather");
        ipod.pausar();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        telefone.ligar("85996004286");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        

    }
}
