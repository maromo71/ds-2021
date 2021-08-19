package br.com.pfalves.aula0403_04;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean estaChecado = false;
        boolean ehCasado = false;
        boolean ehAluno = false;
        boolean estaMatriculado = false;

        System.out.println("Está checado: " + estaChecado);
        estaChecado = true;
        System.out.println("Está checado: " + estaChecado);

        //variaveis do tipo caraceteres
        char letra = 67;
        System.out.println("Letra é:   " + letra);

        for (int i = 65; i < 91 ; i++) {
            System.out.println((char) i);
        }

        char letra2 = 'B';
        System.out.println("Letra é:   " + letra2);
    }
}
