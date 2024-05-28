package Institut;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.util.List;

public class mostrarProfessors extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextArea textArea;

    public mostrarProfessors() {
        textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        setLayout(new java.awt.BorderLayout());
        add(scrollPane, java.awt.BorderLayout.CENTER);
}
}
