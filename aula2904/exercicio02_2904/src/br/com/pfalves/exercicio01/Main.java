package br.com.pfalves.exercicio01;
//somatória 1 + 2 + 3 + 4 + ........... + 1000
public class Main {

    public static void main(String[] args) {
	    long somatoria = 0;
        for (int i = 1; i <=1000 ; i++) {
            somatoria = somatoria + i;
        }
        System.out.println("Somatória dos valores de 1 a 1000");
        System.out.println("Resultado: " + somatoria);
    }
}
