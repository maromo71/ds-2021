package br.edu.fatecmm.aula0104_while;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        //enquanto condição for verdadeira, repete o laco
        while(idade < 20){
            System.out.println("Fez aniversário");
            idade++;
            System.out.println("Idade agora: " + idade);
        }
        System.out.println("Fim do programa ");

    }
}
