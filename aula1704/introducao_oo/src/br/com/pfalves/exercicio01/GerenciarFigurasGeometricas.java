package br.com.pfalves.exercicio01;

import java.util.Scanner;

public class GerenciarFigurasGeometricas {

    public static void main(String[] args) {
	    Esfera esferaDaDuda = new Esfera();
	    Esfera esferaDoRodrigo = new Esfera();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio da esfera da Duda..");
        esferaDaDuda.raio = Double.parseDouble(sc.nextLine());
        System.out.println("Digite o valor do raio da esfera do Rodrigo..");
        esferaDoRodrigo.raio = Double.parseDouble(sc.nextLine());

        System.out.println("Área da esfera da Duda: " + esferaDaDuda.calcularArea());
        System.out.println("Volume da esfera da Duda: " + esferaDaDuda.calcularVolume());

        System.out.println("Área da esfera do Rodrigo: " + esferaDoRodrigo.calcularArea());
        System.out.println("Volume da esfera do Rodrigo: " + esferaDoRodrigo.calcularVolume());
    }
}
