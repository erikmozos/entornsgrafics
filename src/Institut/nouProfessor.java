package Institut;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class nouProfessor extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField textFieldDni;
    private JTextField textFieldNom;
    private JTextField textFieldEdat;
    private JTextField textFieldAssignatura;

    // Lista estática para almacenar profesores


    public nouProfessor() {

        JLabel lblTitol = new JLabel("DADES DEL PROFESSOR");
        lblTitol.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitol.setFont(new Font("Tahoma", Font.PLAIN, 24));

        JLabel lblDni = new JLabel("DNI");
        lblDni.setFont(new Font("Tahoma", Font.BOLD, 14));

        textFieldDni = new JTextField();
        textFieldDni.setColumns(10);

        JLabel lblNom = new JLabel("NOM");
        lblNom.setFont(new Font("Tahoma", Font.BOLD, 14));

        textFieldNom = new JTextField();
        textFieldNom.setColumns(10);

        JLabel lblEdat = new JLabel("EDAT");
        lblEdat.setFont(new Font("Tahoma", Font.BOLD, 14));

        textFieldEdat = new JTextField();
        textFieldEdat.setColumns(10);

        JLabel lblAssignatura = new JLabel("ASSIGNATURA DONADA");
        lblAssignatura.setFont(new Font("Tahoma", Font.BOLD, 14));

        textFieldAssignatura = new JTextField();
        textFieldAssignatura.setColumns(10);

        JButton btnAcceptar = new JButton("ACCEPTAR");
        btnAcceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearProfessor();
            }
        });

        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(lblAssignatura, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lblEdat))
        							.addGap(34))
        						.addGroup(groupLayout.createSequentialGroup()
        							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(lblDni, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        								.addComponent(lblNom, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
        							.addGap(37)))
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(textFieldDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(textFieldAssignatura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(textFieldEdat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(textFieldNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(291))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(btnAcceptar, GroupLayout.PREFERRED_SIZE, 114, GroupLayout.PREFERRED_SIZE)
        					.addGap(19))))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(109)
        			.addComponent(lblTitol, GroupLayout.PREFERRED_SIZE, 261, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(234, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lblTitol)
        			.addGap(46)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(textFieldDni, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblDni))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNom)
        				.addComponent(textFieldNom, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblEdat)
        				.addComponent(textFieldEdat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblAssignatura)
        				.addComponent(textFieldAssignatura, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(90)
        			.addComponent(btnAcceptar)
        			.addGap(73))
        );
        setLayout(groupLayout);
    }

    private void crearProfessor() {
    	String dni = textFieldDni.getText();
        String nom = textFieldNom.getText();
        int edat;
        
        edat = Integer.parseInt(textFieldEdat.getText());
        
        String assignatura = textFieldAssignatura.getText();

        Professor professor = new Professor(nom, dni, edat, assignatura);
        
        Institut.arrayprofessors.add(professor);
        
    }
}
