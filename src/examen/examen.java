package examen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

public class examen {

	private JFrame frame;
	private JTextField textNombreMaxim;
	private JTextField textPP;
	private JTextField textPsoe;
	private JTextField textMxMe;
	private JTextField textVox;
	private JTextField textPodemos;
	private JTextField textCiudadanos;
	private JTextField textPodemosdef;
	private JTextField textVoxdef;
	JCheckBox chckbxPP = new JCheckBox("PP");
	
	JCheckBox chckbxPsoe = new JCheckBox("Psoe");
	
	JCheckBox chckbxMxme = new JCheckBox("MxMe");
	
	JCheckBox chckbxVox = new JCheckBox("Vox");
	
	JCheckBox chckbxPsoe_1_1 = new JCheckBox("Podemos");
	
	JCheckBox chckbxPsoe_1_2 = new JCheckBox("Ciudadanos");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examen window = new examen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public examen() {
		initialize();
		cargarInformacionDesdeArchivo();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblTitol = new JLabel("Cáluclo De Mayorias");
		lblTitol.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblConsellersPerMajoria = new JLabel("Consellers per majoria");
		lblConsellersPerMajoria.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		textNombreMaxim = new JTextField();
		textNombreMaxim.setColumns(10);
		
		
		
		textPP = new JTextField();
		textPP.setColumns(10);
		
		textPsoe = new JTextField();
		textPsoe.setColumns(10);
		
		textMxMe = new JTextField();
		textMxMe.setColumns(10);
		
		textVox = new JTextField();
		textVox.setColumns(10);
		
		textPodemos = new JTextField();
		textPodemos.setColumns(10);
		
		textCiudadanos = new JTextField();
		textCiudadanos.setColumns(10);
		
		textPodemosdef = new JTextField();
		textPodemosdef.setColumns(10);
		
		textVoxdef = new JTextField();
		textVoxdef.setColumns(10);
		
		JLabel lblMissatge = new JLabel("");
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int psoe =  Integer.parseInt(textPsoe.getText());
				int pp =  Integer.parseInt(textPP.getText());
				int mxme =  Integer.parseInt(textMxMe.getText());
				int vox =  Integer.parseInt(textVoxdef.getText());
				int podemos =  Integer.parseInt(textPodemosdef.getText());
				int ciudadanos =  Integer.parseInt(textCiudadanos.getText());
				int sumes = 0;
				String partits = "";
				
				if(chckbxPP.isSelected()) {
					sumes += pp;
					partits += " PP";
				}
				
				if(chckbxPsoe.isSelected()) {
					sumes += psoe;
					partits += " Psoe";
				}
				
				if(chckbxMxme.isSelected()) {
					sumes += mxme;
					partits += " MxMe";
				}
				
				if(chckbxVox.isSelected()) {
					sumes += vox;
					partits += " Vox";
				}
				
				if(chckbxPsoe_1_1.isSelected()) {
					sumes += podemos;
					partits += " Podemos";
				}
				
				if(chckbxPsoe_1_2.isSelected()) {
					sumes += ciudadanos;
					partits += " Ciudadanos";
				}
				
				int valormaxim = Integer.parseInt(textNombreMaxim.getText()); 
				
				if(valormaxim > sumes) {
					lblMissatge.setText("Els partits " + partits + " no tenen majoria absoluta.");
				}else {
					lblMissatge.setText("Els partits " + partits + " tenen majoria absoluta.");
				}
			}
		});
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				chckbxPP.setSelected(false);
				chckbxPsoe_1_2.setSelected(false);
				chckbxPsoe_1_1.setSelected(false);
				chckbxVox.setSelected(false);
				chckbxMxme.setSelected(false);
				chckbxPsoe.setSelected(false);
				textPsoe.setText("");
				textPP.setText("");
				textPodemosdef.setText("");
				textMxMe.setText("");
				textVoxdef.setText("");
				textCiudadanos.setText("");
				textNombreMaxim.setText("");
			}
		});
		
		JButton btnGuardarYCerrar = new JButton("Guardar y cerrar");
	    
	    btnGuardarYCerrar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	
	        	try (PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\unkiw\\Documents\\entornsgrafics\\src\\examen\\info"))) {
	                writer.println(textNombreMaxim.getText());
	                writer.println(textPP.getText());
	                writer.println(textPsoe.getText());
	                writer.println(textMxMe.getText());
	                writer.println(textVox.getText());
	                writer.println(textPodemos.getText());
	                writer.println(textCiudadanos.getText());
	                writer.println(textPodemosdef.getText());
	                writer.println(textVoxdef.getText());
	                writer.println(chckbxPP.isSelected());
	                writer.println(chckbxPsoe.isSelected());
	                writer.println(chckbxMxme.isSelected());
	                writer.println(chckbxVox.isSelected());
	                writer.println(chckbxPsoe_1_1.isSelected());
	                writer.println(chckbxPsoe_1_2.isSelected());
	            } catch (IOException ex) {
	                ex.printStackTrace();
	                JOptionPane.showMessageDialog(frame, "Error al guardar la combinación.", "Error", JOptionPane.ERROR_MESSAGE);
	            }
	            JOptionPane.showMessageDialog(frame, "Combinación guardada exitosamente.", "Guardar Combinación", JOptionPane.INFORMATION_MESSAGE);
	            // Cerrar la ventana después de guardar la combinación
	            frame.dispose();
	        }
	    });
		
		JLabel lblImgPP = new JLabel("");
		lblImgPP.setIcon(new ImageIcon("C:\\Users\\unkiw\\Documents\\entornsgrafics\\src\\examen\\img\\PP40.png"));
		
		JLabel lblNewLabel_1 = new JLabel("");
		
		JLabel lblImgPP_1 = new JLabel("");
		lblImgPP_1.setIcon(new ImageIcon("C:\\Users\\unkiw\\Documents\\entornsgrafics\\src\\examen\\img\\psoe40.png"));
		
		JLabel lblImgPP_2 = new JLabel("");
		lblImgPP_2.setIcon(new ImageIcon("C:\\Users\\unkiw\\Documents\\entornsgrafics\\src\\examen\\img\\mes40.jpg"));
		
		JLabel lblImgPP_3 = new JLabel("");
		lblImgPP_3.setIcon(new ImageIcon("C:\\Users\\unkiw\\Documents\\entornsgrafics\\src\\examen\\img\\VOX40.png"));
		
		JLabel lblImgPP_4 = new JLabel("");
		lblImgPP_4.setIcon(new ImageIcon("C:\\Users\\unkiw\\Documents\\entornsgrafics\\src\\examen\\img\\podemos40.png"));
		
		JLabel lblImgPP_5 = new JLabel("");
		lblImgPP_5.setIcon(new ImageIcon("C:\\Users\\unkiw\\Documents\\entornsgrafics\\src\\examen\\img\\ciudadanos40.png"));
		
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(39)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblMissatge, GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 232, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnComprobar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 209, Short.MAX_VALUE)
									.addComponent(btnLimpiar, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
									.addGap(182))))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap(116, Short.MAX_VALUE)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addComponent(lblImgPP_2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
										.addGroup(groupLayout.createSequentialGroup()
											.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(lblImgPP_1, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
										.addComponent(lblImgPP))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(chckbxPP, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(chckbxPsoe, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(chckbxMxme, Alignment.TRAILING)))
								.addComponent(lblConsellersPerMajoria, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textNombreMaxim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(textMxMe, 0, 0, Short.MAX_VALUE)
										.addComponent(textPsoe, 0, 0, Short.MAX_VALUE)
										.addComponent(textPP, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(lblImgPP_4, 0, 0, Short.MAX_VALUE)
											.addComponent(lblImgPP_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addComponent(lblImgPP_5))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxPsoe_1_2)
										.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
											.addComponent(chckbxVox, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(chckbxPsoe_1_1, Alignment.LEADING)))))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(textCiudadanos, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(6)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(textVoxdef, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
										.addComponent(textPodemosdef, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))))
							.addGap(83)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
							.addComponent(textVox, 0, 0, Short.MAX_VALUE)
							.addComponent(textPodemos, 0, 0, Short.MAX_VALUE))
						.addComponent(btnGuardarYCerrar))
					.addGap(92))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(273)
					.addComponent(lblTitol)
					.addContainerGap(370, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblTitol)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(89)
							.addComponent(textVox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(textPodemos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(51)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblConsellersPerMajoria)
								.addComponent(textNombreMaxim, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(10)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblImgPP_3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblImgPP_4, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblImgPP_5, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(chckbxPP)
										.addComponent(chckbxVox)
										.addComponent(textPP, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textVoxdef, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(chckbxPsoe)
										.addComponent(chckbxPsoe_1_1)
										.addComponent(textPsoe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textPodemosdef, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
									.addGap(18)
									.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(chckbxMxme)
										.addComponent(chckbxPsoe_1_2)
										.addComponent(textMxMe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addComponent(textCiudadanos, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblImgPP)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblImgPP_1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
									.addGap(22)
									.addComponent(lblImgPP_2, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))))
					.addGap(35)
					.addComponent(lblMissatge, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnComprobar)
						.addComponent(btnGuardarYCerrar)
						.addComponent(btnLimpiar))
					.addContainerGap(43, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	private void cargarInformacionDesdeArchivo() {
	    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\unkiw\\Documents\\entornsgrafics\\src\\examen\\info"))) {
	        textNombreMaxim.setText(reader.readLine());
	        textPP.setText(reader.readLine());
	        textPsoe.setText(reader.readLine());
	        textMxMe.setText(reader.readLine());
	        textVox.setText(reader.readLine());
	        textPodemos.setText(reader.readLine());
	        textCiudadanos.setText(reader.readLine());
	        textPodemosdef.setText(reader.readLine());
	        textVoxdef.setText(reader.readLine());
	        chckbxPP.setSelected(Boolean.parseBoolean(reader.readLine()));
	        chckbxPsoe.setSelected(Boolean.parseBoolean(reader.readLine()));
	        chckbxMxme.setSelected(Boolean.parseBoolean(reader.readLine()));
	        chckbxVox.setSelected(Boolean.parseBoolean(reader.readLine()));
	        chckbxPsoe_1_1.setSelected(Boolean.parseBoolean(reader.readLine()));
	        chckbxPsoe_1_2.setSelected(Boolean.parseBoolean(reader.readLine()));
	    } catch (FileNotFoundException e) {

	    } catch (IOException e) {
	        e.printStackTrace();
	        JOptionPane.showMessageDialog(frame, "Error al cargar la información del archivo.", "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}
	









}
