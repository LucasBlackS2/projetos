package desafios;

import java.util.ArrayList;

public class Musica {
    public static void main(String[] args) {
        System.out.println("\u001B[34mMúsica: 'Ao vivos e a cores ' - Anitta e Matheus & Kauan\u001B[0m");
        System.out.println("\u001B[31mPreparando a música...\u001B[0m");

        // pausa inicial de 3 segundos
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    ArrayList<String> musica = new ArrayList<>();
    musica.add("Por que você não sai daí, e vem aqui");
    musica.add("Pode invadir, pode chegar, pode ficar");
    musica.add("No meu quarto, no meu abraço apertado");
    musica.add("Duvido que cê vai querer ir embora");
    musica.add("Não apavora");
    musica.add("Depois do amor a gente vai fazendo hora");
    musica.add("E eu não aguento mais");
    musica.add("Eu não aguento mais");
    musica.add("Eu não aguento mais");
    musica.add("A tela fria desse celular");
    musica.add("Só ver sua foto não vai me esquentar");
    musica.add("Amar você de longe é tão ruim");
    musica.add("Te quero ao vivo e a cores aqui");
    musica.add("aqui");
        for (String verso : musica) {
            for (int i = 0; i < verso.length(); i++) {
                System.out.print("\u001B[32m"+verso.charAt(i)+"\u001B[0m");
                try {
                    Thread.sleep(120); // ajusta a velocidade da "digitação"
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(); // quebra de linha após cada verso
            try {
                Thread.sleep(1000); // pausa entre versos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


