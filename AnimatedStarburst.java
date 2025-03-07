import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class AnimatedStarburst extends JPanel {
    
    private int maxRadius;  // Maximum expansion size
    private int radius = 10; // Initial size
    private Timer timer;

    
    public AnimatedStarburst() {
        timer = new Timer(50, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                radius +=5;  // Increase the size of lines
                if (radius > maxRadius) {
                    radius = 20;  // Reset to start over
                }
                repaint();
            }
        });
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(new Color((int)(Math.random() * 255), (int)(Math.random() * 255), (int)(Math.random() * 255)));

        int width = getWidth();
        int height = getHeight();
        maxRadius = Math.min(width, height) / 2;
        int centerX = width / 2;
        int centerY = height / 2;

        // Draw starburst lines expanding outward
        for (int angle = 0; angle < 360; angle += 15) { // Lines at 15-degree intervals
            double rad = Math.toRadians(angle);
            int x2 = centerX + (int) (radius * Math.cos(rad));
            int y2 = centerY + (int) (radius * Math.sin(rad));
            g.drawLine(centerX, centerY, x2, y2);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("iPhone");
        AnimatedStarburst panel = new AnimatedStarburst();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
