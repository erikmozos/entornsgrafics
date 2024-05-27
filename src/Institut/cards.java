package Institut;

import java.awt.CardLayout;
import javax.swing.JPanel;

public class cards extends JPanel {

    private static final long serialVersionUID = 1L;
    private CardLayout cardLayout;

    /**
     * Create the panel.
     */
    public cards() {
        cardLayout = new CardLayout();
        this.setLayout(cardLayout);
        
        // Create and add panels
        JPanel homePanel = new home(); // Assume this class exists
        this.add(homePanel, "homeid");
        
        JPanel nouProfessorPanel = new nouProfessor();
        this.add(nouProfessorPanel, "professorid");
    }

    // Method to show a specific card
    public void showCard(String card) {
        cardLayout.show(this, card);
    }
}
