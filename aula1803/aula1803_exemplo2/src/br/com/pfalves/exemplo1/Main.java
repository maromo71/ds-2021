package br.com.pfalves.exemplo1;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int idade = 19;
        char sexo = 'm';
        if(idade < 18 && sexo=='f'){
            System.out.println("Bilheteria Livre para menores");
            System.out.println("A bela adormecida para meninas");
        }else{
            if(idade >= 18){
                System.out.println("Filme permitido. Categoria Adulto");
            }else{
                System.out.println("Não há filme para meninos");
            }

        }
    }
}
