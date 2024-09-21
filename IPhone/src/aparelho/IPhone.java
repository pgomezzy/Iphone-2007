package aparelho;
import java.util.Scanner;
// import funcionalidades.internet.Navegador;
// import funcionalidades.musica.ReprodutorMusical;
// import funcionalidades.telefone.AparelhoTelefonico;
import funcionalidades.dispositivo.Celular;

public class IPhone  
{
    public static void main(String[] args) throws Exception 
        {
        Celular iphone = new Celular();
        iphone.ligarCelular();
        System.out.println("Ligando o celular");
        System.out.println("ESCOLHA A FUNCIONABILIDADE \n 1- telefone \n 2- internet \n 3- musica ");
        Scanner funcionalidade = new Scanner(System.in);
        String escolha = funcionalidade.next();
            
        switch (escolha) 
            {
            case "1":
            iphone.telefone();

                break;
            case "2":
                iphone.internet();

                break;
            case "3":
                iphone.musica();

                break;
            default:
                System.out.println("Escolha uma das opções");
                    break;
            }
            Scanner status = new Scanner(System.in);
            String desligar = status.next();

            iphone.desligar();
        }
            
            
            
}

    

