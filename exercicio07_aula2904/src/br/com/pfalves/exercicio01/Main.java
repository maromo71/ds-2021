package br.com.pfalves.exercicio01;

import java.util.Scanner;

/*
Escreva um programa que, dada uma variável x com algum valor inteiro, temos um
novo x de acordo com a seguinte regra:
se x é par, x = x / 2
se x é impar, x = 3 * x + 1
imprime x
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de X (inteiro): ");
        int x = Integer.parseInt(sc.nextLine());
        while(x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 3 * x + 1;
            }
            System.out.println("Valor do novo X: " + x);
        }
        System.out.println("Acabou");
    }
}
