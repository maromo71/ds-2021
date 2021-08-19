package br.edu.fatecmm.aula0104_while;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;
        do {
			String cardapio = "";
			cardapio += "Escolha sua opção\n";
			cardapio += "1.. Big Mac\n";
			cardapio += "2.. Mac Frango\n";
			cardapio += "3.. Kit coca cola\n";
			cardapio += "9.. Sair do programa\n";
			cardapio += "Sua opção: ";
			System.out.println(cardapio);
			opcao = entrada.nextInt();
			switch (opcao){
				case 1:
					System.out.println("Seu pedido é Big Mac, pague R$ 14,00");
					break;
				case 2:
					System.out.println("Seu pedido é Mac Frango, pague R$ 13,00");
					break;
				case 3:
					System.out.println("Seu pedido é Kit coca cola, pague R$ 5,00");
					break;
				case 9:
					System.out.println("Fim do programa");
					break;
				default:
					System.out.println("Opção inválida");
			}
		}while(opcao != 9); //teste no final, se for verdade, repete o laço
    }
}
