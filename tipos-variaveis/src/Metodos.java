public class Metodos {
    public static void main(String[] args) {
        // EXERCICIO
        // CLASSE PARA REPRESENTAR UMA SMART TV
        // ATRIBUTOS: ESTADO (BOOLEAN), CANAL (INT) E VOLUME (INT)

        System.out.println("SMART TV");

        // ESTADO TV
        boolean estadoTV = true;
            boolean estadoTvLigada = true;
            boolean estadoTvDesligada = false;

           if (estadoTvLigada = estadoTV){
            System.out.println("A Tv esta ligada");
           }
           else {
            System.out.println("A tv esta desligada");
           }
            
        
        // CANAL TV
        int canalTV = 1;
            System.out.println("Este é o canal "+canalTV);
        
            int subirCanal = canalTV++;
                if (canalTV <=50){
                    System.out.println("Você subiu para o canal "+ subirCanal);
                }
            
            int descerCanal = canalTV--;
                if(canalTV <=50){
                    System.out.println("Você desceu para o canal "+ descerCanal);
                }
        
        // VOLUME TV
        int volumeTV = 10;
            System.out.println("O volume é "+volumeTV);

            int aumentarVolumeTV = volumeTV+1;
                if (volumeTV <= 50) {
                System.out.println("O volume foi aumentado para "+aumentarVolumeTV);
            };
            
            int diminuirVolumeTV = volumeTV-1;
                if (volumeTV <= 50) {
                System.out.println("O volume foi diminuido para "+diminuirVolumeTV);

            };

    }
}
