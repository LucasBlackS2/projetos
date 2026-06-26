package desafios;

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        //O usuário digita uma palavra e o programa mostra ela invertida.
        //
        //Exemplo: "Lucas" → "sacuL".
        //
        //Dica: use StringBuilder.reverse().

        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String Nome=input.nextLine();
        StringBuilder builder=new StringBuilder();
        builder.append(Nome);
        builder.reverse();

        if (Nome.equals(builder.toString()))
        {
            System.out.println("o nome " + Nome +" e um palíndromo " + builder.toString());
        }
        else {

            System.out.println("o nome " + Nome +" e um nome comum " + builder.toString());
        }
    }
}
