package br.com.pfalves.exemplo1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	    //Extrair o horario de agora
        Date hoje = new Date();
        int hora = hoje.getHours();
        if(hora < 12) {
            if(hora < 8){
                System.out.println("Bom dia e tome o seu café");
            }else{
                System.out.println("Bom dia, aguarde o almoço");
            }
        }else{
            if(hora < 18){
                System.out.println("Boa tarde");
            }else{
                System.out.println("Boa noite");
            }
        }
    }
}
