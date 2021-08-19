package br.com.pfalves.exercicio01;

public class Esfera {
    //Definir os atributos (características)
    double raio;

    //Definir os métodos (comportamento do objeto)
    double calcularArea(){
        return Math.PI * (raio * raio);
    }

    double calcularVolume(){
        return 4.0/3.0 * Math.PI * (raio * raio * raio);
    }
}
