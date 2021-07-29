package net.maromo.projetoexercicios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número que quer saber o fatorial: ");
        int x = Integer.parseInt(sc.nextLine());

        Operacoes operacao = new Operacoes();
        System.out.println("Fatorial é: " + operacao.fatorial(x));

    }
}
