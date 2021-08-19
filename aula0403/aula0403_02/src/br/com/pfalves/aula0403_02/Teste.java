package br.com.pfalves.aula0403_02;

public class Teste {

    /*
    Comentário grandão que passa de uma linha
    tem outra linha
    outra linha
     */
    public static void main(String[] args) {
	    // declarando a variável idade
        int idade = 35;

        int idadeNoAnoQueVem = idade + 1;
        //exibindo na tela o valor da variável idade
        System.out.println(idade);
        System.out.println("com aniversário: " + idadeNoAnoQueVem);

        //redefinindo o valor da variável
        //idade = 35;
        //System.out.println(idade);

        //[ + , - , * , / e o resto %]
        int valor = 2 + 2;
        System.out.println(valor);

        valor = valor - 1;
        System.out.println(valor);

        valor = valor * 2;
        System.out.println(valor);

        valor = valor / 3;
        System.out.println(valor);

        valor = 10 % 3;
        System.out.println(valor);


    }
}
