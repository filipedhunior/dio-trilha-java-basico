public class For_PokedexSysten {
    public static void main(String[] args) {
        // TODO: Sistema para pegar pokemon
        for (int tentativa = 0;tentativa <=3; tentativa++){
            System.out.println("Usuario atira pokebola "+ tentativa +"º vez");
            if (tentativa == 0){
                System.out.println("Usuario pegou o pokemon!");
                tentativa = 3;
            }
        }
        System.out.println("Usuario usou todas as suas tentativas");
    }
}
