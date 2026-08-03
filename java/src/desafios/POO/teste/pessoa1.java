package desafios.POO.teste;

import desafios.POO.pessoa;

public class pessoa1 {
    public static void main(String[] args) {
        pessoa p;
        p=new pessoa();
        p.cpf= 11111;
        p.nome="Adal";
        p.sexo='M';

       pessoa p2=new pessoa();
        p2.cpf=11112;
        p2.nome="Eva";
        p2.sexo='F';

        if (p.validarCPF(p.cpf)==true);
        p.imprimiNome();

        System.out.println("------------------");

        try {Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (p2.validarCPF(p2.cpf)==true);
        p2.imprimiNome();
    }
}
