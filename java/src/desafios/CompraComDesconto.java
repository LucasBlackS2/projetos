package desafios;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class CompraComDesconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> itens = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();

        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.println("Digite o nome do item:");
            String item = input.nextLine();
            itens.add(item);

            System.out.println("Digite o preço do item:");
            double preco = input.nextDouble();
            precos.add(preco);

            input.nextLine(); // limpar buffer

            // Mostrar item adicionado
            System.out.println("Item adicionado: " + item + " - R$" + preco);

            System.out.println("Deseja adicionar outro item? (s/n)");
            continuar = input.nextLine();
        }

        // Mostrar lista completa
        System.out.println("\nLista de compras:");
        double valorTotal = 0;
        for (int i = 0; i < itens.size(); i++) {
            System.out.println(itens.get(i) + " - R$" + precos.get(i));
            valorTotal += precos.get(i);
        }
        DecimalFormat fd =new DecimalFormat("0,00");
        System.out.println("\nValor total da compra: R$" + fd.format(valorTotal));
        double desconto = valorTotal * 0.10;
        System.out.println("Desconto de 10%: R$" + fd.format(desconto));
        double valorFinal = valorTotal - desconto;
        System.out.println("Valor final da compra: R$" + fd.format(valorFinal));

        input.close();
    }
}
