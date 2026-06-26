package desafios;

import java.util.Scanner;

public class somatoria {
    public static void main(String[] args) {
        /*O usuário digita um número e o programa soma todos os números de 1 até ele.
        Exemplo: se digitar 5 → resultado 15 (1+2+3+4+5).*/
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero ");
        int num1 = input.nextInt();
        int fomula = num1*(num1+1)/2;
    System.out.println(fomula);
}


        }
