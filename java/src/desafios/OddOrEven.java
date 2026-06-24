package desafios;

import java.sql.SQLOutput;

public class OddOrEven {
    public static void main(String[] args) {
        int num =12;
        int formula = num%2;

        if (formula == 0){
            System.out.println(num +" esse numero e par");
        }
        else {
            System.out.println(num +" esse numero e Impar");
        }
    }
}
