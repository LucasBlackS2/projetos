package desafios;

public class OddOrEven {
    //Par ou Ímpar
    //
    //Peça um número ao usuário e diga se ele é par ou ímpar.
    static void main(String[] args) {
        int num = 12;
        int formula = num % 2;

        if (formula == 0) {
            System.out.println(num + " esse numero e par");
        } else {
            System.out.println(num + " esse numero e Impar");
        }
    }
}
