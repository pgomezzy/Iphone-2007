package funcionalidades.musica;

public class ReprodutorMusical implements Musica {
    
    public void tocar(){
        System.out.println("Dando play na musica");
    }

 
    public void pausar()   {
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica selecionada: "+ musica);
    }
}
