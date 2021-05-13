package br.com.pfalves.correcao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n, soma = 0;
        System.out.println("Digite um número: ");
        n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n / 2 ; i++) {
            if(n % i == 0) soma+= i;
        }
        if(soma==n){
            System.out.println(n + " é perfeito");
        }else{
            System.out.println("Não é perfeito");
        }
    }
}
