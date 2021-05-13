package br.com.pfalves.correcao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Digite um valor inteiro e positivo: ");
        num = Integer.parseInt(sc.nextLine());
        for(int i=2; i<=num; i+=2){
            System.out.println(i + "^2 = " + i * i);
        }
    }
}
