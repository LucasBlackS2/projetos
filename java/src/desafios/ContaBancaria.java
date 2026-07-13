package desafios;
import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> agencia = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();

        for(int  i=0; i<2; i++){

            System.out.println("Olar Seja Bem-Vindo");

            System.out.println("Digite Seu Nome:");
            String nome = input.nextLine();
            name.add(nome);
            System.out.println("Digite o Numero da Sua Agencia:");
            int numeroConta = input.nextInt();
            agencia.add(numeroConta);

            System.out.println("agora selecioner uma Opçao " + "\n" + "[1] para Conta Corrente" + "\n" + "[2] para conta poupança" + "\n" + "[3] para conta salário");
            int escolha = input.nextInt();

            if (escolha == 1 && name.get(0).equals("lucas") || name.get(0).equals("Luan")) {
                System.out.println("Você escolheu Conta Corrente");
                System.out.println("digite o numero da conta:");
                int conta = input.nextInt();
                list.add(conta);
                System.out.println(name.get(0) + " Seu Saldo é de R$ 1000,00 ");
            }
            else if (escolha == 2 && name.get(0).equals("lucas") || name.get(0).equals("Luan")) {System.out.println("Você escolheu Conta Poupança");
                System.out.println("digite o numero da conta:");
                int conta = input.nextInt();
                list.add(conta);
                System.out.println(name.get(0) + " Seu Saldo é de R$ 1000,00 ");
            }
            else if (escolha == 3 && name.get(0).equals("lucas") || name.get(0).equals("Luan")) {
                System.out.println("Você escolheu Conta Salário");
                System.out.println("digite o numero da conta:");
                int conta = input.nextInt();
                list.add(conta);
                System.out.println(name.get(0) + " Seu Saldo é de R$ 1000,00 ");
            }
            else {
                System.out.println("Dados incorretos Você não tem acesso a essa conta");
            }
            System.out.println("agencia e:" + agencia + " Numero da Conta:" + list + " Nome:" + name);
            input.nextLine();
        }}}