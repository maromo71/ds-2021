package br.com.pfalves.correcao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        int numLinhas;
        System.out.println("Digite o valor máximo de linhas: ");
        numLinhas = Integer.parseInt(sc.nextLine());
        int x = 0;
        do {
                x++;
                if(x % 4 ==0){
                    System.out.println("PUM");
                }else {
                    System.out.print(x + " ");
                }
        }while(x < numLinhas * 4);
    }
}
