public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("TIPOS E VARIAVEIS");
        tiposJava(args);
    }

    public static void tiposJava (String[] args){
        System.out.println("Aqui veremos sobre Tipos");

        // usada para texto 
            // String 
        
        // usada para números inteiros
        System.out.println("NÚMEROS INTEIROS"); 
        System.out.println("LEMBRETE: Números são considerados quebras de valores e não unidades");
            // byte 
            // ate 128 múmeros 
                System.out.println("-BYTE");
                    System.out.println("O Byte pode ter ate 128 valores armazenados");
                    byte menorByte = 1;
                    byte maiorByte = 127;
                    byte menorByteNegativo = -1;
                    byte maiorByteNegativo = -127;

                    byte debugTeste = 1+2+3+4;
                        System.out.println(debugTeste);
                    // byte exceçãoByte = 128; 
                    // byte exceçãoByteNegativo = -128; 
                    // essa parte do codigo não sera executada devido ao linite do byte em relação a quantidade de valores que ele suporta. 

                    System.out.println("Esse é o MENOR valor suportado dentro da tipagem byte do Java "+menorByte);
                    System.out.println("Esse é o menor valor NEGATIVO suportado dentro da tipagem byte do java "+menorByteNegativo);
                    System.out.println("Esse é o MAIOR valor suportado dentro da tipagem byte do Java "+maiorByte);
                    System.out.println("Esse é o maior valor NEGATIVO suportado dentro da tipagem byte do java "+maiorByteNegativo);

            // short 
                System.out.println("-SHORT");
                    System.out.println("O short pode ter ate 32.767 (16 bits) valores armazenados");
                    short menorShort = 1;
                    short maiorShort = 32767;
                    short menorShortNegativo = -1;
                    short maiorShortNegativo = -32767;

                    System.out.println("Os maiores e menores valores do SHORT são respectivamente "+ menorShort +" e " +maiorShort);
                    System.out.println("Os maiores e menores valores negativos do SHORT é respectivamente "+ menorShortNegativo +" e "+ maiorShortNegativo);

            // int 
                System.out.println("-INT");
                    System.out.println("O int pode ter ate 32 bits valores armazenados");
                    int []menorIntInteiro = {1, 6400};
                    
                    System.out.println(menorIntInteiro); 
                    
                    
            // long 

        // usada para números fracionarios
        System.out.println("NÚMEROS FRACIONARIOS");   
            // float
            // double
        
                }

            
}


