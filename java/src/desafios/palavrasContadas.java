package desafios;

import java.util.Scanner;

public class palavrasContadas {
    public static void main(String[] args) {
        /* TODO
        O usuário digita o nome de um time e o programa mostra a quantidade de letras do nome do time.
        Exemplo: "Flamengo" → 8 letras.
        Dica: use String.length().*/
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o nome do time: ");
        String time = input.nextLine();
        System.out.println("O time " + time + " tem " + time.length() + " letras.");
    }
}
