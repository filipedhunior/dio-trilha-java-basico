import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class While {
  public static void main(String[] args) {
    double mesada = 50.0;
    // Declaração de arraylist para armazenar o estado da variavel ao longo do programa
    ArrayList<String> extrato = new ArrayList<>(); 
    
    // Criar uma instância de DecimalFormat para formatar os valores
    DecimalFormat df = new DecimalFormat("#.00");

    while(mesada > 0){
        double valorDoce = valorAleatorio();
        
        // Formatando os valores
        String valorDoceFormatado = df.format(valorDoce);
        String mesadaFormatada = df.format(mesada);
        
        if(valorDoce > mesada)
            valorDoce = mesada;

        System.out.println("");
        System.out.println("Doce do valor: " + valorDoceFormatado + " adicionado no carrinho");
        mesada = mesada - valorDoce;
        System.out.println("Mesada atual: "+ mesadaFormatada);
        System.out.println("_____________________");
        
        // Adiciona o valor atual de valorDoce no extrato
        extrato.add(valorDoceFormatado);
    }
    // Formatando a mesada final
    String mesadaFinalFormatada = mesada == 0? df.format(0.00) : df.format(mesada) ;

    System.out.println("");
    System.out.println("Mesada: " + mesadaFinalFormatada);
    System.out.println("Joãozinho gastou toda a sua mesada em doces");
    System.out.println("");
    System.out.println("Os gastos de Joãozinho foram:");
    System.out.println(extrato);
    System.out.println("");
  }
  private static double valorAleatorio() {
    return ThreadLocalRandom.current().nextDouble(2,8);
  }
}
