package net.maromo.controleBancario;

public class Main {

    public static void main(String[] args) {
        //Criar duas contas. Depositar, sacar e mostrar
        //o saldo destas consulta.
        Conta conta1, conta2;
        //conta1 e conta2 são os objetos que vamos manipular
        conta1 = new Conta();
        //Conta 1 é do Rodrigo
        conta1.numero = 12;
        conta1.nomeCliente = "Rodrigo";
        conta1.telefone = "9090-9090";
        conta2 = new Conta();
        //A conta 2 é do Maromo
        conta2.numero = 14;
        conta2.nomeCliente = "Maromo";
        conta2.telefone = "9191-9191";
        conta1.depositar(500);
        conta2.depositar(600);

        //Ver os saldos
        System.out.println("Saldo da conta1: " + conta1.mostrarSaldo());
        System.out.println("Saldo da conta2: " + conta2.mostrarSaldo());
        //Mostrar os dados da conta
        conta1.mostrarDados();
        conta2.mostrarDados();
    }

}
