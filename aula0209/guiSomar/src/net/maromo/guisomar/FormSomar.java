package net.maromo.guisomar;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormSomar {
    private JTextField textNumero1;
    private JTextField textNumero2;
    private JButton buttonSomar;
    private JTextField textResultado;
    private JButton buttonLimpar;
    private JPanel panelSomar;

    public JPanel getPanelSomar() {
        return panelSomar;
    }



    public FormSomar() {
        buttonSomar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int num1, num2;
                num1 = Integer.parseInt(textNumero1.getText());
                num2 = Integer.parseInt(textNumero2.getText());
                int soma = num1 + num2;
                textResultado.setText(Integer.toString(soma));
            }
        });
        buttonLimpar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textNumero1.setText("");
                textNumero2.setText("");
                textResultado.setText("");
                textNumero1.requestFocus(); //colocar o foco no controle
            }
        });
    }
}
