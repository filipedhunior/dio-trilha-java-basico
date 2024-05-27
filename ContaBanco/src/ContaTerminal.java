// Importando Scanner para o programa
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("");
        System.out.println("----------------CONTA TERMINAL JAVA----------------");
        System.out.println("");
        System.out.println("Ola, eu sou a AIJ: a Assistente Interativa Java e vou estar conduzindo seu acesso a sua conta bancaria");

        AtributosConta atributos = new AtributosConta();

        // Testando os atributos no terminal
        // System.out.println("");
        // System.out.println("[NOME CLIENTE] "+atributos.NomeCliente);
        // System.out.println("[AGENCIA] "+atributos.Agencia);
        // System.out.println("[NÚMERO] "+atributos.Número);
        // System.out.println("[SALDO] "+atributos.Saldo);

        Scanner scanner = new Scanner(System.in);

        // Criando os textos para auxiliar na solicitação de informações do programa ao usuario
        System.out.println("");
        System.out.println("[AIT: Assistente Interativa Java]");
        System.out.println("Por favor, digite seu nome completo");
        System.out.println("");
        System.out.println("[USUARIO]");
        String nomeCliente = scanner.nextLine();

        System.out.println("");
        System.out.println("[AIJ: Assistente Interativa Java]");
        System.out.println(nomeCliente+" digite sua agencia abaixo no formato de três digitos separando o ultimo valor por traço. Ex: 000-0");
        System.out.println("");
        System.out.println("[" +nomeCliente+"]");
        String agencia = scanner.nextLine();
        
        System.out.println("");
        System.out.println("[AIJ: Assistente Interativa Java]");
        System.out.println("Agora digite o numero da sua conta usando somente números e sem espaços");
        System.out.println("");
        System.out.println("[" +nomeCliente+"]");
        int numero = scanner.nextInt();

       
        System.out.println("");
        System.out.println("Carregando suas informações de conta, aguarde...");

        // Exibição das informações de forma formatada
        System.out.println("");
        double saldo = atributos.Saldo;
        System.out.println("Olá "+nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia +", conta "+ numero+" e seu saldo de R$"+saldo +" já está disponível para saque.");

        System.out.println("");
        
        // Loop para chamar o programa novamente
  
        // Adicionando ações a conta
        /*
        System.out.println("[AIJ: Assistente Interativa Java]");
        System.out.println("Deseja realizar saque ou deposito de conta. Digite a opção desejada abaixo");
        String ações = scanner.nextLine();

        if (ações = "deposito") {
            System.out.println("Digite o valor do deposito abaixo!");
            double deposito = scanner.nextDouble();
            System.out.println(saldo=saldo+deposito);
        } else if (ações = "saque") {
            double saque = scanner.nextDouble();
            System.out.println(saldo=saldo-saque);
        }
        System.out.println("Apos a transação, o saldo atual é "+saldo);
        System.out.println("");
        
         */
        scanner.close();
    }
}
