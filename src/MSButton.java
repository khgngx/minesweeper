import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

public class MSButton extends JButton {

    public MSButton() {
        super();
        // Set a preferred square size for the button
        setPreferredSize(new Dimension(40, 40));

        // Basic styling
        setFocusPainted(false);
        setBackground(new Color(220, 220, 220));
        setFont(new Font("Arial", Font.BOLD, 14));
    }
}
