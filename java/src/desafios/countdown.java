package desafios;

import java.util.Scanner;

public class countdown {
    static void main(String[] args) {
// usuário digita um número e o programa faz uma contagem regressiva até 0.
        Scanner input = new Scanner(System.in);

        System.out.println("digite sua senha:");

        int tentativa = 3;

        while (tentativa > 0) {

            int senha = input.nextInt();

            int cont = --tentativa;
            if (cont == 0) {
                System.out.println("bloqueado por tentativa zeradas");
            }
            if (senha == 1234) {
                System.out.println("senha correta Acesso Autorizado");
            } else if (senha != 1234) {
                System.out.println("senha incorreta " + tentativa + " tentativas ainda");
            }

        }
    }
}
