package net.maromo.projetocontagrafico;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CaixaGUI {
    private JPanel panelCaixa;
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton btnDepositar;
    private JButton btnSacar;
    private JButton btnConsultar;
    private JButton btnSair;
    private JTextArea txtMensagem;

    //Agregagação - da classe Caixa
    Caixa caixa = new Caixa();

    //Tem que fazer um get do painel principal
    public JPanel getPanelCaixa() {
        return panelCaixa;
    }

    public CaixaGUI() {
        btnSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Fim do Programa",
                        "Sair do Programa",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });
        btnConsultar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                txtSaldo.setText(Double.toString(caixa.getSaldo()));
            }
        });
        btnDepositar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                if(caixa.depositar(valor)){
                    JOptionPane.showMessageDialog(null,
                            "Depósito efetuado com sucesso",
                            "Saldo alterado",
                            JOptionPane.INFORMATION_MESSAGE);
                    txtMensagem.append("Depósito de " + valor + " efetuado \n");
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Valor inválido para depósito",
                            "Saldo NÃO alterado",
                            JOptionPane.ERROR_MESSAGE);
                }
                txtValor.setText("");
            }
        });
        btnSacar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                if(caixa.sacar(valor)){
                    JOptionPane.showMessageDialog(null,
                            "Saque efetuado com sucesso",
                            "Saldo alterado",
                            JOptionPane.INFORMATION_MESSAGE);
                    txtMensagem.append("Saque de " + valor + " efetuado \n");
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Saldo insuficiente para saque",
                            "Saldo NÃO alterado",
                            JOptionPane.ERROR_MESSAGE);
                }
                txtValor.setText("");
            }
        });
    }
}
