import javax.print.DocFlavor.STRING;

public class Operadores {
    public static void main(String[] args) {
        // ...................OPERADORES UNARIOS.....................................
        // Incremento
        int numeroIncremental = 1;
            while (++numeroIncremental<=10) {
                System.out.println("numero Incremental "+numeroIncremental);    
            };

        // Decremento 
         int numeroDecremental = 10;
          while (--numeroDecremental >=1) {
            System.out.println("Número decremental "+numeroDecremental);
          }; 
        
        // Negação !
        boolean valorBooleano = true;
        System.out.println("O valor booleano é "+!valorBooleano);
        System.out.println("O valor booleano original permanece: "+ valorBooleano);
        
        // Termario ?:
        // se ? // se não :
        System.out.println("OPERADOR TERNARIO ");
        int a,b;
        a = 5;
        b = 6;

        // usando boolean
        boolean resutlado = a==b ?true :false;
        System.out.println("O RESULTADO É "+resutlado);

        // usando string
        String resultado = a==b ?"true" :"false";
        System.out.println("O RESULTADO É "+resultado);

        // usando long ou int
        long resultadoLong = a==b ?1 :0;
        System.out.println("LONG: O RESULTADO É "+resultado);

        int resultadoInt = a==b ?1 :0;
        System.out.println("INT: O RESULTADO É "+resultado);
          
        // ...................OPERADORES RELACONAIS.....................................
        System.out.println("IGUALDADE (==)");
          String objetoUm = "Filipe";
          String objetoDois = new String("Filipe");
          
          System.out.println(objetoUm.equals(objetoDois));
          // Para comparar a igualdade de dois objetos, usa-se o metódo equals
    

        System.out.println("DIFERENTE (!)");
        System.out.println("MAIOR QUE (>)");
        System.out.println("MENOR QUE (<)");

        // OPERADORES LOGICOS
        // AND (&) OU (||)
        System.out.println("OPERADORES LOGICOS");
            boolean condição1 =true;
            boolean condição2 =false;

            boolean verificaçãoCondicional = condição1==condição2 ?true :false;
            System.out.println("- O valores "+ condição1+ " e "+ condição2+ " são iguais? "+verificaçãoCondicional);


    }

}
