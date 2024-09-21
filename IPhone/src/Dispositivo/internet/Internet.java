package dispositivo.internet;

public class Internet implements Navegador {
    
        public void exibirPagina(String url){
            System.out.println("Entrnado em "+ url);
        }
        public void adicionarNovaAba(){
            System.out.println("Abrindo nova aba");
        }
        public void atualizarPagina(){
            System.out.println("Atualizando a pagina...");
        }
}
