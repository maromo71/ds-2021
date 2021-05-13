package br.com.pfalves.correcao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int x, y;
	    int soma = 0;
        System.out.println("Digite um valor para X: ");
        x = Integer.parseInt(sc.nextLine());
        System.out.println("Digite um valor para Y: ");
        y = Integer.parseInt(sc.nextLine());
        int maior, menor;
        if (x < y){
            menor = x;
            maior = y;
        }else{
            menor = y;
            maior = x;
        }
        for (int i = menor; i <= maior; i++) {
            if(i % 13 != 0){
                soma +=  i; //soma = soma + i  (equivalente)
            }
        }
        System.out.println(soma);
    }
}
