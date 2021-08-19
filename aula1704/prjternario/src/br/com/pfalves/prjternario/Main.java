package br.com.pfalves.prjternario;

public class Main {

    public static void main(String[] args) {
	    // O chefe vai dar aumento de salario de acordo com a tabela abaixo:
        // para mulheres --> 9% de aumento sobre o salario
        // para homens --> 8% de aumento sobre o salario
        double salario = 1000;
        double novoSalario;
        char sexo = 'f';
        /* if(sexo == 'f'){
            novoSalario = salario * 1.09;
        }else{
            novoSalario = salario * 1.08;
        } */

        novoSalario = sexo == 'f' ? salario * 1.09 : salario * 1.08;
        System.out.println("Seu novo salario: " + novoSalario);
    }
}
