package desafios.POO;

public class aluno {
   public String nome;
    public int idade;
    public char Sexo;

    public static class matriz {
        public int [][] criarMatriz(int linhas, int colunas) {
            int[][] matriz = new int[linhas][colunas];
            for (int i = 0; i < linhas; i++) {
                for (int j = 0; j < colunas; j++) {
                    matriz[i][j] = (int) (Math.random() * 100);
                }
            }
            return matriz;
        }
    }
}
