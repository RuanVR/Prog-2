package exercicio06;

import javax.swing.*;
import java.awt.*;

public class TelaJFrame {
    public static void main(String[] args) {
        JFrame Tela = new JFrame("Minha tela");

        JLabel label1 = new JLabel("Nome: ");
        JTextField texto1 = new JTextField();

        JLabel label2 = new JLabel("Telefone: ");
        JTextField texto2 = new JTextField();

        JButton button = new JButton("OK");

        Tela.setLayout(new GridLayout(1, 1));
        Tela.add(label1);
        Tela.add(texto1);
        Tela.add(label2);
        Tela.add(texto2);
        Tela.add(new JLabel());
        Tela.add(button);
        
        Tela.pack();
        Tela.setVisible(true);
    }
}
