package desafios;

import javax.sound.sampled.*;
import javax.swing.*;
import java.util.ArrayList;

public class MusicaSwing {
    public static void main(String[] args) {
        System.out.println("\u001B[34mMúsica: 'Awake And Alive' - Skillet\u001B[0m");
        System.out.println("\u001B[31mPreparando a música...\u001B[0m");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ArrayList<String> musica = new ArrayList<>();
        musica.add("I'm at war with the world and they");
        musica.add("Try to pull me into the dark");
        musica.add("I struggle to find my faith");
        musica.add("As I'm slippin' from Your arms");
        musica.add("");
        musica.add("It's getting harder to stay awake");
        musica.add("And my strength is fading fast");
        musica.add("You breathe into me, at last");
        musica.add("");
        musica.add("I'm awake, I'm alive");
        musica.add("Now I know what I believe inside");
        musica.add("Now it's my time");
        musica.add("I'll do what I want");
        musica.add("'Cause this is my life");
        musica.add("Here (right here)");
        musica.add("Right now (right now)");
        musica.add("I'll stand my ground and never back down");
        musica.add("I know what I believe inside");
        musica.add("I'm awake and I'm alive");

        for (String verso : musica) {
            for (int i = 0; i < verso.length(); i++) {
                System.out.print("\u001B[32m" + verso.charAt(i) + "\u001B[0m");
                try {
                    Thread.sleep(90); // velocidade da digitação
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
            try {
                Thread.sleep(100); // pausa entre versos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
