package desafios.POO.teste;

import org.w3c.dom.ls.LSOutput;

public class DiaOuNoite {
    public boolean isDay;
    public boolean isNight;

    public void imprimir(boolean isDay , boolean isNight){
    this.isDay = isDay;
    this.isNight = isNight;
        System.out.println("É dia: das 6h as 18h " + isDay);
        System.out.println("É noite: das 19h as 5h " + isNight);  }
}