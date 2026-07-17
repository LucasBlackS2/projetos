package desafios;


    public class LoopComPausa {
        public static void main(String[] args) {
            for (int i = 5; i > 0; i--) {
                System.out.println("Contagem: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Fim!");
        }
    }


