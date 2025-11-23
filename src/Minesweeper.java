import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;

public class Minesweeper {

    private int rows = 9;
    private int columns = 9;
    private int numMines = 10;

    private int[][] mineGrid;
    private MSButton[][] msButtons;

    public Minesweeper() {
        // Initialize the underlying grid
        mineGrid = new int[rows][columns];
        msButtons = new MSButton[rows][columns];

        // Frame setup
        JFrame frame = new JFrame("Minesweeper");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel with grid layout
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(rows, columns));

        // Initialize buttons and add to panel
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                MSButton button = new MSButton();
                msButtons[r][c] = button;
                panel.add(button);
            }
        }

        frame.add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
