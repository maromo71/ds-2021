package br.com.pfalves.correcao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int tent = 0;
	    int senha = 0;
	    do {
            System.out.println("Digite a senha numérica de 04 dígitos: ");
            senha = Integer.parseInt(sc.nextLine());
            tent++;
            if(senha != 2022) System.out.println("Senha inválida");
        }while(senha != 2022 && tent < 3);
        if (senha==2022){
            System.out.println("Acesso permitido");
        }else{
            System.out.println("Número máximo de tentativas permitidas esgotado");
        }
    }
    // && --> e lógico,    || -->  ou lógico
}
