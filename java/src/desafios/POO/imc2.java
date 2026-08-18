package desafios.POO;

import desafios.POO.teste.Imc;

public class imc2 {
    public static void main(String[] args) {
        double peso = 72.0; // peso em kg
        double altura = 1.60; // altura em metros

        Imc imc = new Imc(peso, altura);
        double resultadoImc = imc.calcularImc();
        if (resultadoImc <=18.5) {
            System.out.printf("O IMC é: %.2f - Abaixo do peso", resultadoImc);
        } else if (resultadoImc <=25) {
            System.out.printf("O IMC é: %.2f - Peso normal", resultadoImc);
        } else {
            System.out.printf("O IMC é: %.2f - Acima do peso", resultadoImc);
        }
    }
}
