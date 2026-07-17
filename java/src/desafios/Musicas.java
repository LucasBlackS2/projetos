package desafios;

public class Musicas {
    public static void main(String[] args) {
        String verso = "Por que você não sai daí,\ne vem aqui";

        for (int i = 0; i < verso.length(); i++) {
            System.out.print(verso.charAt(i)); // imprime letra sem pular linha
            try {
                Thread.sleep(120); // pausa de 120ms entre cada letra
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(); // quebra de linha no final
    }
}
