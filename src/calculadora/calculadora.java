package calculadora;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class calculadora {

	public static void main(String[] args) {

		
	
		JFrame frame = new JFrame("Calculadora");
		JPanel panel = (JPanel) frame.getContentPane();
		
		
		//pantallacalc
		JTextField pantalla = new JTextField("0");
		panel.add(pantalla, BorderLayout.NORTH);
		
		
		//botons
		JPanel botons = new JPanel();
		
		JButton boto1 = new JButton("1");
		JButton boto2 = new JButton("2");
		JButton boto3 = new JButton("3");
		JButton boto4 = new JButton("4");
		JButton boto5 = new JButton("5");
		JButton boto6 = new JButton("6");
		JButton boto7 = new JButton("7");
		JButton boto8 = new JButton("8");
		JButton boto9 = new JButton("9");
		JButton botomas = new JButton("+");
		JButton botomenos = new JButton("-");
		JButton botodividir = new JButton("/");
		JButton botox = new JButton("x");
		JButton botoAC = new JButton("AC");
		JButton boto0 = new JButton("0");
		JButton botoigual = new JButton("=");

		botons.add(boto9);
		botons.add(boto8);
		botons.add(botodividir);
		botons.add(boto7);
		botons.add(boto6);
		botons.add(botox);
		botons.add(boto5);
		botons.add(boto4);
		botons.add(botomas);
		botons.add(boto3);
		botons.add(boto2);
		botons.add(botomenos);
		botons.add(boto1);
		botons.add(boto0);
		botons.add(botoAC);
		botons.add(botoigual);
		
		panel.add(botons, BorderLayout.CENTER);
		
		//vista
		pantalla.setSize(200, 110);
		frame.setSize(170, 250);
		frame.setVisible(true);

	}

}
