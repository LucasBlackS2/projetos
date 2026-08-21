package desafios.POO.teste;

import desafios.POO.Alarme;

public class Alarm2 {
    public static void main(String[] args) {
        Alarme alarme = new Alarme();
        alarme.setHora(7);
        alarme.setMinuto(30);
        alarme.setSegundo(0.0);
        alarme.setAtivo(false);

        System.out.println("Alarme configurado para: " + alarme.getHora() + ":" + alarme.getMinuto() + ":" + alarme.getSegundo());
        System.out.println("Alarme ativo: " + alarme.isAtivo());
    }
}
