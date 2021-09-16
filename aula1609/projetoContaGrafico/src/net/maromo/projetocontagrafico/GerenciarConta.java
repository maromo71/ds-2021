package net.maromo.projetocontagrafico;

import javax.swing.*;

public class GerenciarConta {

    public static void main(String[] args) {
	    //Código para abrir a tela
        JFrame tela = new JFrame();
        tela.setContentPane(new CaixaGUI().getPanelCaixa());
        tela.setSize(400,400);
        tela.setLocation(200,200);
        tela.setTitle("Controle de Caixa");
        tela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        tela.setVisible(true);

    }
}
