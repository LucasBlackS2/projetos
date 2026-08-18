package desafios.POO;

import desafios.POO.teste.semaforo;

public class semaforo2 {
    public static void main(String[] args) {
        semaforo s = new semaforo();
        for (int i = 0; i < 2; i++) {
            s.acenderVermelho();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s.acenderAmarelo();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s.acenderVerde();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
