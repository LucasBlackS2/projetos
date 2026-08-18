package desafios.POO.teste;

public class semaforo {
    public String vermelho;
    public String amarelo;
    public String verde;

    public semaforo() {
        this.vermelho = "vermelho";
        this.amarelo = "amarelo";
        this.verde = "verde";
    }
    public void acenderVermelho() {
        System.out.println("O semáforo está \u001B[31mvermelho. Pare!\u001B[0m");
    }
    public void acenderAmarelo() {
        System.out.println("O semáforo está \u001B[33mamarelo. Atenção!\u001B[0m");
}
    public void acenderVerde() {
        System.out.println("O semáforo está \u001B[32mverde. Pode passar!\u001B[0m");
    }
}