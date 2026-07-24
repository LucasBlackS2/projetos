package desafios;

import java.util.Random;
import java.util.Scanner;

public class jogoPedraPapelTesoura {
    public static void main(String[] args) {
        // Criando os objetos pedra ,papel e tesoura
        String pedra = "pedra";
        String papel = "papel";
        String tesoura = "tesoura";
        //lista de opções de jogada
        String[] opcoes = {pedra, papel, tesoura};
        Scanner scanner = new Scanner(System.in);
        for (int i =0; i <3; i++){
        System.out.println("Escolha uma opção: Pedra, Papel ou Tesoura");
        String escolhaUsuario = scanner.nextLine().toLowerCase();
        //Math.random ele escolher aleatoriamente um numero ou item na lista
        //convertendo a escolha do computador em string e pegando um item aleatorio da lista de opções
        String escolhaComputador = opcoes[(int) (Math.random() * opcoes.length)];
        System.out.println("Rodada " + (i + 1) + ":");
        System.out.println("Você escolheu: " + escolhaUsuario);
        System.out.println("O computador escolheu: " + escolhaComputador);

        //condições de vitoria, empate e derrota
        if (escolhaUsuario.equals(escolhaComputador)) {
            System.out.println("Empate!");
                //se eu escolher pedra e o computador escolher tesoura
        } else if ((escolhaUsuario.equals(pedra) && escolhaComputador.equals(tesoura)) ||
                //se eu escolher papel e o computador escolher pedra
                (escolhaUsuario.equals(papel) && escolhaComputador.equals(pedra)) ||
                //se eu escolher tesoura e o computador escolher papel
                (escolhaUsuario.equals(tesoura) && escolhaComputador.equals(papel))) {

            System.out.println("Você venceu!");

        } else {
            System.out.println("O computador venceu!");
        }

    }}}