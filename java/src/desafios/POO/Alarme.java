package desafios.POO;

public class Alarme {
    public int hora;
    public int minuto;
    public double segundo;
    public boolean ativo;
    
    public int getMinuto() {
        return minuto;
    }

    public int getHora() {
        return hora;
    }

    public double getSegundo() {
        return segundo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public void setSegundo(double segundo) {
        this.segundo = segundo;
    }
}
