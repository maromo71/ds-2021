package com.company.prjveia.visao;



import com.company.prjveia.modelo.Veia;

import javax.swing.*;
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

    public Veia jogo = new Veia();
    public static int contador = 0;

    public VeiaForm() {
        btNovo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogo = new Veia();
                bt1.setText(" ");
                bt2.setText(" ");
                bt3.setText(" ");
                bt4.setText(" ");
                bt5.setText(" ");
                bt6.setText(" ");
                bt7.setText(" ");
                bt8.setText(" ");
                bt9.setText(" ");
            }
        });
        btSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });

        bt1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogandoNoBotao(0, bt1);
            }
        });
        bt2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogandoNoBotao(1, bt2);
            }
        });
        bt3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogandoNoBotao(2, bt3);
            }
        });
        bt4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogandoNoBotao(3, bt4);
            }
        });
        bt5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogandoNoBotao(4, bt5);
            }
        });
        bt6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogandoNoBotao(5, bt6);
            }
        });
        bt7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogandoNoBotao(6, bt7);
            }
        });
        bt8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogandoNoBotao(7, bt8);
            }
        });
        bt9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jogandoNoBotao(8, bt9);
            }
        });
    }

    private void jogandoNoBotao(int numero, JButton bt) {
        String tabuleiro[][] = jogo.getMatriz();
        int coluna = numero % 3;
        int linha = numero / 3;
        if(tabuleiro[linha][coluna] != " "){
            JOptionPane.showMessageDialog(null,
                    "Proibido jogar nesta casa",
                    "Mensagem",
                    JOptionPane.ERROR_MESSAGE);
            return;// cai fora
        }
        contador++;
        if(contador % 2 == 0){
            jogo.jogar(numero, "X");
            bt.setText("X");
        }else{
            jogo.jogar(numero, "O");
            bt.setText("O");
        }
        String quemVenceu = null;
        quemVenceu = jogo.verVencedor();
        if(quemVenceu != "Não houve vencedor"){
            JOptionPane.showMessageDialog(null,
                    quemVenceu,
                    "Vencedor",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }


    public JPanel getPainelVeia() {
        return PainelVeia;
    }

}
