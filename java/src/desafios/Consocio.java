package desafios;

import java.util.Scanner;

public class Consocio {
    public static void main(String[] args) {

        // crie um progama onde o usuario tera que escolher o carro
        //ver valor do carro;
        //ver em quantas pacerlas o carro pode ser dividida.
        //aumento anual das pacelas.
        // Fiat (Argo, Strada), Volkswagen (Polo, T-Cross),
        // Chevrolet (Onix), Hyundai (HB20, Creta) e Toyota
        //entrada para fica mas barata
        Scanner input = new Scanner(System.in);

        System.out.println("Olá, gostaria de conferir os carros disponíveis? (sim/não)");
        String decisao = input.nextLine();

        if (decisao.equalsIgnoreCase("sim")) {
            System.out.println("Escolha uma marca:");
            System.out.println("1 - Fiat");
            System.out.println("2 - Volkswagen");
            System.out.println("3 - Chevrolet");
            System.out.println("4 - Hyundai");
            System.out.println("5 - Toyota");

            int escolha = input.nextInt();
            input.nextLine(); // consome o \n

            if (escolha == 1) {
                System.out.println("Fiat:");
                System.out.println("1 - Argo");
                System.out.println("2 - Strada");

                int carroFiat = input.nextInt();
                input.nextLine(); // consome o \n

                if (carroFiat == 1) {
                    double valorArgo = 107000.00f;
                    System.out.println("Valor do Argo 2026: R$ " + valorArgo);
                    System.out.println("Gostaria de ver como ficaria o parcelamento? (sim/não)");
                    String resp = input.nextLine();
                    if (resp.equalsIgnoreCase("sim")) {
                        for (int x = 1; x <= 60; x++) {
                            double parcela = valorArgo / x;
                            if (parcela <= 2500) {
                                System.out.println("Até " + x + " parcelas de R$ " + parcela);
                            }
                        }
                    }
                } else if (carroFiat == 2) {
                    double valorStrada = 150000.00f;
                    System.out.println("Valor do Strada 2026: R$ " + valorStrada);
                    System.out.println("Gostaria de ver como ficaria o parcelamento? (sim/não)");

                    String resp = input.nextLine();
                    if (resp.equalsIgnoreCase("sim")) {
                        for (int x = 1; x <= 60; x++) {
                            double parcela = valorStrada / x;
                            if (parcela <= 2500) {
                                System.out.println("Até " + x + " parcelas de R$ " + parcela);
                            }
                        }
                    }
                }
            }
        }}}