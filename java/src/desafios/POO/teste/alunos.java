package desafios.POO.teste;

import desafios.POO.aluno;

public class alunos {
   public static void main(String[] args) {
       // aluno recebeu o "a" como variável e a classe aluno foi instanciada
       // "()"lembrando que parentese e método
    aluno a = new aluno();
    // "a.nome" esta chamando o atributo nome da classe aluno e atribuindo o valor "João" a ele
    a.nome = "João";
    //"a.idade" esta chamando o atributo idade da classe aluno e atribuindo o valor 25 a ele
    a.idade = 25;
    //"a.Sexo" esta chamando o atributo Sexo da classe aluno e atribuindo o valor 'M' a ele
    a.Sexo = 'M';

    System.out.println("Nome: " + a.nome);
    System.out.println("Idade: " + a.idade);
    System.out.println("Sexo: " + a.Sexo);
   }
}
