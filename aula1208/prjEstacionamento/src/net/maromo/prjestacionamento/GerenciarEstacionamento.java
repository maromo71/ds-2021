package net.maromo.prjestacionamento;

public class GerenciarEstacionamento {

    public static void main(String[] args) {
	    //Objetivo: Criar dois objetos do tipo carro
        //um deles é do Maromo e o outro é Rodrigo.
        Carro carroDoRodrigo, carroDoMaromo;
        carroDoRodrigo = new Carro();
        carroDoMaromo = new Carro();
        //alimentou os dados na memória - Carro do Rodrigo
        carroDoRodrigo.idCarro = 1;
        carroDoRodrigo.marca = "Honda";
        carroDoRodrigo.nomeCarro = "Civic";
        carroDoRodrigo.proprietario = "Prof. Rodrigo";
        //dados do carro do Maromo
        carroDoMaromo.idCarro = 2;
        carroDoMaromo.marca = "Citroen";
        carroDoMaromo.nomeCarro = "C3";
        carroDoMaromo.proprietario = "Prof. Maromo";
        //Colocar ações apenas para o carro do Rodrigo
        carroDoRodrigo.acelerar(30);//  <--------
        carroDoRodrigo.acelerar(20);//  <--------
        carroDoRodrigo.mostrarSituacaoDoCarro(); //  <--------
        carroDoRodrigo.estacionar();
        carroDoRodrigo.parar();
        //Mostrar os dados do Carro do Rodrigo
        carroDoRodrigo.mostrarSituacaoDoCarro(); //  <--------
    }
}
