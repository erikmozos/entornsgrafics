package ex11_5;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ex11_5 {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        JTextArea cajaTexto = new JTextArea("Area texto");
        GridBagConstraints constraints = new GridBagConstraints();
        JPanel panel = new JPanel(new GridBagLayout());
        frame.setContentPane(panel);
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        constraints.gridx =1;
        constraints.gridy = 1;
        constraints.gridwidth = 2;
        constraints.gridheight = 2;
        
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1.0;
        panel.add(cajaTexto, constraints);
        constraints.weighty = 0.0;

        
        
        
        JButton boton1 = new JButton("Boton 1");
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 0;

        constraints.anchor = GridBagConstraints.NORTH;

        constraints.fill = GridBagConstraints.NONE;
        panel.add(boton1, constraints);

        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weighty = 0.0;

        
        
        JButton boton2 = new JButton("Boton 2");
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0;

        panel.add(boton2, constraints);

        constraints.weighty = 0.0;
        constraints.anchor = GridBagConstraints.CENTER;

        
        
        
        JButton boton3 = new JButton("Boton 3");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        panel.add(boton3, constraints);

        
        
        
        JButton boton4 = new JButton("Boton 4");
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.anchor = GridBagConstraints.NORTH;

        panel.add(boton4, constraints);

        
        
        
        JTextField campoTexto = new JTextField("Campo texto");
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 0;
        constraints.fill = GridBagConstraints.BOTH;

        panel.add(campoTexto, constraints);

        frame.setVisible(true);

    }

}
