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
        public void atender();
        public void iniciarCorreioVoz();
    // TODO: Implementar metodos de reprodutor
}
