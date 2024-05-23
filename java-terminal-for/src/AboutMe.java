import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        
        System.out.println("");

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("AboutMe Start");
        System.out.println("- Ola, que bom te ter por aqui! Digite seu primeiro nome por favor");
        String nome = scanner.next();

        System.out.println("");
        System.out.println(" Seu nome é " + nome+ "! Que legal, agora digite seu segundo nome por favor");

        
        String sobrenome = scanner.next();

        
        System.out.println("");
        System.out.println("- "+ nome + ", quantos anos você tem?");
        int idade = scanner.nextInt();

        System.out.println("");
        if (idade>=18) {
            System.out.println("Err, de acordo com meus dados "+ nome +" "+ sobrenome +" você já pode ser preso, mas .... não vamos focar nesses dados");
        }

        System.out.println("");
        System.out.println("- Quanto você mede de altura?");
       
        double altura = scanner.nextDouble();
        

        /* 
        String nome = args [0]; // Permite que o usuario insira dados como argumentos
        String sobrenome = args [1];
        int idade = Integer.valueOf(args[2]);
        double altura = Double.valueOf(args[3]);
        */

        // Imprimindo os valores de entrada no terminal
        System.out.println("");
        System.out.println("------DADOS FORNECIDOS NO TERMINAL------");
        System.out.println("");

        System.out.println("Você se chama: "+nome + " " +sobrenome);
        if (idade >= 18) {
            System.out.println("Tem "+idade +" anos (Já pode ser preso ein!)");
        } else {
            System.out.println("Tem "+ idade + " anos. Incrivelmente um bebe né!");
        }
        if (altura<=1.60) {
            System.out.println("E mede" +" "+ altura + "cm de altura. Um verdadeiro toco!");
        } else if (altura <=1.80) {
            System.out.println("E mede" +" "+ altura + "cm de altura. Golias devia ser seu primo!");
        } else {
            System.out.println("E mede" +" "+ altura + "cm de altura. Me conta depois como é na terra dos Gigantes");
        }
        System.out.println("");

    }
}

