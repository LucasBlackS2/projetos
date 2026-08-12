package desafios.POO;

import desafios.POO.teste.DiaOuNoite;

public class DayOrNight {
    public static void main(String[] args) {
        DiaOuNoite DN = new DiaOuNoite();
        DN.isDay = true;
        DN.isNight = false;
        if (DN.isDay) {
            DN.imprimir(true , false);
        } else if (DN.isNight) {
            DN.imprimir(false, true);
        } else {
            DN.imprimir(false, false);
        }
    }}
