package dispositivo;

public class IPhone {
    public void Ligar(){
        System.out.println("Ligando o celular");
    }
    public void funcionalidade(String escolha){
        switch (escolha) {
            case "telefone":
                System.out.println("entrando em telefone");
                break;
            case "internet":
            System.out.println("entrando em internet");
                break;
            case "musica":
            System.out.println("entrando em musica");
                break;
            default:
            System.out.println("Escolha uma das opções");
                break;
        }
    }
}
