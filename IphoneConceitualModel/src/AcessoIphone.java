//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AcessoIphone {
    public static void main(String[] args) {
    Iphone iphone = new Iphone();
    iphone.selecionarMusica("Monster - Skillet");
    iphone.tocar();
    iphone.pausar();

    iphone.ligar("9 9999 9999");
    iphone.atender();
    iphone.iniciarCorreioVoz();

    iphone.adicionarNovaAba();
    iphone.exibirPagina("www.site.com");
    iphone.atualizarPagina();
    }
}