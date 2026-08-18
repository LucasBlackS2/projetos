package desafios.POO;

public class Media {
    public static void main(String[] args) {
        double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5};
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        System.out.println("A média das notas é: " + media);
    }
}
