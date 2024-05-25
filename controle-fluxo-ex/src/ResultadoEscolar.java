import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        AtributosResultadoEscolar atributosResultadoEscolar = new AtributosResultadoEscolar();

        System.out.println("");
        System.out.println("SGNE: SISTEMA DE GESTÃO DE NOTAS ESCOLAR");
        System.out.println("Digite abaixo a nota do aluno. Se for um valor quebrado, use virgula em vez de ponto");
        double nota = scanner.nextDouble();

        if (nota == 6) {
            System.out.println("[APROVADO] O aluno ficou com a pontuação "+nota +" na media esperada");
        } else if (nota ==5.9) { 
            System.out.println("[APROVADO] O aluno ficou com a pontuação "+nota+" arredondada para a media esperada "+(nota=nota+0.1));
        } else if (nota >6 && nota <10) {
            System.out.println("[APROVADO] O aluno ficou com a pontuação "+ nota+ " ACIMA da media esperada");
        } else if (nota >10) {
            System.out.println("#ERRO: O valor da nota não pode exceder a 10. Arredondando para "+(nota=10));
        } else {System.out.println("[REPROVADO] O aluno ficou com a pontuação "+ nota+ " ABAIXO da media esperada"); }

        System.out.println("");
        scanner.close();
    }
}

