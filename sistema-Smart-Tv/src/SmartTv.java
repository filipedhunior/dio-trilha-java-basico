import java.lang.annotation.Retention;

import javax.print.DocFlavor.READER;

public class SmartTv {
    boolean estado = false;
    int canal = 1;
    int volume = 10;

    // Alterar estado da Tv
    public String ligar (){
    estado = true;
        return "ligada";
    }

    public String desligar (){
    estado = false;
        return "desligada";
    }

    // Alterar canais da Tv
    public void subirCanal(){
    canal = canal+1; 
    System.out.println("-INCREMENTO de CANAL para "+ canal);
    }

    public void descerCanal(){
    canal = canal-1;
    System.out.println("-DECREMENTO de CANAL para "+ canal);
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    // Alterar volume da tv
    public void aumentarVolume(){
    volume = ++volume;
    System.out.println("-AUMENTO de VOLUME para "+ volume);
    }

    public void diminuirVolume(){
    volume = --volume;
    System.out.println("-DIMINUIÇÃO de VOLUME para "+ volume);

    }
}