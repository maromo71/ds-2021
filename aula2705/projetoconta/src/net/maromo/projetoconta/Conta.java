package net.maromo.projetoconta;

public class Conta {
    //Atributos da classe. (propriedades)
    int numero;
    String titular;
    double saldo;
    double limite;

    //Métodos da classe. (Funcionalidades)
    void depositar(double valor){
        saldo += valor;
    }

    boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;

    }

    boolean transferirValor(Conta contaDestino, double valor){
        if(valor <= saldo){
            contaDestino.saldo += valor;
            saldo -= valor;
            return true;
        }
        return false;
    }
    double getSaldo(){
        return saldo;
    }

    void apresentarDadosDaConta(){
        System.out.println("---------------------------------------");
        System.out.println("Dados da conta bancária");
        System.out.println("Número da conta: " + numero);
        System.out.println("Titular da conta: " + titular);
        System.out.println("Saldo atual da conta: " + saldo);
        System.out.println("Limite da conta: " + limite);
        System.out.println("---------------------------------------");
    }

}
