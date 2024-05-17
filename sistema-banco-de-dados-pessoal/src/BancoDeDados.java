import javax.print.DocFlavor.STRING;

public class BancoDeDados {
    // ATRIBUTOS
    String nomeCompleto = {"Filipe Dhunior"};
    int idade = 19;
    String dataDeNasc = "01/01/2000";
   //  String sexo = "";
    String sexo = "Masculino"; 
    String biografia = "Aluno dedicado, espirituoso e amoroso";

    // RECEBE OS NOMES
    public void receberNome (String novoUsuario){
        nomeCompleto = novoUsuario;
        System.out.println("[SISTEMA] O NOME CADASTRADO É "+ nomeCompleto);
    }
    
    public void receberIdade (int novaIdade){
        idade = novaIdade;
        System.out.println("[SISTEMA] A IDADE É "+ idade);

    }
    
    // RECEBE O SEXO
    public void receberSexo (String novoSexo){
            sexo = novoSexo; 
            System.out.println("[SISTEMA] O SEXO É "+ sexo);
    }
    
    // RECEBE A DATA DE NASCIMENTO
    public void receberDataNasc (String novaDataNascimento){
        dataDeNasc = novaDataNascimento;
        System.out.println("[SISTEMA] NASCEU EM "+ dataDeNasc);
    }

    // RECEBE BIOGRAFIA
    public void receberBiografia (String novaBio){
        biografia = novaBio;
        System.out.println("[SISTEMA] BIOGRAFIA ");
        System.out.println(biografia);
        System.out.println(" ");
    }

}
    // public char Sexo(char SexoMasculino || SexoFeminino){
    //     switch (Sexo= 'M') {
    //         case SexoMasculino:
    //             return Sexo = SexoMasculino;
    //             break;
        
    //         default: 
    //             return Sexo = SexoMasculino
    //             break;
    //     }
    