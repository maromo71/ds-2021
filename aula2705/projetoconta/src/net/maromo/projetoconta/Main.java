package net.maromo.projetoconta;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    //Realizar a sequencia de passos 2. (anotacoes.txt)
        Conta conta1, conta2, conta3; //Defini três objetos (mas não foram criados ainda)
        //Para ocupar um espaço de memória, eu preciso instanciar


        conta1 = new Conta();
        conta2 = new Conta();
        conta3 = new Conta();

        //Preciso passar dados para essas contas
        //Definir manualmente esses dados
        conta1.numero = 1001;
        conta1.titular = "Maria Eduarda";
        conta1.limite = 1000.0;

        conta2.numero = 2002;
        conta2.titular = "Rodrigo Martins";
        conta2.limite = 5000.0;

        conta3.numero = 3003;
        conta3.titular = "Fernando Dionísio";
        conta3.limite = 2000.0;

        conta1.depositar(1500);
        conta1.depositar(300);
        conta2.depositar(600);
        conta3.depositar(1000);
        boolean sacou = conta3.sacar(500);

        if(sacou){
            JOptionPane.showMessageDialog(null,
                    "Saque efetuado com sucesso na conta 3",
                    "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null,
                    "Sem saldo na conta 3",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

        sacou = conta1.sacar(5000);
        if(sacou){
            JOptionPane.showMessageDialog(null,
                    "Saque efetuado com sucesso na conta 1",
                    "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null,
                    "Sem saldo na conta 1",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }

        //Transferindo dinheiro da conta da duda para a conta do rodrigo
        boolean transferiu = conta1.transferirValor(conta2, 500);
        if(transferiu){
            JOptionPane.showMessageDialog(null,
                    "Transferência realizada com sucesso",
                    "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);

        }else{
            JOptionPane.showMessageDialog(null,
                    "Sem saldo para transferência",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
        conta1.apresentarDadosDaConta();
        conta2.apresentarDadosDaConta();
        conta3.apresentarDadosDaConta();




    }
}
