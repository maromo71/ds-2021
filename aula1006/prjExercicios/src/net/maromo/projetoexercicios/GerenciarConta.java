package net.maromo.projetoexercicios;

public class GerenciarConta {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 1;
        c1.agencia = "Mogi Mirim";
        c1.nomeTitular = "Danilo";
        c1.saldo = 100;
        c1.dataAbertura = "11/02/2021";

        Conta c2 = new Conta();
        c2.numero = 2;
        c2.agencia = "Mogi Guaçu";
        c2.nomeTitular = "Danilo";
        c2.saldo = 50;
        c2.dataAbertura = "10/03/2021";

        if (c1 == c2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }



        System.out.println(c1.recuperarDadosParaImpressao());
        System.out.println(c2.recuperarDadosParaImpressao());
    }
}
