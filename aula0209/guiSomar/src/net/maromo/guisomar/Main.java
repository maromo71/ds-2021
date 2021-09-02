package net.maromo.guisomar;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	    //Instanciar um novo objeto que entenda janela.
        JFrame tela = new JFrame();

        tela.setContentPane(new FormSomar().getPanelSomar());
        tela.setTitle("Efetuar Soma");
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setSize(300,250);
        tela.setLocation(400, 200);
        tela.setVisible(true);
    }
}
