package desafios.POO;

public class matriz2 {
    public static void main(String[] args) {
        int linhas = 3;
        int colunas = 3;
        int[][] matriz = criarMatriz(linhas, colunas);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    /*TODO
    O Método para criar a matriz com valores aleatórios
    O método criarMatriz recebe o número de linhas e colunas como parâmetros e retorna uma matriz preenchida com números aleatórios de 1 a 60
    O método criarMatriz é privado e estático, pois não precisa ser acessado fora da classe e não depende de uma instância da classe para ser chamado
    O método criarMatriz utiliza a classe Math para gerar números aleatórios e o operador de casting para converter o resultado para int
    O método criarMatriz utiliza dois loops for para percorrer cada elemento da matriz e atribuir um valor aleatório a ele
    O método criarMatriz retorna a matriz preenchida ao final
        */

    private static int[][] criarMatriz(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = (int) (Math.random() * 60 + 1); // Preenche a matriz com números aleatórios de 1 a 60
            }
        }
        return matriz;
    }
}
