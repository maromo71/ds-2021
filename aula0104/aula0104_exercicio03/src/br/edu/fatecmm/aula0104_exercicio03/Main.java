package br.edu.fatecmm.aula0104_exercicio03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /**
         * 3.Faça um programa que leia e valide as seguintes informações:
         * a.Nome: maior que 3 caracteres;
         * b.Idade: entre 0 e 150;
         * c.Salário: maior que zero;
         * d.Sexo: 'f' ou 'm';
         * e.Estado Civil: 's', 'c', 'v', 'd';
         */
        Scanner sc = new Scanner(System.in);
        String nome="";
        int idade=0;
        double salario=0;
        char sexo= 'x';
        char estadoCivil;
        //validar o nome
        do {
            System.out.println("Digite nome: [mínimo tres caracteres] ");
            nome = sc.nextLine();
        }while(nome.length() < 3);
        do{
            System.out.println("Digite a idade: [entre 0 e 150] ");
            idade = Integer.parseInt(sc.nextLine());
        }while(idade<0 || idade>150);
        do{
            System.out.println("Digite o salário da pessoa: [maior que zero] ");
            salario = Double.parseDouble(sc.nextLine());
        }while(salario<=0);
        do{
            System.out.println("Digite 'f' feminino ou 'm' masculino");
            sexo = sc.nextLine().charAt(0);
        }while(!(sexo=='f' || sexo=='m'));
        do{
            System.out.println("Digite estado civil [s, c, v, d]");
            estadoCivil = sc.nextLine().charAt(0);
        }while(!(estadoCivil=='s'
                || estadoCivil=='c'
                || estadoCivil=='v'
                || estadoCivil=='d'));

    }
}
