package net.maromo.prjestacionamento;

public class Carro {
    //Atributos
    public int idCarro;
    public String nomeCarro;
    public String marca;
    public String proprietario;
    private int velocidade; //  <--------
    //Métodos - representam as funcionalidades
    public void acelerar(int quantidadeDeAceleracao) {
        System.out.println("Acelerando o carro: " + nomeCarro);
        velocidade = velocidade + quantidadeDeAceleracao;//  <--------
        System.out.println("Sua nova velocidade é: ");//  <--------
        System.out.println(velocidade + " Kms / hora");//  <--------
    }
    public void estacionar() {
        System.out.println("Estacionando na vaga pública");
        velocidade = 0;//  <--------
    }
    public void parar() {
        System.out.println("Parando o carro: " + nomeCarro);
        velocidade = 0;//  <--------
    }
    public void mostrarSituacaoDoCarro(){//  <--------
        System.out.println("Identificação do Carro: " + idCarro);
        System.out.println("Nome do Carro: " + nomeCarro);
        System.out.println("Marca: " + marca);
        System.out.println("Proprietário do Carro: " + proprietario);
        System.out.println("Velocidade Atual: " + velocidade);
    }
}
