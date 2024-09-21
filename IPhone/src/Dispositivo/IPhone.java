package dispositivo;
import dispositivo.musica.ReprodutorMusical;

public class IPhone {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical ipod = new ReprodutorMusical();
        ipod.tocar();
        ipod.selecionarMusica("Heather");
        ipod.pausar();
    }
}
