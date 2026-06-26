package desafios;

import java.util.Scanner;

public class LargestofThreeNumbers {
    static void main(String[] args) {
        //Leia três números e mostre qual é o maior.
        
        Scanner input = new Scanner(System.in);
        System.out.println("digite um numero para saber qual dos 3 números e o maior: ");
        System.out.println("digite o 1° numero: ");
        int num1 = input.nextInt();
        System.out.println("digite o 2° numero: ");
        int num2 = input.nextInt();
        System.out.println("digite o 3° numero: ");
        int num3 = input.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("o numero maior e " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("o numero maior e" + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("o numero maior e " + num3);
        } else if (num1 == num2 && num1 == num3 || num2 == num1 && num2 == num3 || num3 == num1 && num3 == num2) {
            System.out.println(" números Repetidos ");
        }
    }
}