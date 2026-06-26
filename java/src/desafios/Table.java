package desafios;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        //O usuário digita um número e o programa mostra a tabuada dele de 1 a 10.
        Scanner input = new Scanner(System.in);
       System.out.println("Digite Qual Operaçao Desejada: ");
        System.out.println("adição [1]");
        System.out.println("Subtração [2]");
        System.out.println("Divio [3]");
        System.out.println("Multiplication [4]");
        int num1 = input.nextInt();
        System.out.println("digite a 1° numero: ");
        int num2 = input.nextInt();
        System.out.println("Digite a 2° numero: ");
        int num3 = input.nextInt();

        int adiçao = num2 + num3;
        int Subtração = num2 - num3;
        int Multiplication = num2 * num3;
        float Division = (float) num2 / num3;

        if (num1 == 1) {
            System.out.println("a adição dos numeros " + num2 + " + " + num3 + " = " + adiçao);
        } else if (num1 == 2) {
            System.out.println("a Subtração dos numeros " + num2 + " - " + num3 + " = " + Subtração);
        } else if (num1 == 3) {
            System.out.println("a Divio dos numeros " + num2 + " / " + num3 + " = " + Division);
        } else {
            System.out.println("a Divio dos numeros " + num2 + " X " + num3 + " = " + Multiplication);
        }
        System.out.println("deseja ver uma tabela de Multiplication Table? ");
        System.out.println("Sim ou Não?");
        String input1 = input.next();


        if (input1.equals("sim")) {
            System.out.println("digite o multiplicador da Tabela que Voce Escolheu: de 1 a 10");
            //input
            int multiplicador = input.nextInt();
            
                for (int j = 1; j <= 10; j++){
                    System.out.println(multiplicador + "x" + j + " = " + (j * multiplicador));
            }
        } else if (input1.equals("nao")) {
            System.out.println("Agradecemos pelo uso do nosso serviços");

        }

    }
}
