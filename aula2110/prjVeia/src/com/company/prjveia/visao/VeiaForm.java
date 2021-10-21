package com.company.prjveia.visao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VeiaForm {
    private JPanel PainelVeia;
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt7;
    private JButton bt8;
    private JButton bt9;
    private JButton btNovo;
    private JButton btSair;

    public VeiaForm() {
        btNovo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                bt1.setText("");
                bt2.setText("");
                bt3.setText("");
                bt4.setText("");
                bt5.setText("");
                bt6.setText("");
                bt7.setText("");
                bt8.setText("");
                bt9.setText("");
            }
        });
        btSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }



    public JPanel getPainelVeia() {
        return PainelVeia;
    }

}
