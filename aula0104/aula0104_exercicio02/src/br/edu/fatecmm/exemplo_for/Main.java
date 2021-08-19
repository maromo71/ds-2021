package br.edu.fatecmm.exemplo_for;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 /*
	 * 2.Faça um programa que leia um nome de usuário e a sua senha
	 * e não aceite a senha igual ao nome do usuário, mostrando uma
	 * mensagem de erro e voltando a pedir as informações.
	 * */
        Scanner sc = new Scanner(System.in);
        String nome="";
        String senha="";
        do{
            System.out.println("Digite o nome do usuário: ");
            nome = sc.nextLine();
            System.out.println("Digite a senha do usuário: ");
            senha = sc.nextLine();
        }while(senha.equals(nome));
        System.out.println("Validado");

    }
}
