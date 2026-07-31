package desafios;

import java.util.Scanner;

public class NumeroRomano {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Digite um Numero para a converter em algarismos Romanos 0 a 3000: ");
        int numeros = input.nextInt();
        for (int i = 1; i <=numeros; i++) {
            System.out.println( i+ " = "+toRoman(i));
        }
    }

    public static String toRoman(int numero) {
        // Vetores com valores e símbolos correspondentes
        int[] valores = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] simbolos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < valores.length; i++) {
            while (numero >= valores[i]) {
                numero -= valores[i];
                resultado.append(simbolos[i]);
            }
        }
        return resultado.toString();
    }
}
