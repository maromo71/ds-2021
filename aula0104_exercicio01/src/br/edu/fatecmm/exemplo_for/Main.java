package br.edu.fatecmm.exemplo_for;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*
	1.Faça um programa que peça uma nota, entre zero e dez. Mostre
	uma mensagem caso o valor seja inválido e continue pedindo
	até que o usuário informe um valor válido.
	* */
        Scanner sc = new Scanner(System.in);
        double nota;
        do{
            System.out.println("Digite a nota: ");
            nota = sc.nextDouble();
        }while((nota<0) || (nota>10));
        //continuar o teu programa se a nota for válida
        System.out.println("Nota: " + nota);
    }
}
