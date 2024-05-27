package democardlayout;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class democardlayout {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Instituts");
		JPanel panel = (JPanel) frame.getContentPane();
		
		JPanel cards = new JPanel();
		cards.setLayout(new CardLayout());
		
		JPanel panelAlumne = new JPanel();
		panelAlumne.add(new JLabel("Panell de l'alumne"));
		
		JPanel panelProfessor = new JPanel();
		panelProfessor.add(new JLabel("Panell del pofessor"));

		
		
		JPanel panelDades = new JPanel();
		panelDades.add(new JLabel("Panell de Dades"));


		cards.add(panelAlumne,"alumneid");
		cards.add(panelProfessor,"professorid");
		cards.add(panelDades,"dadesid");
		
		//Menu
		JMenuBar barraMenu = new JMenuBar();
		JMenu menualumne = new JMenu("Alumne");
		JMenu menuprofessor = new JMenu("Professor");
		JMenu menudades = new JMenu("Dades");

		barraMenu.add(menualumne);
		barraMenu.add(menuprofessor);
		barraMenu.add(menudades);
		
		JMenuItem nouAlumne = new JMenuItem("Nou alumne");
		JMenuItem nouProfessor = new JMenuItem("Nou Professor");
		JMenuItem mostrarDades = new JMenuItem("Mostrar Dades");
		
		menualumne.add(nouAlumne);
		menuprofessor.add(nouProfessor);
		menudades.add(mostrarDades);
		
		//Modificació del panell mostrat
		
		CardLayout cl = (CardLayout)(cards.getLayout());
		
		nouAlumne.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards,"alumneid");
				
			}});
		
		nouProfessor.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards,"professorid");
				
			}});
		
		mostrarDades.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cl.show(cards,"dadesid");
				
			}});
		
		
		//Visualització
		

        panel.add(cards);
		frame.setSize(400,300);
		frame.setJMenuBar(barraMenu);
		frame.setVisible(true);



		

	}

}
