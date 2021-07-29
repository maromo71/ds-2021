package net.maromo.projetoexercicios;

public class Conta {
    String nomeTitular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    void sacar(double valor){
        saldo = saldo - valor;
    }

    void depositar(double valor){
        saldo = saldo + valor;
    }

    double calcularRendimento(){
        return saldo * 0.1;
    }

    String recuperarDadosParaImpressao(){
        String  resposta = "===================================" + "\n";
        resposta += "Dados da Conta: " + numero + "\n";
        resposta += "Cliente: " + nomeTitular + "\n";
        resposta += "Agência: " + agencia + "\n";
        resposta += "Data de Abertura: " + dataAbertura + "\n";
        resposta += "Saldo Atual: " + saldo + "\n";
        resposta += "===================================" + "\n";
        return resposta;
    }

}
