package br.edu.fatecmm.aula0104_exercicio03;

public class Main {
/*
4.Supondo que a população de um país A seja da ordem de 80000
habitantes com uma taxa anual de crescimento de 3% e que a
população de B seja 200000 habitantes com uma taxa de
crescimento de 1.5%. Faça um programa que calcule e escreva
o número de anos necessários para que a população do país A
ultrapasse ou iguale a população do país B,
mantidas as taxas de crescimento.
* */
    public static void main(String[] args) {
        double populacaoPaisA = 80000;
        double taxaCrescA = 0.03;
        double populacaoPaisB = 200000;
        double taxaCrescB = 0.015;
        int anos = 0;
        while(populacaoPaisA < populacaoPaisB){
            populacaoPaisA =  populacaoPaisA + (populacaoPaisA * taxaCrescA);
            populacaoPaisB =  populacaoPaisB + (populacaoPaisB * taxaCrescB);
            anos++;
            System.out.println("Populacao depois de " + anos + " anos ");
            System.out.println("Populacao de A: " + (long)populacaoPaisA);
            System.out.println("Populacao de B: " + (long)populacaoPaisB);
        }
        System.out.println("Quantidade de anos necessária: " + anos);
        System.out.println("Populacao depois de " + anos + " anos ");
        System.out.println("Populacao de A: " + (long)populacaoPaisA);
        System.out.println("Populacao de B: " + (long)populacaoPaisB);
    }
}
