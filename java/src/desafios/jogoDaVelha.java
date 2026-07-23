package desafios;

public class jogoDaVelha {
    public static void main(String[] args) {
        int [][] tabuleiro = new int[3][3];
        char jogador = 'X';
        boolean jogoAtivo = true;
        while (jogoAtivo) {
            imprimirTabuleiro(tabuleiro);
            System.out.println("Jogador " + jogador + ", escolha uma posição (linha e coluna): ");
            System.out.println("Digite a linha (0, 1 ou 2): ");
            int linha = new java.util.Scanner(System.in).nextInt();
            System.out.println("Digite a coluna (0, 1 ou 2): ");
            int coluna = new java.util.Scanner(System.in).nextInt();
            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2 || tabuleiro[linha][coluna] != 0) {
                System.out.println("Posição inválida, tente novamente.");
                continue;
            }
            tabuleiro[linha][coluna] = jogador;
            if (verificarVitoria(tabuleiro, jogador)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogador + " venceu!");
                jogoAtivo = false;
            } else if (verificarEmpate(tabuleiro)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("O jogo empatou!");
                jogoAtivo = false;
            } else {
                jogador = (jogador == 'X') ? 'O' : 'X';
            }
        }
    }

    private static boolean verificarEmpate(int[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean verificarVitoria(int[][] tabuleiro, char jogador) {
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == jogador && tabuleiro[i][1] == jogador && tabuleiro[i][2] == jogador) {
                return true;
            }
        }
        // Verificar colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == jogador && tabuleiro[1][j] == jogador && tabuleiro[2][j] == jogador) {
                return true;
            }
        }
        // Verificar diagonais
        if (tabuleiro[0][0] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][2] == jogador) {
            return true;
        }
        if (tabuleiro[0][2] == jogador && tabuleiro[1][1] == jogador && tabuleiro[2][0] == jogador) {
            return true;
        }
        return false;
    }

    private static void imprimirTabuleiro(int[][] tabuleiro) {
        System.out.println( "colunas  0  1  2 "+"\n"+ "linha 0=[0][0][0]" +"\n"+ "linha 1=[0][0][0]"+ "\n"+ "linha 2=[0][0][0]");
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char simbolo = (tabuleiro[i][j] == 0) ? ' ' : (char) tabuleiro[i][j];
                System.out.print("[" + simbolo + "]");
            }
            System.out.println();
        }
    }
}
