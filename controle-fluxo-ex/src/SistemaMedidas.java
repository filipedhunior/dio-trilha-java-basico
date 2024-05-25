import java.util.Scanner;

public class SistemaMedidas {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual é o tamanho que você veste?");
        String tamanho = scanner.nextLine(); 

        switch (tamanho) {
            case "P":
                System.out.println("Seu tamanho é PEQUENO");
                break;
            case "p":
                System.out.println("Seu tamanho é PEQUENO"); 
                break;
            case "M":
                System.out.println("Seu tamanho é MEDIO");
                break;
            case "G": 
                System.out.println("Seu tamanho é GRANDE");
                break;
            default: 
                System.out.println("Esse tamanho é invalido");
                break;
        }
    scanner.close();
    }
}
