public class BreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <=5; numero ++){
            if(numero == 3)
                continue; // faz com que ele ignore a condição abaixo
            System.out.println(numero);
        }
        System.out.println("A contagem parou!");
    }   

}


