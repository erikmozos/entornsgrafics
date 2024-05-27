package dissenyfinestra11_2;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class finestra {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Finestra");
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new FlowLayout());
		
		JLabel counter = new JLabel("Counter:");
		JLabel step = new JLabel("Step:");
		
		JTextField text = new JTextField("0",5);
		
		JRadioButton Up = new JRadioButton("Up");
		JRadioButton Down = new JRadioButton("Down");
		JButton Count = new JButton("Count");
		JComboBox combox = new JComboBox();
		combox.addItem("1");
		combox.addItem("2");
		combox.addItem("3");
		combox.addItem("4");
		combox.addItem("5");

		ButtonGroup grupdebotons = new ButtonGroup();
		
		grupdebotons.add(Up);
		grupdebotons.add(Down);
			
		
		panel.add(counter);
		panel.add(text);
		panel.add(Up);
		panel.add(Down);
		panel.add(step);
		panel.add(combox);
		panel.add(Count);
			
		frame.setSize(450, 100);
		frame.setVisible(true);
		
	}

}
