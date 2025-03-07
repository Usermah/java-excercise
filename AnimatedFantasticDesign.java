import javax.swing.*;
import java.awt.*;

public class AnimatedFantasticDesign extends JPanel {
    private int steps = 30;
    private int animationStep = 0;

    public AnimatedFantasticDesign() {
        Timer timer = new Timer(100, e -> {
            animationStep++;
            repaint();
        });
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int width = getWidth();
        int height = getHeight();
        int dynamicSteps = steps + (animationStep % 20); // Animate steps

        // Create a gradient-like effect
        for (int i = 0; i <= dynamicSteps; i++) {
            int x = i * width / dynamicSteps;
            int y = i * height / dynamicSteps;

            // Change colors dynamically
            g.setColor(new Color((i * 255 / dynamicSteps) % 255, (animationStep * 10) % 255, 200));

            // Draw dynamic intersecting lines
            g.drawLine(0, y, x, height);
            g.drawLine(x, 0, width, y);
            g.drawLine(width - x, 0, 0, height - y);
            g.drawLine(width, height - y, width - x, height);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("🔥 Animated Fantastic Design 🔥");
        AnimatedFantasticDesign panel = new AnimatedFantasticDesign();
        frame.add(panel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
