package br.com.pfalves.exercicio01;
// Exercício 01
// Imprima todos os números de 150 a 300
public class Main {

    public static void main(String[] args) {
	    //Normalmente usamos o for, quando sabemos o número de
        //vezes que vai repetir
        System.out.println("Aqui com o for");
        for (int i = 150; i <=300 ; i++) {
            System.out.println(i);
        }

        System.out.println();
        System.out.println("Aqui com o while");
        int contador = 150;
        while(contador <= 300){
            System.out.println(contador);
            contador++;
        }
    }
}
