package desafios.POO;

import desafios.POO.teste.carro;

public class carros {
    public static void main(String[] args) {
        carro c = new carro();
        c.dono="jose";
        c.cor = "Preto";
        c.ano = 2020;
        c.marca = "Toyota";
        c.modelo = "Corolla";
        c.placa = "ABC-1234";
        c.ligado = true;
        System.out.println("Donos: " + c.dono);
        System.out.println("Cor: " + c.cor);
        System.out.println("Ano: " + c.ano);
        System.out.println("Marca: " + c.marca);
        System.out.println("Modelo: " + c.modelo);
        System.out.println("Placa: " + c.placa);
        c.acelerar=101;

        if (c.ligado== true)
        {for (int i=0;i<c.acelerar;i++){
        System.out.println("carro Ligado: velocidade esta a " + i + " H/r");
        }} else {
            System.out.println("carro Desligado: " );
    }
        carro c2 = new carro();
        c2.dono = "maria";
        c2.cor = "azul";
        c2.ano=2022;
        c2.marca = "Honda";
        c2.modelo = "Civic";
        c2.placa = "XYZ-5678";
        c2.ligado = false;
        c2.acelerar = 101;
        if (c2.ligado== true)
        {for (int i=0;i<c2.acelerar;i++){
        System.out.println("carro Ligado: velocidade esta a " + i + " H/r");
        }} else {
            System.out.println("carro Desligado: " );
    }
}}