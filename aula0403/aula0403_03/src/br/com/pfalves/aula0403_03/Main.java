package br.com.pfalves.aula0403_03;

public class Main {

    public static void main(String[] args) {
	// números reais
        double salario = 2345.66;

        float areaCircunferencia = 123.7787651f; //pulo do gato 'f' no final do float

        //salario aumentado em 10%

        //salario = salario + (salario * 0.10);
        salario+= salario * 0.10;

        System.out.printf("novo salario: %6.2f \n", salario);

    }
}
