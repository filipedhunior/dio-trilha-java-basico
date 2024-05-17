public class Usuario {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("---------------BANCO DE DADOS----------------");      
        System.out.println("");
        System.out.println("DADOS INICIAIS");
        
        // CRIANDO UM NOVO OBJETO E IMPRIMINDO OS VALORES PADRÃO NO TERMINAL
        BancoDeDados bancoDeDados = new BancoDeDados();
        
        System.out.println("[NOME COMPLETO]       "+bancoDeDados.nomeCompleto);
        System.out.println("[IDADE]               "+bancoDeDados.idade);
        System.out.println("[DATA DE NASCIMENTO]  "+bancoDeDados.dataDeNasc);
        System.out.println("[SEXO]                "+ bancoDeDados.sexo);
        System.out.println("[BIOGRAFIA]           "+ bancoDeDados.biografia );

        System.out.println(" ");

        // MODIFICANDO O OBJETO
        System.out.println("---------------MODIFICANDO O OBJETO----------");
        System.out.println(" ");
        bancoDeDados.receberNome("Rukia Kuchiki");
        bancoDeDados.receberIdade(20);
        bancoDeDados.receberSexo("FEMININO");
        bancoDeDados.receberDataNasc("15/05/1756");
        bancoDeDados.receberBiografia("Capitã das treze divisões de Guardas da Corte, Membra da Casa de Kuchiki, Detentora da mais Bela Zampakutou de todo o Sereitei");

       
}


}
