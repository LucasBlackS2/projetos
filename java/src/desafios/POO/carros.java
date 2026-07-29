package desafios.POO;

import desafios.POO.teste.carro;

import java.util.Scanner;

public class carros {
    public static void main(String[] args) {
        carro c1 = new carro();
        c1.dono="jose";
        c1.cor = "Preto";
        c1.ano = 2020;
        c1.marca = "Toyota";
        c1.modelo = "Corolla";
        c1.placa = "ABC-1234";
        c1.ligado = true;

        carro c2 = new carro();
        c2.dono = "maria";
        c2.cor = "azul";
        c2.ano=2022;
        c2.marca = "Honda";
        c2.modelo = "Civic";
        c2.placa = "XYZ-5678";
        c2.ligado = true;

        carro c3 = new carro();
        c3.dono = "pedro";
        c3.cor = "vermelho";
        c3.ano = 2026;
        c3.marca = "Ford";
        c3.modelo = "Mustang";
        c3.placa = "LMN-9012";
        c3.ligado = true;

        carro c4 = new carro();
        c4.dono = "ana";
        c4.cor = "branca";
        c4.ano = 2024;
        c4.marca = "Chevrolet";
        c4.modelo = "Camaro";
        c4.placa = "PQR-3456";
        c4.ligado = true;

        carro c5 = new carro();
        c5.dono = "lucas";
        c5.cor = "cinza";
        c5.ano = 2025;
        c5.marca = "BMW";
        c5.modelo = "X5";
        c5.placa = "STU-7890";
        c5.ligado = true;
        //lista de corredores
        carro[] corredores = {c1, c2, c3, c4, c5};
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha um corredor pelo nome (José, Maria, Pedro, Ana, Lucas): ");
        String escolhaUsuario = input.nextLine().toLowerCase();

        // Encontrar o carro escolhido pelo usuário
        carro carroUsuario = null;
        for (carro c : corredores) {
            //"toLowerCase" para ignorar maiúsculas e minúsculas na comparação
            if (c.dono.toLowerCase().equals(escolhaUsuario)) {
                carroUsuario = c;
                System.out.println("Você escolheu: " + carroUsuario.dono+ " Carro:" + carroUsuario.modelo  );
                System.out.println(" ");
                //break para parar o loop quando encontrar o carro do usuário
                break;
            }
        }

        if (carroUsuario == null) {
            System.out.println("Corredor não encontrado!");
            return;
        }

        // Escolha aleatória do computador
        carro carroComputador = corredores[(int) (Math.random() * corredores.length)];
        System.out.println("O computador escolheu: " + carroComputador.dono + " Carro: " + carroComputador.modelo );
        System.out.println(" ");
        // Aceleração aleatória
        // até 200 km/h
        carroUsuario.acelerar = (int) (Math.random() * 200);
        carroComputador.acelerar = (int) (Math.random() * 200);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("3");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("2");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Você escolheu: " + carroUsuario.dono + " com aceleração " + carroUsuario.acelerar + " km/h" +
                " cor: " + carroUsuario.cor + " Marca: " + carroUsuario.marca + " Ano do Carro " + carroUsuario.ano +
                " Placa " + carroUsuario.placa);
        System.out.println(" ");
        System.out.println("O computador escolheu: " + carroComputador.dono +  " com aceleração " + carroComputador.acelerar + " km/h"+
                " cor: " + carroComputador.cor + " Marca: " + carroComputador.marca + " Ano do Carro " + carroComputador.ano +
                " Placa " + carroComputador.placa);

        //usuário vencedor
        if (carroUsuario.acelerar > carroComputador.acelerar) {
            System.out.println("\u001B[32mVocê venceu!\u001B[0m");
            //computador vencedor
        } else if (carroUsuario.acelerar < carroComputador.acelerar) {
            System.out.println("\u001B[32mO computador venceu!\u001B[0m");
            //empate
        } else {
            System.out.println("\u001B[33mEmpate!\u001B[0m");
        }
    }
}