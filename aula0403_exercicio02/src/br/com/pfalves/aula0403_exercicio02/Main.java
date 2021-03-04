package br.com.pfalves.aula0403_exercicio02;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double gastosJaneiro = 15000;
        double gastosFevereiro = 23000;
        double gastosMarco = 17000;

        double gastosTrimestres = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("Gastos do Trimestre: " + gastosTrimestres);

        double mediaTrimestre = gastosTrimestres / 3;

        System.out.println("Média do Trimestre: "+ mediaTrimestre);

    }
}
