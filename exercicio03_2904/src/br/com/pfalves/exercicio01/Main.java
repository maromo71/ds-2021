package br.com.pfalves.exercicio01;
// Imprima todos os múltiplos de 3, entre 1 e 100.
public class Main {

    public static void main(String[] args) {
        //jeito comum
        int passeiNoLaco = 0;
        for (int i = 3; i <= 100 ; i+= 3) {
            System.out.println(i);
            passeiNoLaco++;
        }
        System.out.println("Passei no laco: " + passeiNoLaco + " vezes");
        System.out.println("Tradicional");
        passeiNoLaco = 0;
        for (int i = 1; i <= 100 ; i++) {
            if(i % 3 == 0) {
                System.out.println(i);
            }
            passeiNoLaco++;
        }
        System.out.println("Passei no laco: " + passeiNoLaco + " vezes");
    }
}
