package com.company.prjveia;


import com.company.prjveia.visao.VeiaForm;

import javax.swing.*;

public class GerenciarJogo {

    public static void main(String[] args) {
	    //Inicializar o formulário do jogo
        JFrame tela = new JFrame("Jogo da Véia");
        tela.setContentPane(new VeiaForm().getPainelVeia());
        tela.setSize(350,500);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setLocation(500,500);
        tela.setVisible(true);
    }
}
