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
        cargarProfessors();
    }

    public void cargarProfessors() {
        List<Professor> professors = nouProfessor.professors;
        textArea.setText(""); // Limpiar el JTextArea antes de agregar nuevas filas
        for (Professor professor : professors) {
            textArea.append("Nom: " + professor.getNom() + "\n");
            textArea.append("DNI: " + professor.getDni() + "\n");
            textArea.append("Edat: " + professor.getEdat() + "\n");
            textArea.append("Assignatura: " + professor.getAssignaturaDonada() + "\n");
            textArea.append("\n"); // Línea en blanco entre profesores
        }
    }

    public void actualizarDatos() {
        cargarProfessors();
    }
}
