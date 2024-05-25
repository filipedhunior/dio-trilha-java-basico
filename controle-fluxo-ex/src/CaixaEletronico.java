import java.util.Scanner;

public class CaixaEletronico{
    public static void main(String[] args) {
    
    //Aprendendo a usar estruturas condicionais
    // Estruturas condicionais são estruturas de codigo que só são executadas mediante o cumprimento de uma determinada condição 
    // Condicionais simples: estruturas que só dependem do valor ser ou não verdadeiro
    // Condicionais compostas: esturutras que seguem mais de uma jornada de execução
    
    double saldo = 25.0;
    double valorSolicitado = 26.0;

    System.out.println("");
    System.out.println("CAIXA ELETRONICO JAVA");        
    System.out.println("Seu saldo atual é R$"+saldo);
    // System.out.println("Foi solicitado R$"+valorSolicitado);

    Scanner scanner = new Scanner(System.in);
    
    //Implementar um scanner para entrada do valorSolicitado
    System.out.println("");
    System.out.println("Digite o valor para SAQUE abaixo:");
    valorSolicitado = scanner.nextDouble();

    if (valorSolicitado < saldo) {
        System.out.println("Apos a operação [Saque], seu saldo é R$"+(saldo = saldo - valorSolicitado));
    } else if (valorSolicitado > saldo) {
        System.out.println("Não foi possivel completar a operação desejada [Saque], pois o saldo R$"+saldo+ " é menor que o valor solicitado R$"+valorSolicitado);
    } else {
        System.out.println("Apos a operação [Saque], seu saldo é R$"+(saldo = saldo - valorSolicitado));
    }

    System.out.println("");
    System.out.println("Seu saldo final é R$" +saldo);

    scanner.close();
    }
}

