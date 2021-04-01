package br.edu.fatecmm.aula0104_exercicio24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Faça um programa que calcule o mostre a média aritmética de N notas.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade alunos");
        int N = Integer.parseInt(sc.nextLine());
        double somatoria = 0;
        for (int i = 1; i <= N; i++) {
            double nota;
            do{
                System.out.println("Digite a nota do aluno  " + i);
                nota = Double.parseDouble(sc.nextLine());
            }while(nota < 0 || nota > 10);
            somatoria = somatoria + nota;
        }
        double media = somatoria / N;
        System.out.println("A média: " + media);

    }
}
