package net.maromo.projetocontagrafico;

public class Caixa {
    private double saldo;

    public boolean sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean depositar(double valor){
        if(valor < 0){
            return false;
        }
        saldo += valor;
        return true;
    }

    public double getSaldo() {
        return saldo;
    }
}
