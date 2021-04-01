package br.edu.fatecmm.exemplo_for;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Tabuada do número escolhido pelo usuário");
        System.out.println("Deseja saber a tabuada de qual número: ");
        int tabu = sc.nextInt();
        //repete 10 vezes...
        //devemos usar o comando for
        for (int i = 1; i <= 10; i++) {
            int resultado = tabu * i;
            System.out.println(tabu + " X " + i + " = " + resultado);
        }
    }
}
