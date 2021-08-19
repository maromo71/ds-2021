package net.maromo.exemplo2907;

public class Aluno {
    //atributos
    String rm;
    String nome;
    String turma;
    String email;

    //Métodos (matricular, cancelar matrícula, apresentar os dados na tela)
    void matricular(){
        System.out.println("Aluno " + nome);
        System.out.println("matriculado com sucesso");
    }

    void cancelarMatricula(){
        System.out.println("Aluno " + nome);
        System.out.println("matrícula cancelada");
    }

    void apresentarDados(){
        System.out.println("Dados do aluno: ");
        System.out.println("RM " + rm);
        System.out.println("Nome " + nome);
        System.out.println("Turma " + turma);
        System.out.println("Email " + email);
        System.out.println("----------------------------");
    }


}
