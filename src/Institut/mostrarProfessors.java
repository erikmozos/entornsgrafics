package Institut;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class mostrarProfessors extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextArea textArea;

    public mostrarProfessors() {
        JScrollPane scrollPane = new JScrollPane();
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 450, GroupLayout.PREFERRED_SIZE)
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
        );
        
        
        }
    
    
}
