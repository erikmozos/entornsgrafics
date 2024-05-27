package borderLayout;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ex11 {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Finestra");
		JPanel panel = (JPanel) frame.getContentPane();
		JPanel centre = new JPanel();
		
		JButton boto1 = new JButton("Boto1 pagestart");
		JButton boto3 = new JButton("Boto3 linestart");
		JButton boto4 = new JButton("Boto4 pageend");
		JButton boto5 = new JButton("Boto5 lineend");
		JButton centre1 = new JButton("centre1");
		JButton centre2 = new JButton("centre2");
		JButton centre3 = new JButton("centre3");
		JButton centre4 = new JButton("centre4");
		JButton centre5 = new JButton("centre5");
		
		centre.add(centre1);
		centre.add(centre2);
		centre.add(centre3);
		centre.add(centre4);
		centre.add(centre5);
		
		panel.add(centre, BorderLayout.CENTER);
		panel.add(boto1, BorderLayout.PAGE_START);
		panel.add(boto3, BorderLayout.LINE_START);
		panel.add(boto4, BorderLayout.PAGE_END);
		panel.add(boto5, BorderLayout.LINE_END);
		
		frame.setSize(340, 250);
		frame.setVisible(true);
	}

}
