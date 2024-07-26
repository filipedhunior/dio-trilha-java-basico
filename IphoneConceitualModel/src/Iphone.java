public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

    //TODO: Implementar metodos de reprodutor
        public void tocar(){
            System.out.println("Tocando musica no Iphone");
        }
        public void pausar(){
            System.out.println("Musica pausada no Iphone");
        }
        public void selecionarMusica(String musica){
            System.out.println("Musica "+ musica + "selecionada");
        }

    // TODO: Implementar metodos de Aparelho Telefonico
        public void ligar(String numero){
            System.out.println("Você esta ligando para " + numero + "no Iphone");
        }
        public void atender(){
            System.out.println("Atendendo chamada no Iphone");
        }
        public void iniciarCorreioVoz(){
            System.out.println("Iniciando correio de voz no Iphone");
        }

    // TODO: Implementar metodos de Navegador
        public void exibirPagina(String url){
            System.out.println("Acessando a url " + "via Iphone");
        }
        public void adicionarNovaAba(){
            System.out.println("Adicionando nova Aba no Iphone");
        }
        public void atualizarPagina(){
            System.out.println("Atualizando pagina no Iphone");
        }
}
