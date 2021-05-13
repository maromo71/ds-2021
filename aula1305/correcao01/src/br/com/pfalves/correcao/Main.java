package br.com.pfalves.correcao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cont=0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número: ");
            num = Integer.parseInt(sc.nextLine());
            if(num % 2 ==0){
                cont++;
            }
        }
        System.out.println(cont + " valores são pares");
    }
}
