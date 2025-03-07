import java.awt.*;
import javax.swing.*;

public class FantasticDesign extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int steps = 100; // More steps for better detail

        g.setColor(Color.CYAN); // Cool color
        for (int i = 0; i <= steps; i++) {
            int x = i * width / steps;
            int y = i * height / steps;

            // Connect points across the panel to create a fantastic pattern
            g.drawLine(0, y, x, height); // Top-left to bottom edge
            g.drawLine(x, 0, width, y); // Top-right to left edge
            g.drawLine(width - x, 0, 0, height - y); // Top-left mirrored
            g.drawLine(width, height - y, width - x, height); // Bottom-right mirrored
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Fantastic Geometric Design");
        FantasticDesign panel = new FantasticDesign();
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
