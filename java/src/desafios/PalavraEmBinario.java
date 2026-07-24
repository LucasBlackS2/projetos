package desafios;

import java.util.Scanner;

public class PalavraEmBinario {
    public static void main(String[] args) {
        System.out.println("Digite uma palavra para ver sua representação em binário:");
        Scanner input= new Scanner(System.in);
        String palavra = input.nextLine(); // "Hello";
        StringBuilder binario = new StringBuilder();

        for (char c : palavra.toCharArray()) {
            String bin = Integer.toBinaryString(c);
            while (bin.length() < 8) {
                bin = "0" + bin;
            }
            binario.append(bin).append(" ");
        }
        System.out.println("Palavra: " + palavra);
        System.out.println("Representação em binário: " + binario.toString().trim());
    }
}
