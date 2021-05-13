package br.com.pfalves.correcao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.println("Digite um valor inteiro: ");
        valor = Integer.parseInt(sc.nextLine());
        if(valor == 0) {
            System.out.println("Entre com um valor maior que zero..");
            return;
        }
        valor = valor < 0 ? valor * -1 : valor;
        for (int i = 1; i <=valor ; i += 2) {
            System.out.println(i);
        }
    }
}
