package desafios.POO.teste;

public class Imc {
    private double peso;
    private double altura;

    public Imc(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double calcularImc() {
        return peso / (altura * altura);
    }
}
