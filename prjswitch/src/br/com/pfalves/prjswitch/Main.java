package br.com.pfalves.prjswitch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    //cardapio
        //1.. Coca cola
        //2.. Fanta
        //3.. Guarará
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu pedido: ");
        int pedido = input.nextInt();
        switch (pedido){
            case 1:
                System.out.println("Pediu coca cola - R$ 2,00");
                break;
            case 2:
                System.out.println("Pediu fanta - R$ 2,00");
                break;
            case 3:
                System.out.println("Pediu Guaraná - R$ 1,80");
                break;
            default:
                System.out.println("Opcao invalida");
        }
    }
}
