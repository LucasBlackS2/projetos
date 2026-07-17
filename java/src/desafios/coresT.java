package desafios;

import java.util.ArrayList;

public class coresT {
        // Cores so vam de 30 a 38 consecutivamente começando do preto e acabando no branco.
        // o branco e padrao do terminal.
        public static final String RESET = "\u001B[0m";
        public static final String PRETO = "\u001B[30m";
        public static final String VERMELHO = "\u001B[31m";
        public static final String VERDE = "\u001B[32m";
        public static final String AMARELO = "\u001B[33m";
        public static final String AZUL = "\u001B[34m";
        public static final String ROXO = "\u001B[35m";
        public static final String CIANO = "\u001B[36m";
        public static final String CINZA = "\u001B[37m";
        public static final String BRANCO = "\u001B[38m";

        //Esse e um texte para ver as cores.
        public static void main(String[] args) {
                ArrayList<String> cores = new ArrayList<>();
                cores.add(PRETO);
                cores.add(VERMELHO);
                cores.add(VERDE);
                cores.add(AMARELO);
                cores.add(AZUL);
                cores.add(ROXO);
                cores.add(CIANO);
                cores.add(CINZA);
                cores.add(BRANCO);
                for (int i = 0; i < cores.size(); i++) {
                        System.out.println(cores.get(i) + "3"+i +" Este texto é da cor!" + RESET);
                                //pausa para manter 
                        try {
                                Thread.sleep(500); // Mantém o programa em execução por 0.5 segundos
                        } catch (InterruptedException e) {
                                e.printStackTrace();
                        }
                }
                 //utilizar "for" para não criar tantos print.
               for (String cor : cores) {
                        System.out.println(cor + "Este texto é da cor!" + RESET);
                        }
                        // pode ser colocar cores dessa maneira tambem
                        System.out.println("\u001B[33mEste texto é amarelo\u001B[0m");

                        //colocando a cor no inicio do texto e colocando como cor padrão no final do texto.
                        // e sim precisa esta conectado ao texto para funcionar.
                }
        }
