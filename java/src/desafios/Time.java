package desafios;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class Time {
           public static void main(String[] args) {
               Timer timer = new Timer();

               TimerTask tarefa = new TimerTask() {
                   @Override
                   public void run() {
                       //a tarefa ao ser executada, pega a hora atual e imprime no console
                   LocalTime agora = LocalTime.now();

                       System.out.println("Hora atual: " + agora.getHour() + ":" + agora.getMinute());
                   }
               };
               // Executa a tarefa após 1 segundo, e depois a cada 1 minuto
               timer.schedule(tarefa, 1000 ,60000);


               }
        }


