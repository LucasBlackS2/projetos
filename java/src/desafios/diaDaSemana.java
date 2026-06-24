package desafios;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class diaDaSemana {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");

        int hoje =5;
        int dias = 25460;

        int qualDiaSera=(hoje + dias) % 7;
        System.out.println("Hoje: "+hoje);
        System.out.println("Dias: "+dias);
        String [] diasSemana={
            "Domingo", "Segunda", "terça","Quarta","Quinta","Sexta","Sabado"
        };
        System.out.println("se hoje e " + diasSemana[hoje] + " daqui a " + dias + " o dias sera " + diasSemana[qualDiaSera]  );
        }

    }
