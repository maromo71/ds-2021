package br.com.pfalves.exercicio01;
// Imprima os fatoriais de 1 a 10.
public class Main {

    public static void main(String[] args) {
        int fatorial = 1;
        for (int n = 1; n <=10 ; n++) {
            //Achar os fatorial de (n)
            if(n == 1) {
                System.out.println("Fatorial 1: " + fatorial);
            }else{
                fatorial = 1;
                for (int i = 1; i <= n; i++) {
                    fatorial = fatorial * i;
                }
                System.out.println("Fatorial de " + n + " = " + fatorial);
            }
        }
    }
}
