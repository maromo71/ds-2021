package br.com.pfalves.exercicio01;

import java.util.Scanner;

/*
*  (opcional) Imprima a seguinte tabela, usando for s encadeados:
1
2  4
3  6  9
4  8  12  16
n  n*2 n*3 .... n*n
* */
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de n: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=n ; i++) {
            //O Macete é terminar o j onde i tá parado
            for (int j = 1; j <=i ; j++) {
                System.out.print(j * i + " ");
            }
            System.out.println();
        }
    }
}
