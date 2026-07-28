package desafios.POO.teste;

import desafios.POO.Professor;

public class professores {
    public static void main(String[] args) {
        // professor recebeu o "p" como variável e a classe professor foi instanciada
        // "()"lembrando que parentese e método
        Professor p = new Professor();
        // "p.nome" esta chamando o atributo nome da classe professor e atribuindo o valor "Maria" a ele
        p.nome = "Maria";
        //"p.idade" esta chamando o atributo idade da classe professor e atribuindo o valor 30 a ele
        p.idade = 30;
        //"p.sexo" esta chamando o atributo sexo da classe professor e atribuindo o valor 'F' a ele
        p.sexo = 'F';
        //"p.matricula" esta chamando o atributo matricula da classe professor e atribuindo o valor 12345 a ele
        p.matricula = 1;
        //"p.curso" esta chamando o atributo curso da classe professor e atribuindo o valor "Matemática" a ele
        p.curso = "Matemática";

        System.out.println("Nome: " + p.nome);
        System.out.println("Idade: " + p.idade);
        System.out.println("Sexo: " + p.sexo);
        System.out.println("Matrícula: " + p.matricula);
        System.out.println("Curso: " + p.curso);
        System.out.println("__________________________________________________");
        Professor p2 = new Professor();
        p2.nome = "José";
        p2.idade = 45;
        p2.sexo = 'M';
        p2.matricula = 2;
        p2.curso = "Física";

        System.out.println("Nome: " + p2.nome);
        System.out.println("Idade: " + p2.idade);
        System.out.println("Sexo: " + p2.sexo);
        System.out.println("Matrícula: " + p2.matricula);
        System.out.println("Curso: " + p2.curso);
    }
}
