package Institut;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Institut extends JFrame {

	public static ArrayList<Professor> arrayprofessors;
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private cards cardPanel; // Panel with CardLayout
    private JTextArea textArea;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Institut frame = new Institut();
                    frame.setVisible(true);
                    arrayprofessors = new ArrayList<Professor>();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public Institut() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 797, 478);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        
        JMenu mnHome = new JMenu("Inici");
        menuBar.add(mnHome);
        
        JMenuItem mntmHome = new JMenuItem("Anar a inici");
        mnHome.add(mntmHome);
        
        mntmHome.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardPanel.showCard("homeid");
            }
        });
        
        JMenu mnProfessor = new JMenu("Professor");
        menuBar.add(mnProfessor);
        
        JMenuItem mntmNouProfessor = new JMenuItem("Nou Professor");
        mnProfessor.add(mntmNouProfessor);
        
        JMenuItem mntmBorrarProfessor = new JMenuItem("Borrar Professor");
        mnProfessor.add(mntmBorrarProfessor);
        
        JMenuItem mntmmostrarProfessors = new JMenuItem("Mostrar Professors");
        mntmmostrarProfessors.addFocusListener(new FocusAdapter() {
        	});
        mnProfessor.add(mntmmostrarProfessors);
        
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        cardPanel = new cards(); // Create an instance of the cards panel
        
        // Listener for JMenuItem to switch panels
        mntmNouProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardPanel.showCard("nouprofessorid");
            }
        });
        
        mntmBorrarProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardPanel.showCard("borrarprofessorid");
            }
        });
        
        mntmmostrarProfessors.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardPanel.showCard("mostrarprofessorid");
                textArea = new JTextArea();
                
                for(Professor p : Institut.arrayprofessors) {
                	textArea.append(p.toString());
                }
            }
        });
        
        
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addComponent(cardPanel, GroupLayout.DEFAULT_SIZE, 773, Short.MAX_VALUE)
        );
        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addComponent(cardPanel, GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
        );
        contentPane.setLayout(gl_contentPane);
    }
}
