package ex11_4;

import javax.swing.*;
import java.awt.*;

public class ex11_4 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Calculadora");
        frame.setSize(300, 400);

        JPanel panel = new JPanel(new BorderLayout());
        frame.add(panel);

        JTextField display = new JTextField("0");
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBackground(Color.YELLOW);
        display.setEditable(false);
        display.setPreferredSize(new Dimension(300, 50));
        panel.add(display, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(4, 4, 5, 5));
        
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        JButton button7 = new JButton("7");
        JButton button8 = new JButton("8");
        JButton button9 = new JButton("9");
        JButton buttonsuma = new JButton("+");
        
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");
        JButton button6 = new JButton("6");
        JButton buttonresta = new JButton("-");
        
        JButton button3 = new JButton("3");
        JButton button2 = new JButton("2");
        JButton button1 = new JButton("1");
        JButton buttonMulti = new JButton("x");
        
        JButton button0 = new JButton("0");
        JButton buttonClear = new JButton("C");
        JButton buttonigual = new JButton("=");
        JButton buttonDividir = new JButton("/");

        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonsuma);

        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonresta);

        buttonPanel.add(button3);
        buttonPanel.add(button2);
        buttonPanel.add(button1);
        buttonPanel.add(buttonMulti);

        buttonPanel.add(button0);
        buttonPanel.add(buttonClear);
        buttonPanel.add(buttonigual);
        buttonPanel.add(buttonDividir);

        panel.add(buttonPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
