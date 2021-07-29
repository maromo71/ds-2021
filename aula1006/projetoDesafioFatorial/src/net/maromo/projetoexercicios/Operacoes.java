package net.maromo.projetoexercicios;

public class Operacoes {

    int fatorial(int n){
        if( n == 1) return 1;
        return n * fatorial(n - 1);
    }
}
