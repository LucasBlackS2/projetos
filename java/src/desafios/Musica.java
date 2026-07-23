package desafios;

import javax.swing.*;
import java.util.ArrayList;

public class Musica {
    public static void main(String[] args) {
        System.out.println("\u001B[34mMúsica: 'Awake And Alive' - Skillet\u001B[0m");
        System.out.println("\u001B[31mPreparando a música...\u001B[0m");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    ArrayList<String> musica = new ArrayList<>();
    musica.add("");
        for (String verso : musica) {
            for (int i = 0; i < verso.length(); i++) {
                
                System.out.print("\u001B[32m"+verso.charAt(i)+"\u001B[0m");
                try {
                    Thread.sleep(90); // ajusta a velocidade da "digitação"
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(); // quebra de linha após cada verso
            try {
                Thread.sleep(100); // pausa entre versos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


