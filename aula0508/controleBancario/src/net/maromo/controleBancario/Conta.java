package net.maromo.controleBancario;

public class Conta {
    //Definir atributos
    //Visibilidade (publica, privada, protegida)
    public int numero;
    public String nomeCliente;
    public String telefone;
    private double saldo;

    //Criar os métodos
    public void sacar(double valor){
        //saldo = saldo - valor;
        saldo -= valor;
    }
    public void depositar(double valor){
        //saldo = saldo + valor;
        saldo += valor;
    }
    public double mostrarSaldo(){
        return saldo;
    }
    public void mostrarDados(){
        System.out.println("Dados da Conta");
        System.out.println("Núm: " + numero);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Telefone: " + telefone);
        System.out.println();
    }
}
//O que falta para a semana que vem neste projeto
//usar construtores e encapsular usando os métodos
//gets e sets