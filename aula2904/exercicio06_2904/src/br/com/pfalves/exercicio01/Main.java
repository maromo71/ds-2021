package br.com.pfalves.exercicio01;
//Sequencia de Fibonacci até passar de 100.

public class Main {

    public static void main(String[] args) {
        int prox = 0;
	    int pri = 0;
        System.out.println("1. => 0");
	    int seg = 1;
        System.out.println("2. => 1");
        int cont = 3;
	    while(prox < 100){
            prox = pri + seg;
            System.out.println(cont + ". => " + prox);
            pri = seg;
            seg = prox;
            cont++;
        }
    }
}
