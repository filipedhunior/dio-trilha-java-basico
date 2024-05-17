public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();
        System.out.println("");
        System.out.println("---------SMART TV------------");
        System.out.println("");

        // ESTADO INICIAL
        System.out.println("A TV está ligada? "+ smartTv.estado);
        System.out.println("Canal atual é: "+smartTv.canal);
        System.out.println("Volume atual :"+smartTv.volume);

        System.out.println("");

        // LIGANDO A TV
        smartTv.ligar();
        System.out.println("[Novo status] A TV está ligada? "+ smartTv.estado);

        // ALTERANDO CANAL
        smartTv.subirCanal(); 
        System.out.println("[Novo status] Qual é o canal atual? "+ smartTv.canal); // 2

        smartTv.subirCanal(); 
        smartTv.subirCanal();
        smartTv.subirCanal();  

        smartTv.descerCanal();
        System.out.println("[Novo status] Qual é o canal atual? "+ smartTv.canal);

        // ALTERANDO VOLUME 
        smartTv.diminuirVolume();
        System.out.println("[Novo status] Qual é o VOLUME atual? " +smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        System.out.println("[Novo status] Qual é o VOLUME atual? " +smartTv.volume);

        System.out.println("");
        
        // ESTADO FINAL
        System.out.println("[ESTADO FINAL] A TV está ligada? "+ smartTv.estado);
        System.out.println("[ESTADO FINAL] Canal atual é: "+smartTv.canal);
        System.out.println("[ESTADO FINAL] Volume atual : "+smartTv.volume);

    }
}
